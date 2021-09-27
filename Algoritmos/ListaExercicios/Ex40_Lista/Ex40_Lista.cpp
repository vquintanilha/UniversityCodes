#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int cod, quant;
float valor, total;

int main()
{
	setlocale(LC_ALL, "Portuguese");

	printf("============== PRODUTOS ==============\n\n");
	printf(" 1001 - R$ 5,32\n");
	printf(" 1324 - R$ 6,45\n");
	printf(" 6548 - R$ 2,37\n");
	printf(" 0987 - R$ 5,32\n");
	printf(" 7623 - R$ 6,45\n");
	printf("\n======================================\n\n");

	while (cod != -1) {

		printf("Favor, informe o c�digo do produto comprado (-1 para finalizar): ");
		scanf_s("%04d", &cod);

		if (cod != -1) {

			printf("Agora, informe a quantidade comprada: ");
			scanf_s("%i", &quant);

			switch (cod)
			{
			case 1001:
				valor = quant * 5.32;
				printf("\nO pre�o total �: R$ %.2f\n\n", valor);
				total += valor;
				break;

			case 1324:
				valor = quant * 6.42;
				printf("\nO pre�o total �: R$ %.2f\n\n", valor);
				total += valor;
				break;

			case 6548:
				valor = quant * 2.37;
				printf("\nO pre�o total �: R$ %.2f\n\n", valor);
				total += valor;
				break;

			case 987:
				valor = quant * 5.32;
				printf("\nO pre�o total �: R$ %.2f\n\n", valor);
				total += valor;
				break;

			case 7623:
				valor = quant * 6.45;
				printf("\nO pre�o total �: R$ %.2f\n\n", valor);
				total += valor;
				break;

			default:
				printf("\nC�digo inv�lido!!!\n\n");
				break;
			}
		}
	}

	system("cls");
	printf("\nO total devido por este cliente �: R$ %.2f\n\n", total);

	system("pause");
}