#include "pch.h"
#include <iostream>
#include <locale.h>

int i=0, n, cont;

int main()
{
	setlocale(LC_ALL, "Portuguese");
	printf("Favor, escreva um número inteiro positivo: ");
	scanf_s("%i", &n);

	for (i = 1; i <= n; i++) {
		cont = cont + i;
	}

	printf("\nA soma dos %i primeiros números inteiros é: %i\n\n", n, cont);

	system("pause");
}