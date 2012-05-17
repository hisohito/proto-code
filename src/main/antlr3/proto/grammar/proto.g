grammar proto;

@header {
	package proto.grammar;
}

program
    : ( statement )* 
    ;
    
statement
    : interface_decl | class_decl | proto_decl 
    ;
    
proto_decl
    : 'prototype' ID '(' parameters ')' '{' ( spec_decl )* '}'
    ;

spec_decl
    : ('finally' | 'globally') spec_expression ';' | spec_expression ( 'until' | 'release' | 'if' ) spec_expression ';'
    ;
    
spec_expression
    : ( '(' or_spec ')' ) | ( or_spec )
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
    : ID ( '==' ID | '!=' ID  )*
    ;

interface_decl
    : 'interface' ID '{' ( method_decl )* '}'
    ;
    
method_decl
    : type ID '(' arguments ')' ';'
    ;
    
arguments
    : ( type ID ( ',' type ID )* )?
    ;
    
parameters
    : ( big_expression ( ',' big_expression )* )?
    ;
    
type
    : 'void' | 'state' array | 'number' array | 'bool' array | 'string' array | 'object' array
    ;
    
array
    : ( '[' ']' )*
    ;
    
class_decl
    : 'class' ID ( '<' ID ( ',' ID )* )? ( '<<' ID )? '{' ( ( method | field ) )* '}'
    ;
    
method
    : type ID '(' arguments ')' '{' ( operator )* '}'
    ;
    
field
    : type ID ( '=' big_expression )? ';'
    ;
    
operator
    : assignment ';' | buildin_operator | call ';' | if_operator | for_operator | while_operator | do_operator | '{' operator '}'
    ;
    
buildin_operator
    : print | die | return_operator
    ;
    
die
    : 'die' big_expression ';'
    ;
    
print
    : 'print' big_expression ';'
    ;
    
return_operator
    : 'return' big_expression ';'
    ;
    
assignment
    : ID ( '[' big_expression ']' )* '=' big_expression
    ;
    
call
    : ID '(' parameters ')'
    ;

big_expression
    : or_expression
    ;
    
or_expression
    : and_expression ( 'or' and_expression )?
    ;
    
and_expression
    : not_expression ( 'and' not_expression )?
    ;
        
not_expression
    : ( 'not' )? expression
    ;
    
expression
    : relation ( ( '==' | '!=' ) relation )*
    ;

relation
    : summand ( ('>' | '<' | '<=' | '>=') summand )*
    ;
    
summand
    : multiplier ( '+' multiplier | '-' multiplier )*
    ;
    
multiplier
    : simple_expression ( '*' simple_expression | '/' simple_expression )*
    ;
    
simple_expression
    : ID ( '[' expression ']' )* | INT | STRING | call | '[' parameters ']' | '(' expression ')' | 'nan' | 'nil' | 'new' ID '(' parameters ')'
    ;
    
if_operator
    : 'if' '(' expression ')' operator ( 'else' operator )?
    ;
    
for_operator
    : 'for' '(' assignment ';' expression ';'  assignment ')' operator
    ;
    
while_operator
    : 'while' '(' expression ')' operator
    ;
    
do_operator
    : 'do' '{' operator '}' 'while' '(' expression ')' ';'
    ;
    
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
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
