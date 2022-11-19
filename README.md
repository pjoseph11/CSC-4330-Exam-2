a.

token name: ops

These lexemes perform mathematical operations. 

regex: (+|-|*|/|%|<|>|<=|>=|==|!=)

integer code: 1

token name: integer literal

These lexemes are integer literals You must start with 1, 2, 4, 8 followed by an underscore to define the memory value. Then any number of digits for the actual value of the integer.  

regex: ^[1248]_\d*

integer code: 2

token name: variable

These lexemes are variable names of 6-8 length that can only contain letters and underscores.

regex: ^[a-zA-Z_]{6,8}$

integer code: 3

token name: loop

These lexemes can initiate while or for loops. They must start with the @ sign then can have any non digit character. 

regex: ^@[\D]*

integer code: 4


