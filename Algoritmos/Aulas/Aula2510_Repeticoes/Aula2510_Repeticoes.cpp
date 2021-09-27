// Aula2510_Repeticoes.cpp : Define o ponto de entrada para a aplicação de console.
//

#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
	setlocale(LC_ALL, "Portuguese");

	/*
	while (true) // laco infinito
	{
		printf("a");
	}

	int a = 0;
	while (a < 5)
	{
		printf("%i\t", a);
		a++; // a = a + 1; // incremento
	}

	printf("\n========================================\n");

	a = 0;
	while (a <= 5)
	{
		printf("%i\t", a);
		a++; // a = a + 1; // incremento
	}

	printf("\n================ DO WHILE ==============\n");

	do
	{
		printf("%i\t", a);
		a++; // a = a + 1; // incremento
	} while (a <= 5);


	printf("\n\n\n");
	*/

	int a = 0;
	int n, n1, n2, n3, n4, n5;
	
	while (a < 5) {

		printf("Favor, informe um número: ");
		scanf_s("%i", &n);
		a++;

		if (a == 1) {
			n1 = n;
		}
		if (a == 2) {
			n2 = n;
		}
		if (a == 3) {
			n3 = n;
		}
		if (a == 4) {
			n4 = n;
		}
		if (a == 5) {
			n5 = n;
		}

	}

	if (n5 > n4 && n4 > n3 && n3 > n2 && n2 > n1) {
		printf("\nOs números estão em ordem crescente!\n\n");
	}
	else {
		printf("\nOs números NÃO estão em ordem crescente!\n\n");
	}
	
	system("pause");
    return 0;
}