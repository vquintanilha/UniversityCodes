#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int idade, anos, meses, dias;

int main()
{
	setlocale(LC_ALL, "Portuguese");
	printf("Favor, escreva sua idade expressa em dias: ");
	scanf_s("%i", &idade);
    
	anos = idade / 365;
	meses = (idade - (anos * 365)) / 30;
	dias = idade - ((anos * 365) + (meses * 30));

	printf("\nVoc� j� viveu %i anos\n", anos);
	printf("Voc� j� viveu %i meses\n", meses);
	printf("Voc� j� viveu %i dias\n\n", dias);

	system("pause");
	return 0;
}