header {
  // stuff that is placed at the top of <all> generated files
  == Tokens ==
	/* 	data types:		"number", "state", , "prototype", "string", "bool", "object"
	*	functions:		"random", "initialize", "finalize", "main"
	*	LTL:			"finally", "globally", "until", "release"
	*	"<", "<<", ",", ";", "+", "-", "*", "/", "=", "==", "!=", "(", ")", "]", "[", "::"
	*	buildin words:	"interface", "class", "return", "new"
	*/
}



== Grammar ==
<PROGRAM> ::= { <STATEMENT> }
<STATEMENT> ::= <INTERFACE_DECL> | <CLASS_DECL> | <PROTO_DECL>
<PROTO_DECL> ::= "prototype" <ID> "(" <PARAMETERS> ")" "{" { <SPEC_DECL> } "}"

<SPEC_DECL> ::= ("finally" | "globally") <SPEC_EXPRESSION> ";" | <SPEC_EXPRESSION> ( "until" | "release" | "if" ) <SPEC_EXPRESSION> ";"
<SPEC_EXPRESSION> ::= ( "(" <OR_SPEC> ")" ) | ( <OR_SPEC> )
<OR_SPEC> ::= <AND_SPEC> [ "or" <AND_SPEC> ]
<AND_SPEC> ::= <NOT_SPEC> [ "and" <NOT_SPEC> ]
<NOT_SPEC> ::= [ "not" ] <SPEC>
<SPEC> ::= ( <SPEC> ( ">" | "<" | "<=" | ">=" | "==" | "!=" ) <ID> ) | ( <ID> )

<INTERFACE_DECL> ::= "interface" <ID> "{" { <METHOD_DECL> } "}"
<METHOD_DECL> ::= <TYPE> <ID> "(" <ARGUMENTS> ")" ";"
<ARGUMENTS> :: = [ <TYPE> <ID> { "," <TYPE> <ID> } ]
<PARAMETERS> ::= [ <SIMPLE_EXPRESSION> { "," <SIMPLE_EXPRESSION> } ]  
<TYPE> ::= "void" | "state" | "number" | "bool" | "string" | "object" | <ARRAY_TYPE>
<ARRAY_TYPE> ::= <TYPE> "[" "]" { "[" "]" }
<CLASS_DECL> ::= "class" <ID> [ "<" <ID> { "," <ID> } ] [ "<<" <ID> ] "{" { (<METHOD> | <FIELD>) } "}"
<METHOD> ::= <TYPE> <ID> "(" <ARGUMENTS> ")" "{" { <OPERATOR> } "}"
<FIELD> ::= <TYPE> <ID> [ "=" <SIMPLE_EXPRESSION> ] ";"
<OPERATOR> ::= <ASSIGNMENT> ";" | <BUILDIN_OPERATOR> | <CALL> ";" | <IF> | <FOR> | <WHILE> | <DO> | "{" <OPERATOR> "}"
<BUILDIN_OPERATOR> ::= <PRINT> | <DIE> | <RETURN>
<DIE> ::= "die" <SIMPLE_EXPRESSION> ";"
<PRINT> ::= "print" <SIMPLE_EXPRESSION> ";"
<RETURN> ::= "return" <SIMPLE_EXPRESSION> ";"
<ASSIGNMENT> ::= <ID> { "[" <SIMPLE_EXPRESSION> "]" } "=" <SIMPLE_EXPRESSION>
<CALL> ::= <ID> "(" <PARAMETERS> ")"

<SIMPLE_EXPRESSION> ::= <OR_EXPRESSION>
<OR_EXPRESSION> ::= <AND_EXPRESSION> [ "or" <AND_EXPRESSION> ]
<AND_EXPRESSION> ::= <MATERIAL_EXPRESSION> [ "and" <MATERIAL_EXPRESSION> ]
<MATERIAL_EXPRESSION> ::= <NOT_EXPRESSION> [ "if" <NOT_EXPRESSION> ] // material condition A if B
<NOT_EXPRESSION> ::= [ "not" ] <EXPRESSION>
<EXPRESSION> ::= ( <EXPRESSION> ( ">" | "<" | "<=" | ">=" | "==" | "!=" ) <SUMMAND> ) | ( [ ( "+" | "-" ) ] <SUMMAND> )
<SUMMAND> ::= [ <SUMMAND> "+" | <SUMMAND> "-" ] <MULTIPLIER>
<MULTIPLIER> ::= [ <MULTIPLIER> "*" | <MULTIPLIER> "/" ] <SIMPLE_EXPRESSION>
<SIMPLE_EXPRESSION> ::= <ID> { "[" <EXPRESSION> "]" } | <NUMBER> | <STRING> | <CALL> | "[" <PARAMETERS> "]" | "(" <EXPRESSION> ")" | "nan" | "nil" | "new" <ID> "(" <PARAMETERS> ")" 

<IF> ::= "if" "(" <EXPRESSION> ")" <OPERATOR> [ "else" <OPERATOR> ]
<FOR> ::= "for" "(" <ASSIGNMENT> ";" <EXPRESSION> ";"  <ASSIGNMENT> ")" <OPERATOR>
<WHILE> ::= "while" "(" <EXPRESSION> ")" <OPERATOR>
<DO> ::= "do" "{" <OPERATOR> "}" "while" "(" <EXPRESSION> ")" ";"

//TODO change EXPRESSION