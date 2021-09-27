package com.up.calculadora;

import java.util.ArrayList;

/**
 * A classe principal do sistema.
 * 
 * @author 1829203
 *
 */
public class Principal {

	/**
	 * Fun��o para iniciar o programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] opcoes = {"Soma",
				   "Subtra��o",
				   "Multiplica��o",
				   "Divis�o",
				   "Potencia��o",
				   "Ra�z Quadrada",
				   "Equa��o do 2� Grau (Bhaskara)",
				   "Dois Valores (Funcionalidade solicitada pelo professor)",
				   "Pol�gono (Funcionalidade solicitada pelo professor)",
				   "�ngulo (Funcionalidade solicitada pelo professor)"};
		
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Calculadora! (Selecione a opera��o desejada)", null);
			switch (opcao) {
				case 1:
					calcularSoma();
					break;
					
				case 2:
					calcularSubtracao();
					break;
					
				case 3:
					calcularMultiplicacao();
					break;
					
				case 4:
					calcularDivisao();
					break;
					
				case 5:
					calcularPotencia();
					break;
					
				case 6:
					calcularRaizQuadrada();
					break;
					
				case 7:
					calcularBhaskara();
					break;
					
				case 8:
					calcularDoisValores();
					break;
					
				case 9:
					calcularPoligono();
					break;
					
				case 10:
					calcularAngulo();
					break;
					
				case -1:
					continua = false;
					break;
			}
		} while (continua);
		
	}
	
	/**
	 * Calcula a soma entre dois n�meros
	 */
	private static void calcularSoma() {
		int a = Console.recuperaInteiro("\nInforme o primeiro valor:");
		int b = Console.recuperaInteiro("Informe o segundo valor:");
		double resultado = Calculadora.soma(a, b);
		System.out.printf("O resultado de %d + %d �: %.2f \n\n", a, b, resultado);
		
	}

	/**
	 * Calcula a subtra��o entre dois n�meros
	 */
	private static void calcularSubtracao() {
		int a = Console.recuperaInteiro("\nInforme o primeiro valor:");
		int b = Console.recuperaInteiro("Informe o segundo valor:");
		double resultado = Calculadora.subtracao(a, b);
		System.out.printf("O resultado de %d - %d �: %.2f \n\n", a, b, resultado);
	}

	/**
	 * Calcula a multiplica��o entre dois n�meros
	 */
	private static void calcularMultiplicacao() {
		int a = Console.recuperaInteiro("\nInforme o primeiro valor:");
		int b = Console.recuperaInteiro("Informe o segundo valor:");
		double resultado = Calculadora.multiplicacao(a, b);
		System.out.printf("O resultado de %d x %d �: %.2f \n\n", a, b, resultado);
	}

	/**
	 * Calcula a divis�o entre dois n�meros
	 */
	private static void calcularDivisao() {
		double a = Console.recuperaInteiro("\nInforme o valor do dividendo:");
		double b = Console.recuperaInteiro("Informe o valor do divisor:");
		if (b == 0) {
			System.out.println("� imposs�vel dividir por 0!\n");
		} else {
			double resultado = Calculadora.divisao(a, b);
			System.out.printf("O resultado da divis�o �: %.2f \n\n", resultado);
		}
	}

	/**
	 * Realiza um c�lculo de potencia��o
	 */
	private static void calcularPotencia() {
		int a = Console.recuperaInteiro("\nInforme o valor da base:");
		int b = Console.recuperaInteiro("Informe o valor do expoente:");
		double resultado = Calculadora.potenciacao(a, b);
		System.out.printf("O resultado �: %.2f \n\n", resultado);
	}

	/**
	 * Calcula a ra�z quadrada de um n�mero
	 */
	private static void calcularRaizQuadrada() {
		int a = Console.recuperaInteiro("\nInforme o valor do radicando:");
		double resultado = Calculadora.raizQuadrada(a);
		System.out.printf("O resultado �: %.2f \n\n", resultado);
	}

	/**
	 * Calcula a equa��o do segundo grau conforme Bhaskara
	 */
	private static void calcularBhaskara() {
		double a = Console.recuperaDecimal("\nInforme o termo a:");
		double b = Console.recuperaDecimal("Informe o termo b:");
		double c = Console.recuperaDecimal("Informe o termo c:");
		double[] raizes = Calculadora.bhaskara(a, b, c);
		
		if(raizes.length == 0) {
			System.out.println("N�o existem ra�zes reais!\n");
		}
		
		if(raizes.length == 1) {
			System.out.printf("Existe uma raiz real: %.2f \n\n", raizes[0]);
		}
		
		if(raizes.length == 2) {
			System.out.printf("Raiz 1: %.2f \n", raizes[0]);
			System.out.printf("Raiz 2: %.2f \n\n", raizes[1]);
		}
	}
	
	// Funcionalidades solicitadas pelo professor para exercitar testes de desvio
	
	private static void calcularDoisValores() {
		int a = Console.recuperaInteiro("\nInforme o primeiro valor:");
		int b = Console.recuperaInteiro("Informe o segundo valor:");
		int resultado = Calculadora.doisValores(a, b);
		System.out.printf("O retorno �: %d \n\n", resultado);
	}
	
	private static void calcularPoligono() {
		int lados = Console.recuperaInteiro("\nInforme o n�mero de lados do poligono:");
		ArrayList<Integer> tamanhos = new ArrayList<>();
		if (lados >= 3) {
			Integer tamanho;
			for (int i = 0; i < lados; i++) {
				tamanho = Console.recuperaInteiro("Informe o tamanho do Lado " + (i + 1) + ":");
				tamanhos.add(tamanho);
			}
			System.out.println(Calculadora.calcularPoligonos(lados, tamanhos));
			System.out.println("O perimetro � " + Calculadora.calcularPerimetro(tamanhos) + "\n\n");
		} else {
			System.out.println(Calculadora.calcularPoligonos(lados, tamanhos));
		}
	}
	
	private static void calcularAngulo() {
		double n1 = Console.recuperaDecimal("\nInforme o valor do �ngulo: ");
		System.out.println(Calculadora.angulo(n1));
	}
	
}