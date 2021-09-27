#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>

// Variaveis globais
int a; // inteiro
float b; // real (pouca precisao)
double c; // real (grande precisao)

int main()
{
	// Variaveis locais
	char d;	// caractere
	bool e; // booleano (true/false)

	printf("Hello World!\n");

	printf("Teste\t\tTeste\n\n");

	printf("A\tB\tC\tD\n");
	printf("A\tB\tC\tD\n");
	printf("A\tB\tC\tD\n\n");

	printf("Mostrando o valor %i \n", 5);
	printf("A soma de %i e %i eh: %i \n", 99, 10, 99 + 10);

	printf("Mostrando %.2f, que eh um numero real\n", 4.3);

	printf("Olha soh este numero: %i\n\n\n"); // erro

	int f;
	f = 8;
	a = f * 2;

	printf("Resultado da multiplicacao de %i por 2 eh: %i\n", f, a);


	scanf_s("%i", &a); // nao pula linha, nao da tab - pois comando nao eh de impressao, eh de leitura
	printf("\n\nValor digitado foi: %i\n\n", a);


	printf("Digite um valor real: ");
	scanf_s("%f", &b);

	printf("\n Voce digitou: %f\n\n", b);


	system("pause");
	return 0;
}