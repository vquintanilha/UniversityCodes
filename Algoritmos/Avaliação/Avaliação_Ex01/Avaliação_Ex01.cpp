#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>

float a, b, c, h;

int main()
{
	printf("Favor, insira o primeiro valor: ");
	scanf_s("%f", &c);
	printf("Favor, insira o segundo valor: ");
	scanf_s("%f", &b);
	printf("Favor, insira o terceiro valor: ");
	scanf_s("%f", &h);

	a = c + b;
	a = a * h;
	a = a / 2;

	printf("\nO resultado da area do trapezio e: %.2f\n\n", a);

	system("pause");
    return 0;
}