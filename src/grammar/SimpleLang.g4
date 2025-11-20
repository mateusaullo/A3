grammar SimpleLang;

// -------------------- Parser rules (entrada principal) --------------------

program
    : statement* EOF
    ;

// Statements
statement
    : varDecl SEMICOLON
    | assignment SEMICOLON
    | ifStatement
    | whileStatement
    | forStatement
    | doWhileStatement
    | printStatement SEMICOLON
    | readStatement SEMICOLON
    | block
    ;

// Variable declaration: type id (= expr)?
varDecl
    : type ID (ASSIGN expr)?
    ;

// Assignment: id = expr
assignment
    : ID ASSIGN expr
    ;

// If / if-else
ifStatement
    : IF LPAREN expr RPAREN block (ELSE block)?
    ;

// While
whileStatement
    : WHILE LPAREN expr RPAREN block
    ;

// For: for ( init? ; cond? ; update? ) block
forStatement
    : FOR LPAREN forInit? SEMICOLON forCond? SEMICOLON forUpdate? RPAREN block
    ;

forInit
    : varDecl
    | assignment
    ;

forCond
    : expr
    ;

forUpdate
    : assignment
    ;

// Do-while
doWhileStatement
    : DO block WHILE LPAREN expr RPAREN SEMICOLON
    ;

// Print: printf(expr, expr, ...);
printStatement
    : PRINTF LPAREN expr (COMMA expr)* RPAREN
    ;

// Read: scanf(id, id, ...);
readStatement
    : SCANF LPAREN ID (COMMA ID)* RPAREN
    ;

// Block: { statement* }
block
    : LBRACE statement* RBRACE
    ;

// -------------------- Expressions (precedence, no left recursion) --------------------

expr
    : logicalOr
    ;

logicalOr
    : logicalAnd ( OR logicalAnd )*
    ;

logicalAnd
    : equality ( AND equality )*
    ;

equality
    : relational ( (EQ | NEQ) relational )*
    ;

relational
    : additive ( (LT | LTE | GT | GTE) additive )*
    ;

additive
    : multiplicative ( (PLUS | MINUS) multiplicative )*
    ;

multiplicative
    : unary ( (MULT | DIV | MOD) unary )*
    ;

unary
    : (NOT | PLUS | MINUS) unary
    | primary
    ;

primary
    : NUMBER
    | STRING_LITERAL
    | ID
    | LPAREN expr RPAREN
    ;

// -------------------- Types --------------------

type
    : INT_TYPE
    | FLOAT_TYPE
    | STRING_TYPE
    ;

// -------------------- Lexer rules --------------------

// Keywords
IF          : 'if' ;
ELSE        : 'else' ;
WHILE       : 'while' ;
FOR         : 'for' ;
DO          : 'do' ;
PRINTF      : 'printf' ;
SCANF       : 'scanf' ;

// Types (explicit tokens so keywords and types distinct)
INT_TYPE    : 'int' ;
FLOAT_TYPE  : 'float' ;
STRING_TYPE : 'string' ;

// Operators and punctuation
PLUS        : '+' ;
MINUS       : '-' ;
MULT        : '*' ;
DIV         : '/' ;
MOD         : '%' ;

EQ          : '==' ;
NEQ         : '!=' ;
LT          : '<' ;
GT          : '>' ;
LTE         : '<=' ;
GTE         : '>=' ;

AND         : '&&' ;
OR          : '||' ;
NOT         : '!' ;

ASSIGN      : '=' ;

LPAREN      : '(' ;
RPAREN      : ')' ;
LBRACE      : '{' ;
RBRACE      : '}' ;
SEMICOLON   : ';' ;
COMMA       : ',' ;

// Literals and identifiers
NUMBER
    : DIGIT+ ('.' DIGIT+)?    // integers or decimals (e.g. 123 or 12.34)
    ;

STRING_LITERAL
    : '"' ( ~["\\] | '\\' . )* '"'
    ;

ID
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

// Comments and whitespace (skipped)
LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

// Helper
fragment DIGIT : [0-9] ;