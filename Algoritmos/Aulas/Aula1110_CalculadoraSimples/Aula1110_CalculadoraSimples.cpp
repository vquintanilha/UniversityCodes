#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int informeNumero() {
	int num;
	printf("Por favor, informe um número inteiro: ");
	scanf_s("%i", &num);
	return num;
}

int soma(int x, int y) {
	return x + y;
}

int subtracao(int x, int y) {
	return x - y;
}

int multiplicacao(int x, int y) {
	return x * y;
}

float divisao(float x, float y) {
	return x / y;
}

int main() {
	setlocale(LC_ALL, "Portuguese");
	int valor1 = informeNumero();
	int valor2 = informeNumero();
	int a = soma(valor1, valor2);
	int b = subtracao(valor1, valor2);
	int c = multiplicacao(valor1, valor2);
	float d = divisao(valor1, valor2);
	printf("\nResultado da soma: %i\n", a);
	printf("Resultado da subtração: %i\n", b);
	printf("Resultado da multiplicação: %i\n", c);
	printf("Resultado da divisão: %.2f\n\n", d);
	system("pause");
}