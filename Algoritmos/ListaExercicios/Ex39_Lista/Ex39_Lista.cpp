#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
	setlocale(LC_ALL, "Portuguese");

	typedef struct {
		char nome[30];
		float altura;
		float peso;
		double cpf;
		int sexo; // 1 masculino 0 feminino
	} pessoa;

	pessoa cad[100];
	int op = 1, i = 0, j = 0;
	float imc;
	double bcpf;
	while ((op > 0) && (i < 100))
	{
		printf("\nCadastrar Pessoa %i\n\n", i + 1);
		printf("Nome: ");
		getchar();
		fgets(cad[i].nome, 30, stdin);

		printf("Altura(cm): ");
		scanf_s("%f", &cad[i].altura);

		printf("Peso(kg): ");
		scanf_s("%f", &cad[i].peso);

		printf("CPF: ");
		scanf_s("%lf", &cad[i].cpf);

		printf("Sexo: ");
		scanf_s("%i", &cad[i].sexo);
		i++;
		printf("Cadastrar outra pessoa? (1) sim (0) não: ");
		getchar();
		scanf_s("%i", &op);
	}
	system("cls");

	printf("\n\nInforme o CPF para realizar a busca: ", i);
	scanf_s("%lf", &bcpf);

	for (j = 0; j < i; j++) {
		if (bcpf == cad[j].cpf) {
			printf("\nNome: %s", cad[j].nome);
			printf("Altura: %.0f cm", cad[j].altura);
			printf("\nPeso: %.0f kg\n", cad[j].peso);
			imc = cad[j].peso / ((cad[j].altura / 100) * (cad[j].altura / 100));
			printf("\nICM: %.2f\n\n", imc);

		}
	}

	system("pause");
	return 0;
}