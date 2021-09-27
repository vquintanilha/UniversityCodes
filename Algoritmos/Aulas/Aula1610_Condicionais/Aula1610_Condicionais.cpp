#include "stdafx.h"
#include <stdlib.h>
#include <stdio.h>
/*
Condicionais

Operadores Logicos:
==	igual
!=	diferente
<	menor
>	maior
<=	menor igual
>=	maior igual
Condicao:
Operador logico sempre entre 2 operandos
Resultado da operacao pode ser apenas (true/false)
Conector:
"e" - &&
"ou" - ||
*/
int main()
{
	// SE
	if (true)
	{
		// este codigo sera executado
	}
	if (false)
	{
		// este codigo nao sera executado
	}
	int a = 0;
	if (a == 0)
	{
		printf("a igual a zero\n");
	}
	if (a != 0)
	{
		printf("a diferente de zero\n");
	}
	int b = 5;
	if (b < a)
	{
		printf("B menor que A");
	}
	if (a <= b) // a pode ser menor, pode ser igual e pode ser diferente
	{
		printf("A menor ou igual a B");
	}
	system("pause");
}