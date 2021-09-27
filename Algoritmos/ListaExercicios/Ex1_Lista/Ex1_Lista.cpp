#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

float d, xUm, yUm, xDois, yDois, result;

int main()
{
	setlocale(LC_ALL, "Portuguese");
	printf("Favor informar x1: ");
	scanf_s("%f", &xUm);
	printf("Favor informar x2: ");
	scanf_s("%f", &xDois);
	printf("Favor informar y1: ");
	scanf_s("%f", &yUm);
	printf("Favor informar y2: ");
	scanf_s("%f", &yDois);

	d = ((xDois - xUm)*(xDois - xUm)) + ((yDois - yUm)*(yDois - yUm));
	result = sqrt(d);
	printf("\nA distância entre os dois pontos é %f\n\n", result);

	system("pause");
	return 0;
}