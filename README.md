**a.**

**token name: ops**

These lexemes perform mathematical operations. 

regex: (+|-|*|/|%|<|>|<=|>=|==|!=)

integer code: 1

**token name: integer literal**

These lexemes are integer literals You must start with 1, 2, 4, 8 followed by an underscore to define the memory value. Then any number of digits for the actual value of the integer.  

regex: ^[1248]_\d*

integer code: 2

**token name: variable**

These lexemes are variable names of 6-8 length that can only contain letters and underscores.

regex: ^[a-zA-Z_]{6,8}$

integer code: 3

**token name: loop**

These lexemes can initiate while or for loops. They must start with the @ sign then can have any alphanumeric character and must end in a left curly bracket to set up the condition.  

regex: ^@\w*{

integer code: 4

**token name: declaration**

These lexemes assign what kind of data will be given to a variable. They must start with the @ sign then can have any alphanumeric character. 

regex: ^![\w]*

integer code: 5

**token name: selection statement**

These lexemes can initiate selection statements like if/else. The primary condition must start with ## and the conditional must start with !#. 

regex: ^(##|!#)[\w]*

integer code: 6

**token name: Start Stop**

These lexemes can start and end a program. Start must start with $$ End must start with !$ then you can have any alphanumeric characters. 

regex: ^($$|!$)[\w]*

integer code: 7

**b.**

E &rarr; E + T

E &rarr; T

T &rarr; T * F

T &rarr; F

F &rarr; F / A

F &rarr; A

A &rarr; A - B

A &rarr; B

B &rarr; C

C &rarr; id

C &rarr; ( E )

<stmt> &rarr; <loop_stmt> | <if_stmt> | <declareVar_stmt>
<loop_stmt> &rarr; '^@\w*{' <bool_exp> } <stmt>
<if_stmt> &rarr; ^(##|!#)[\w]* < bool_expr> <stmt>
<declareVar_stmt> &rarr; ^![\w]* '^[a&rarr;zA&rarr;Z_]{6,8}$' | ^![\w]* '^[a&rarr;zA&rarr;Z_]{6,8}$' <value_stmt>

**c.**
  
  

