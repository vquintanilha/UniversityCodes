#include "pch.h"
#include <iostream>
#include <locale.h>

int i, n;
double c = 0;

int main()
{
	printf("Favor, informe um numero inteiro: ");
	scanf_s("%d", &n);

	for (i = 0; i < n; i++) {
		c = (c * 10) + (i + 1);
		printf("%0.f\n", c);
	}

	for (i = n; i > 1; i--) {
		c = (c - i) / 10;
		printf("%0.f\n", c);
	}

	system("pause");
	return 0;
}