#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
//Funcao sem parametros e sem retorno
void HelloWorld()
{
	printf("\nHello World!\n");
}
//Criacao da funcao
int Somar2Valores(int x, int y)
{
	int c;
	c = x + y;
	return c;
}
//Funcao recebendo valor
int LerNumeroInteiro()
{
	printf("Favor digitar um numero inteiro: ");
	int numero;
	scanf_s("%i", &numero);
	return numero;
}
int main()
{
	setlocale(LC_ALL, "Portuguese");
	//Funcao sem parametros e sem retorno
	HelloWorld();
	//Printando o retorno da funcao
	int a = Somar2Valores(55, 44);
	printf("Resultado da soma: %i\n\n", a);

	/*
	//Inserindo valores na funcao

	int primeiroValor = 13;
	int segundoValor = 17;
	int a = Somar2Valores(primeiroValor, segundoValor);
	printf("Resultado da soma: %i\n", a);
	*/
	//Funcao recebendo valor do usuario
	int primeiroValor = LerNumeroInteiro();
	int segundoValor = LerNumeroInteiro();
	int d = Somar2Valores(primeiroValor, segundoValor);
	printf("Resultado da soma: %i\n", d);

	system("pause");
	return 0;
}