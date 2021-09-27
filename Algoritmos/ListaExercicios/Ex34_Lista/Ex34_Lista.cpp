#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int i, num, maiorValor, menorValor;

int main()
{
	setlocale(LC_ALL, "Portuguese");

	printf("Favor, digite um número: ");
	scanf_s("%d", &num);
	
	maiorValor = num;
	menorValor = num;

	for (i = 0; i < 49; i++) {

		printf("Favor, digite um número: ");
		scanf_s("%d", &num);

		if (num > maiorValor) {
			maiorValor = num;
		}
		if (num < menorValor) {
			menorValor = num;
		}
	}
	system("cls");

	printf("Menor valor: %d\n", menorValor);
	printf("Maior valor: %d\n\n", maiorValor);
	
	system("pause");
	return 0;
}