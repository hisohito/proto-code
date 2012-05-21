grammar Proto;

options { output=AST; }

@header {
	package proto.antlr;
	import proto.antlr.ClassNode;
	import proto.antlr.MethodNode;
	import proto.antlr.StateNode;
	import proto.antlr.CallNode;
	import proto.antlr.PrototypeNode;
	import proto.antlr.SpecNode;
	import java.util.HashMap;
	import java.util.LinkedList;
	import java.util.Stack;
}

@lexer::header {
	package proto.antlr;
}       

@members {
	Stack<HashMap<String, String>> scope = new Stack<HashMap<String, String>>() {{}};
	String scp;
}

program
    : ( statement )*
    ;
    
statement
    : interface_decl | class_decl | proto_decl 
    ;
    
proto_decl
    : 'prototype' ID '(' parameters ')' '{' ( spec_decl )* '}' -> ^(ID<PrototypeNode> ( spec_decl )* )
    ;

spec_decl
    : UNARY_SPEC+ spec_expression ';' -> ^(UNARY_SPEC<SpecNode> UNARY_SPEC* spec_expression) | spec_expression BINARY_SPEC spec_expression ';' -> ^(BINARY_SPEC<SpecNode> spec_expression  spec_expression)
    ;
    
UNARY_SPEC
    : 'finally' | 'globally'
    ;
    
BINARY_SPEC
    : 'until' | 'release' | 'if'
    ;
    
spec_expression
    : or_spec -> or_spec
    ;
    
or_spec
    : and_spec ( 'or' and_spec )?
    ;
and_spec
    : not_spec ( 'and' not_spec )?
    ;
    
not_spec
    : ( 'not' )? spec
    ;
    
spec
    : one_spec ( '==' | '!=' one_spec )*
    ;
    
one_spec
    : ID -> ID<SpecNode> | '(' spec_expression ')' -> spec_expression?
	;

interface_decl
    : 'interface' ID '{' ( method_decl )* '}' ->
    ;
    
method_decl
    : type ID '(' arguments ')' ';'
    ;
    
arguments
    : ( t=type i=ID { if(!scope.isEmpty()) scope.peek().put($i.text, $t.text); } ( ',' t=type i=ID { scope.peek().put($i.text, $t.text); } )* )?
    ;
    
parameters
    : ( big_expression ( ',' big_expression )* )? -> big_expression? (big_expression)?
    ;
    
type
    : 'void' | 'state' array  | 'number' array | 'bool' array | 'string' array | 'object' array | ID array
    ;
    
array
    : ( '[' ']' )*
    ;
    
class_decl
    : 'class' i=ID '(' arguments ')' ( '<' ID ( ',' ID )* )? ( '<<' ID )? '{' 
    		{ 
    			scope.push(new HashMap<String, String>()); 
    			scope.peek().put("self", $i.text); 
    		} 
       (body)* 
       		{
       			scope.pop();
       		} 
       	'}' 
       -> ^(ID<ClassNode> (body)*)
    ;

body
    : method | field
    ;
    
method
    : t=type ID { String classname = scope.peek().get("self"); scope.push(new HashMap<String, String>()); scope.peek().put("self", classname); } '(' arguments ')' '{' ( operator )* '}' {scope.pop();} -> {$t.text.equals("state")}? ^(ID<StateNode>[$ID, scope.peek().get("self")] (operator)* ) -> ^(ID<MethodNode>[$ID, scope.peek().get("self")] (operator)*)
    ;
    
field
    : t=type i=ID { scope.peek().put($i.text, $t.text); } ( '=' big_expression )? ';' -> big_expression?  
    ;
    
operator
    : field | assignment ';' -> assignment | buildin_operator | call ';' {scp=null;} -> call | if_operator | for_operator | while_operator | do_operator  | '{' ( operator )* '}' -> (operator)* 
    ;
    
buildin_operator
    : print | die | return_operator
    ;
    
die
    : 'die' big_expression ';' -> big_expression?
    ;
    
print
    : 'print' big_expression ';' -> big_expression?
    ;
    
return_operator
    : 'return' big_expression ';' -> big_expression?
    ;
    
assignment
    : ID ( '[' big_expression ']' )* '=' big_expression -> (big_expression)*
    ;
    
big_expression
    : or_expression
    ;
    
or_expression
    : and_expression ( 'or' and_expression )? -> (and_expression)*
    ;
    
and_expression
    : not_expression ( 'and' not_expression )? -> (not_expression)*
    ;
        
not_expression
    : ( 'not' )? expression -> expression?
    ;
    
expression
    : relation ( ( '==' | '!=' ) relation )? -> (relation)* 
    ;

relation
    : summand ( ('>' | '<' | '<=' | '>=') summand )? -> (summand)* 
    ;
    
summand
    : multiplier ( '+' multiplier | '-' multiplier )* -> (multiplier)*
    ;
    
multiplier
    : simple_expression ( '*' simple_expression | '/' simple_expression )* -> (simple_expression)*
    ;
    
simple_expression
    : ID ( '[' big_expression ']' )* ->| call | INT -> | STRING -> | '[' parameters ']' ->  parameters? | '(' big_expression ')' -> big_expression? | 'nan' -> | 'nil' -> | 'new' ID '(' parameters ')' -> parameters? | 'random' ( ID | INT ) ->
    ;

// { }
call
    : i=ID '(' parameters ')' 
    					{   
    						if($i.text.indexOf(".") != -1) { // if . in call
    							//System.out.println("call "+$i.text + " " + scope.size()); 
    							for(int j=scope.size()-1; j>=0; j--) { 
    								//System.out.println(scope.get(j));
    								if(!scope.get(j).isEmpty()) { 
    									String id = scope.get(j).get($i.text.substring(0, $i.text.indexOf("."))); 
    									if(id != null) {
    										scp=id;
    										//System.out.println("id = "+id);
    										break;
    									} 
    								}
    							} 
    						} else {
    							scp = scope.peek().get("self");
    						}
    					} 
    	-> ^( ID<CallNode>[$ID, scp] parameters? )
    ;

if_operator
    : 'if' '(' big_expression ')' operator ( 'else' operator )? -> big_expression? (operator)* 
    ;
    
for_operator
    : 'for' '(' assignment ';' big_expression ';'  assignment ')' operator -> assignment big_expression? assignment operator
    ;
    
while_operator
    : 'while' '(' big_expression ')' operator -> big_expression? operator
    ;
    
do_operator
    : 'do' '{' operator '}' 'while' '(' big_expression ')' ';' -> operator big_expression?
    ;
    
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'::'|'.')*
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;
    
fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
