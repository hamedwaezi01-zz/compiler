grammar MiniJava;

program
:	(mainClass) (classDeclaration | interfaceDeclaration)* EOF
;

mainClass
:	'class' className = Identifier '{' mainMethod '}';

mainMethod:
 'public' 'static' 'void' 'main' '(' parameter ')' '{' statement* '}'
;
classDeclaration
:	 'class' className = Identifier ('extends' parentName = Identifier)? ( 'implements' Identifier ( ',' Identifier)* )? '{' fieldDeclaration* methodDeclaration* '}';

interfaceDeclaration: 'interface' interfaceName = Identifier '{' fieldDeclaration* interfaceMethodDeclaration*	'}';

interfaceMethodDeclaration
:	 (accessModifier)? returnType methodName = Identifier '(' parameterList? ')' ';';

fieldDeclaration
:	 (accessModifier)? (Final)? type fieldName = Identifier (EQ expression)?';'
;
localDeclaration
:	type verName = Identifier ';';

methodDeclaration
:	(Override)? (accessModifier)? returnType methodName = Identifier '(' parameterList? ')' '{' methodBody '}';

parameterList
:   parameter (',' parameter)*
;

parameter
:   type Identifier
;

methodBody
:	 statement* (RETURN expression ';')?
;

type
: (javaType | Identifier) (LSB RSB)? ;


javaType
:   'boolean'
#booleanType
|	'int'
#intType
;

returnType
:   type
|   'void'
;

accessModifier
:   'private'
|   'public'
;


statement
:	'{' statement* '}'
#nestedStatement
|	'if' LP expression RP ifBlock ('else' elseBlock)?
#ifElseStatement
|	'while' LP expression RP whileBlock
#whileStatement
|	'System.out.println' LP  expression RP ';'
#printStatement
|	expression EQ expression ';'
#variableAssignmentStatement
|	Identifier LSB expression RSB EQ expression ';'
#arrayAssignmentStatement
|   localDeclaration
#localVarDeclaration
|expression ';'
#expressioncall
;

ifBlock
:	statement
;

elseBlock
:	statement
;

whileBlock
:	statement
;

expression
:  expression LSB index = expression RSB
# arrayAccessExpression

|  expression DOTLENGTH
# arrayLengthExpression

|  expression '.' Identifier LP ( expression ( ',' expression )* )? RP
# methodCallExpression

|  expression '.' Identifier
# fieldCallExpression

|   NOT expression
# notExpression

|   'new' (Identifier | 'int' | 'boolean') LSB expression RSB
# arrayInstantiationExpression

|  '{' IntegerLiteral ( ',' IntegerLiteral)* '}'
# intarrayInstantiationExpression

|   'new' Identifier LP RP
# objectInstantiationExpression

|	l = expression POWER r = expression
# powExpression

|   l = expression TIMES r = expression
# mulExpression

|   l = expression PLUS r = expression
# addExpression

|   l = expression MINUS r = expression
# subExpression

|   l = expression LT r = expression
# ltExpression

|   l = expression AND r = expression
# andExpression

|   IntegerLiteral
# intLitExpression

|   BooleanLiteral
# booleanLitExpression

|   NullLiteral
# nullLitExpression

|   Identifier
# identifierExpression

|   String
# stringLitExpression

|   'this'
# thisExpression

|   LP expression RP
# parenExpression
;

AND:'&&';
LT:'<';
PLUS:'+';
MINUS:'-';
TIMES:'*';
POWER:'**';
NOT:'!';
LSB:'[';
RSB:']';
DOTLENGTH:'.length';
LP:'(';
RP:')';
RETURN: 'return';
EQ: '=';
Final: 'final';

BooleanLiteral
:	'true'
|	'false'
;

IntegerLiteral
:	DecimalIntegerLiteral
;

NullLiteral: 'null';

Identifier
:	JavaLetter JavaLetterOrDigit*
;

String
:   '"' (~'"')* '"'
;

Override
: '@Override'
;

fragment
JavaLetter
:	[a-zA-Z$_] // these are the 'java letters' below 0xFF
;

fragment
JavaLetterOrDigit
:	[a-zA-Z0-9$_] // these are the 'java letters or digits' below 0xFF
;


fragment
DecimalIntegerLiteral
:	DecimalNumeral IntegertypeSuffix?
;

fragment
IntegertypeSuffix
:	[lL]
;

fragment
DecimalNumeral
	:	'0'
|	NonZeroDigit (Digits? | Underscores Digits)
	;

	fragment
	Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

	fragment
	Digit
	:	'0'
	|	NonZeroDigit
	;

	fragment
	NonZeroDigit
	:	[1-9]
	;

	fragment
	DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

	fragment
	DigitOrUnderscore
	:	Digit
	|	'_'
	;

	fragment
	Underscores
	:	'_'+
	;

	WS
	:   [ \r\t\n]+ -> skip
	;

	MULTILINE_COMMENT
	:  '/*' .*? '*/' -> skip
	;
	LINE_COMMENT
	:  '//' .*? '\n' -> skip
	;
