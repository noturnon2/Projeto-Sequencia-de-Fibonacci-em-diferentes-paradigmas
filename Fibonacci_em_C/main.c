#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int fibonacci(int n) {
	int fib = 0;
	
	if (n < 2)	
	return n;
	else	
    fib = fibonacci(n - 1) + fibonacci(n - 2);
    return fib;	
}

int main(int argc, char *argv[]) {
	int num;
	
	printf ("Digite um numero: ");
	scanf("%d",&num);
	
	if (num > 40)
	printf ("Digite um numero menor!");
	if (num < 0)	
	printf ("Nao e permitido numeros negativos");
	else
	printf ("Sequencia de Fibonacci equivalente: %d\n", fibonacci(num));
	
	system("pause");
	return 0;
}
