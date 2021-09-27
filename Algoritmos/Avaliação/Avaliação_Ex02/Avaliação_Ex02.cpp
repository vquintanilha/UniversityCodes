#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>

int n[10] /* o vetor esta com 10 posicoes, pois estamos comecando o for com uma posicao a mais */, numero, i;

int main()
{
	printf("Favor, insira um numero inteiro (entre 1 e 9): ");
	scanf_s("%i", &numero);

	n[0] = 0;
	n[1] = 1;

	for (i = 2; i <= numero; i++) {
		n[i] = n[i - 1] + n[i - 2];
	}

	for (i = 1; i <= numero; i++) {
		printf("\n%i", n[i]);
	}

	printf("\n\n");
	system("pause");
    return 0;
}

