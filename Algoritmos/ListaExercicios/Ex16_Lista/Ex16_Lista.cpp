// Ex16_Lista.cpp : Este arquivo contém a função 'main'. A execução do programa começa e termina ali.
//

#include "pch.h"
#include <iostream>
#include <locale.h>
#include <string.h>

int i;
char frase[30], letra;

int main()
{
	setlocale(LC_ALL, "Portuguese");
	printf("Favor, escreva uma frase: ");
	fgets(frase, 30, stdin);
	printf("\nAgora, digite qual letra deseja buscar: ");
	scanf_s("%c", &letra);

	for (i = 1; i <= 30; i++) {
		if (frase[i] == letra) {
			printf("\nA letra se encontra na posição %d da frase!!!\n\n", i + 1);
		}
	}
	if(i == 0) {
	printf("A letra digitada não se encontra na frase!!!\n\n");
	}

	system("pause");
	return 0;
}