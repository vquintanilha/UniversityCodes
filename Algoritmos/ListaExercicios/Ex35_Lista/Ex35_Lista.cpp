#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

int idade, sexo, olhos, cabelos, maior, cont;

int main()
{
	setlocale(LC_ALL, "Portuguese");

	while (idade != -1) {

		printf("Favor, informe a idade (-1 para finalizar): ");
		scanf_s("%i", &idade);

		if (idade >= 0) {

			printf("Informe o sexo (1 - feminino, 2 - masculino): ");
			scanf_s("%d", &sexo);
			printf("Informe a cor dos olhos (1 - azuis, 2 - verdes, 3 - castanhos): ");
			scanf_s("%i", &olhos);
			printf("Informe a cor dos cabelos (1 - louros, 2 - castanhos, 3 - pretos): ");
			scanf_s("%i", &cabelos);
		}

		if (idade > maior) {
			maior = idade;
		}
		if (sexo == 1 && idade >= 18 && idade <= 35 && olhos == 2 && cabelos == 1) {
			cont++;
		}
	}

	system("cls");
	printf("Maior idade entre os habitantes: %d\n", maior);
	printf("Quantidade de mulheres loiras de olhos verdes, entre 18 e 35 anos: %d\n\n", cont);
	
	system("pause");
	return 0;
}