#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

float lerNota() {

	float nota = 0;
	printf("Favor, escreva a nota do aluno: ");
	scanf_s("%f", &nota);
	return nota;

}

int main()
{
	setlocale(LC_ALL, "Portuguese");

	float nota1 = lerNota();
	float nota2 = lerNota();
	float nota3 = lerNota();

	float media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
	printf("\nA média do aluno foi: %.2f\n\n", media);

	system("pause");
	return 0;
}