#include "pch.h"
#include <iostream>
#include <locale.h>

float custoFabr, imposto, distribuidor, custoConsum;

int main()
{
	setlocale(LC_ALL, "Portuguese");
	printf("Favor, informe o custo de fábrica do veículo: R$");
	scanf_s("%f", &custoFabr);
	imposto = custoFabr * 0.45;
	distribuidor = custoFabr * 0.28;
	custoConsum = custoFabr + imposto + distribuidor;
	printf("\nO custo final para o consumidor será: R$%.2f\n\n", custoConsum);
		
	system("pause");
}