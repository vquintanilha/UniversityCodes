#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
	setlocale(LC_ALL, "Portuguese");

	int *x, valor, y;
	valor = 35;
	x = &valor;
	y = *x;
	valor = 36;

	printf("Endere�o da vari�vel comum valor: %p\n", &valor);
	printf("Lendo o conte�do do ponteiro x: %p\n", x);
	printf("Endere�o da vari�vel ponteiro x: %p\n", &x);
	printf("Conte�do da vari�vel apontada por x: %d\n", *x);
	printf("Conte�do da vari�vel comum y: %d\n\n", y);
	
	system("pause");
    return 0;
}