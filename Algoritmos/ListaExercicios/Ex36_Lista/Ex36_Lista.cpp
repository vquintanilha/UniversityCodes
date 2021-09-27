#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//int n[20], i, result[20];

int main()
{
	setlocale(LC_ALL, "Portuguese");

	int n = 0, i = 0, j = 0;

	for (i = 0; i < 20; i++) {
		printf("\nInforme um número inteiro (%i / 20): ", i + 1);
		scanf_s("%i", &n);
		for (j = 0; j < n; j++) {
			printf("\n%i x %i = %i", j + 1, n, (j + 1)*n);
		}
		printf("\n");
	}
	printf("\n");


	/*for (i = 0; i < 20; i++) {
		printf("Informe o valor %d: ", i + 1);
		scanf_s("%d", &n[i]);

		result[i] = n[i] * i;
	}

	printf("\n");

	for (i = 0; i < 20; i++) {
		printf("%d x %d = %d\n", i, n[i], result[i]);
	}

	printf("\n");*/

	system("pause");
	return 0;
}