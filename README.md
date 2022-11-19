a.

These lexemes perform mathematical operations. 

token name: ops

regex: (+|-|*|/|%|<|>|<=|>=|==|!=)

integer code: 1

These lexemes are integer literals You must start with 1, 2, 4, 8 followed by an underscore to define the memory value. Then any number of digits for the actual value of the integer.  

token name: integer literal

regex: ^[1248]_\d*

integer code: 2

These lexemes are variable names that can only contain letters and underscores.

token name: variable

regex: ^[a-zA-Z_]{6,8}$
