%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%
%%%    Author: Luiz Cardineli, 14 de Outubro de 2014 - Rio de Janeiro - RJ
%%%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


fib(0,0).
fib(1,1).

fib(N, X) :-

N > 1,
N2 is N - 2, fib(N2, X2),
N1 is N - 1, fib(N1, X1),
X is X1 + X2.