#include "pch.h"
#include <iostream>
#include <locale.h>

int i=0, n;

int main()
{
	setlocale(LC_ALL, "Portuguese");
	
	printf("Favor, informar um número inteiro positivo: ");
	scanf_s("%i", &n);
	printf("\n");
	n = n * 2;
	
	for (i = 1; i <= n; i++) {
		if (i % 2 != 0) {
			printf("%i\n", i);
		}
	}

	printf("\n");
	system("pause");
}