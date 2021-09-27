#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>

int mat1[3][3], mat2[3][3], i, j;

int main()
{
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 3; j++) {
			printf("Favor, preencha a matriz 1: Dados [%d][%d]: ", i + 1, j + 1);
			scanf_s("%d", &mat1[i][j]);
		}
	}
	system("cls");
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 3; j++) {
			printf("Favor, preencha a matriz 2: Dados [%d][%d]: ", i + 1, j + 1);
			scanf_s("%d", &mat2[i][j]);
		}
	}
	system("cls");
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 3; j++) {
			mat1[i][j] = mat1[i][j] + mat2[i][j];
			printf(" [%i][%i] = %i\n", i, j, mat1[i][j]);
		}
	}

	printf("\n");
	system("pause");
	return 0;
}