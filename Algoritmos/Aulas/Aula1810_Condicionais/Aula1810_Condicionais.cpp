#include "stdafx.h"
#include <stdlib.h>
#include <stdio.h>
int LerNumeroInteiro()
{
	int a;
	printf("Favor digitar um numero inteiro: ");
	scanf_s("%i", &a);
	return a;
}
int MaiorValorInteiro(int a, int b, int c, int d)
{
	int maior = a;
	if (maior < b)
	{
		maior = b;
	}
	if (maior < c)
	{
		maior = c;
	}
	if (maior < d)
	{
		maior = d;
	}
	return maior;
}
float CalculaMedia(float a, float b, float c, float d)
{
	float soma = a + b + c + d;
	float media = soma / 4;
	return media;
}
void ImprimeValoresMaioresQueMedia(int a, int b, int c, int d, float media)
{
	printf("Os valores maiores que a media sao: ");
	if (a > media)
	{
		printf("%i ", a);
	}
	if (b > media)
	{
		printf("%i ", b);
	}
	if (c > media)
	{
		printf("%i ", c);
	}
	if (d > media)
	{
		printf("%i ", d);
	}
}
int main()
{
	int primeiro = LerNumeroInteiro();
	int segundo = LerNumeroInteiro();
	int terceiro = LerNumeroInteiro();
	int quarto = LerNumeroInteiro();
	int m = MaiorValorInteiro(primeiro, segundo, terceiro, quarto);
	printf("Maior valor encontrado: %i\n\n", m);
	float mediaValores = CalculaMedia((float)primeiro, (float)segundo, (float)terceiro, (float)quarto);
	printf("A media dos valores digitados eh: %f\n", (float)mediaValores);
	ImprimeValoresMaioresQueMedia(primeiro, segundo, terceiro, quarto, mediaValores);
	system("pause");
	return 0;
}