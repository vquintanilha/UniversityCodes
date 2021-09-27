#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int cont = 0;
float tamanhoChico = 1.50, tamanhoZe = 1.10;

int main()
{
	setlocale(LC_ALL, "Portuguese");

	while (tamanhoZe < tamanhoChico) {
		tamanhoChico = tamanhoChico + 0.02;
		tamanhoZe = tamanhoZe + 0.03;
		cont++;
	}

	printf("Serão necessários %d anos para Zé alcançar a altura de Chico!!!\n\n", cont);

	system("pause");
    return 0;
}