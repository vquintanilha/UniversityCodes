#include "stdafx.h"
#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
void CalculoIR(float salario) {
	float ir = 0, salarioFinal;
	if (salario <= 1903.98) {
		printf("\nVocê é isento\n");
		salarioFinal = salario;
	}
	else if (salario >= 1903.99 && salario <= 2826.65) {
		ir = (salario * 0.075) - 142.80;
		salarioFinal = salario - ir;
	}
	else if (salario >= 2826.66 && salario <= 3751.05) {
		ir = (salario * 0.15) - 354.80;
		salarioFinal = salario - ir;
	}
	else if (salario >= 3751.06 && salario <= 4664.68) {
		ir = (salario * 0.225) - 636.13;
		salarioFinal = salario - ir;
	}
	else {
		ir = (salario * 0.275) - 869.36;
		salarioFinal = salario - ir;
	}
	printf("\nValor do seu IR: %.2f\n", (float)ir);
	printf("Valor do salário sem IR: %.2f\n\n", (float)salarioFinal);
}
int main()
{
	setlocale(LC_ALL, "Portuguese");
	printf("Favor, informe seu salário: ");
	float salario;
	scanf_s("%f", &salario);
	CalculoIR(salario);
	system("pause");
	return 0;
}