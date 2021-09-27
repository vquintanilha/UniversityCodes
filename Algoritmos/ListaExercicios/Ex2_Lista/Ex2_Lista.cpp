#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int a, b, c;
float r, s, d;

int main()
{
	setlocale(LC_ALL, "Portuguese");
	printf("Favor, escreva um número inteiro positivo: ");
	scanf_s("%i", &a);
	printf("Favor, escreva um número inteiro positivo: ");
	scanf_s("%i", &b);
	printf("Favor, escreva um número inteiro positivo: ");
	scanf_s("%i", &c);
    
	r = (a + b)*(a + b);
	s = (b + c)*(b + c);

	d = (r + s) / 2;

	printf("\nO resultado da expressão é: %.2f\n\n", d);

	system("pause");
	return 0;
}