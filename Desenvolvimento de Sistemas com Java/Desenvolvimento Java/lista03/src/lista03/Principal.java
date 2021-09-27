package lista03;

import java.util.ArrayList;

/**
 * A classe Principal do sistema.
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
		String[] opcoes = {"Peso ideal",
						   "Calcular B�skara",
						   "Calcular pagamento",
						   "Calculadora inteiros",
						   "Verificar tipo do tri�ngulo",
						   "Calcular fatorial",
						   "Verificar n�mero perfeito",
						   "Verificar n�mero primo",
						   "Fibonacci Vetor e Array",
						   "Convers�o de bases",
						   "Sequ�ncia 01",
						   "Sequ�ncia 02",
						   "Par - �mpar"};
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Lista 03", null);
			switch (opcao) {
			case 1:
				calcularPesoIdeal();
				break;
				
			case 2:
				calcularBaskara();
				break;
				
			case 3:
				calcularPagamento();
				break;
				
			case 4:
				calcularInteiros();
				break;
				
			case 5:
				verificarTipoDoTriangulo();
				break;
				
			case 6:
				calcularFatorial();
				break;
			
			case 7:
				verificarNumeroPerfeito();
				break;
				
			case 8:
				verificarNumeroPrimo();
				break;
				
			case 9:
				criarSerieFibonacci();
				break;
				
			case 10:
				converterDecimalBase8();
				break;
				
			case 11:
				criarSequencia01();
				break;
				
			case 12:
				criarSequencia02();
				break;
				
			case 13:
				contabilizaParImpar();
				break;	
				
			case -1:
				continua = false;
				break;
			}
		} while (continua);
	}
	
	/**
	 * Imprime um vetor primitivo de inteiros.
	 *  
	 * @param valores
	 */
	public static void imprimirVetorInteiros(int[] valores) {
		if (valores.length == 0) {
			System.out.println("[]");
		}else if(valores.length == 1) {
			System.out.println("[" + valores[0] + "]");
		} else {
			System.out.print("[");
			for (int i = 0; i < valores.length - 1; i++) {
				System.out.print(valores[i] + ", ");
			}
			System.out.println(valores[valores.length - 1] + "]");
		}		
	}
	
	/**
	 * Faz a execu��o de tela do c�lculo de peso ideal.
	 */
	public static void calcularPesoIdeal() {
		// Pega as vari�veis do teclado
		String sexo = Console.recuperaTexto("Informe o sexo, M para masculino e F para feminino:");
		double h = Console.recuperaDecimal("Informe a sua altura:");
		
		// Executa a conta
		double pesoIdeal = Exercicios.calcularPesoIdeal(h, sexo);
		
		// Mostra o resultado na tela
		System.out.printf("O seu peso ideal �: %.2f\n\n", pesoIdeal);
	}
	
	/**
	 * Calcula a equa��o do segundo grau conforme B�skara.
	 */
	private static void calcularBaskara() {
		double a = Console.recuperaDecimal("Informe o termo a:");
		double b = Console.recuperaDecimal("Informe o termo b:");
		double c = Console.recuperaDecimal("Informe o termo c:");
		double[] raizes = Exercicios.calcularEquacao2Grau(a, b, c);
		
		if(raizes.length == 0) {
			System.out.println("N�o existem ra�zes reais!");
		}
		
		if(raizes.length == 1) {
			System.out.println("Existe uma raiz real: " + raizes[0]);
		}
		
		if(raizes.length == 2) {
			System.out.println("Raiz 1: " + raizes[0]);
			System.out.println("Raiz 2: " + raizes[1]);
		}
	}
	
	/**
	 * Calcula o pagamento de um produto de acordo com uma condi��o.
	 */
	private static void calcularPagamento() {
		double precoNormal = Console.recuperaDecimal("Informe o valor de etiqueta do produto:");
		System.out.println("Selecione a condi��o de pagamento:\n"
						 + "1 - � vista em dinheiro ou cheque, recebe 10% de desconto\n"
						 + "2 - � vista no cart�o de cr�dito, recebe 5% de desconto\n"
						 + "3 - Em 2 vezes, pre�o normal da etiqueta sem juros\n"
						 + "4 - Em 3 vezes, pre�o normal da etiqueta mais juros de 10%");
		int condicao = Console.recuperaInteiro("Condi��o:");
		if (condicao == 1 || condicao == 2 || condicao == 3 || condicao == 4) {
			double precoFinal = Exercicios.calcularPagamento(precoNormal, condicao);
			System.out.printf("Pre�o final: %.2f\n", precoFinal);
		} else {
			System.out.println("Condi��o Inv�lida! Valor deve ser entre 1 e 4.");
		}
	}
	
	/**
	 * Recebe dois n�meros inteiros e realiza a opera��o solicitada.
	 */
	private static void calcularInteiros() {
		int v1 = Console.recuperaInteiro("Informe o primeiro valor inteiro:");
		int v2 = Console.recuperaInteiro("Informe o segundo valor inteiro");
		System.out.println("Selecione a opera��o aritm�tica que deseja realizar:\n"
				 + "1 - + (Adi��o)\n"
				 + "2 - - (Subtra��o)\n"
				 + "3 - * (Multiplica��o)\n"
				 + "4 - / (Divis�o)");
		int operacao = Console.recuperaInteiro("Opera��o:");
		if (operacao == 1 || operacao == 2 || operacao == 3 || operacao == 4) {
			double opera��oRealizada = Exercicios.calcularInteiros(v1, v2, operacao);
			System.out.printf("Resultado: %.2f\n", opera��oRealizada);
		} else {
			System.out.println("C�digo Inv�lido! Valor deve ser entre 1 e 4.");
		}
	}
	
	/**
	 * Recebe tr�s pontos do plano cartesiano, indica se os mesmos formam um tri�ngulo. Caso verdadeiro,
indicar se formam um tri�ngulo escaleno, is�celes ou eq�il�tero.
	 */
	private static void verificarTipoDoTriangulo() {
		int x1 = Console.recuperaInteiro("X1:");
		int y1 = Console.recuperaInteiro("Y1:");
		int x2 = Console.recuperaInteiro("X2:");
		int y2 = Console.recuperaInteiro("Y2:");
		int x3 = Console.recuperaInteiro("X3:");
		int y3 = Console.recuperaInteiro("Y3:");
		String tipo = Exercicios.verificarTipoDoTriangulo(x1, y1, x2, y2, x3, y3);
		System.out.println(tipo);
	}
	
	/**
	 * Calcula o fatorial de um n�mero.
	 */
	private static void calcularFatorial() {
		int num = Console.recuperaInteiro("Informe o n�mero que deseja calcular o fatorial:");
		int resultado = Exercicios.calcularFatorial(num);
		System.out.printf("Resultado: %d\n", resultado);
	}
	
	/**
	 * Verifica se um n�mero � perfeito ou n�o.
	 */
	private static void verificarNumeroPerfeito() {
		int num = Console.recuperaInteiro("Informe um n�mero inteiro:");
		boolean resultado = Exercicios.verificarNumeroPerfeito(num);
		if (resultado == true) {
			System.out.println("O n�mero " + num + " � perfeito!");
		} else {
			System.out.println("O n�mero " + num + " N�O � perfeito!");
		}
	}
	
	/**
	 * Verifica se um n�mero � primo ou n�o.
	 */
	private static void verificarNumeroPrimo() {
		int num = Console.recuperaInteiro("Informe um n�mero inteiro:");
		boolean resultado = Exercicios.verificarNumeroPrimo(num);
		if (resultado == true) {
			System.out.println("O n�mero " + num + " � primo!");
		} else {
			System.out.println("O n�mero " + num + " N�O � primo!");
		}
	}
	
	/**
	 * Cria a s�rie de Fibonacci com vetor e Array com o tamanho informado pelo usu�rio.
	 */
	private static void criarSerieFibonacci() {
		int quantidade = Console.recuperaInteiro("Informe a quantidade de elementos da s�rie:");
		
		int[] fiboVetor = Exercicios.criaSerieFibonacciComVetor(quantidade);
		System.out.println("Vetor primitivo");
		imprimirVetorInteiros(fiboVetor);
		System.out.println("ArrayList");
		ArrayList<Integer> fiboArray = Exercicios.criarSerieFibonacciComArray(quantidade);
		System.out.println(fiboArray);
	}
	
	/**
	 * Efetua a convers�o da representa��o de um n�mero na base 10 para uma
representa��o em String desse n�mero na base 8 ou na base 2.
	 */
	private static void converterDecimalBase8() {
		int num = Console.recuperaInteiro("Informe um numero inteiro: ");
		String base8 = Exercicios.converterDecimalBase8(num);
		System.out.println("Base 8:" + base8);
	}
	
	/**
	 * Cria a sequ�ncia do exerc�cio 11.
	 */
	private static void criarSequencia01() {
		int n = Console.recuperaInteiro("Informe um n�mero inteiro positivo qualquer:");
		
		ArrayList<Integer> sequencia = Exercicios.criarSequencia01(n);
		System.out.println(sequencia);
	}
	
	/**
	 * Cria a sequ�ncia do exerc�cio 12.
	 */
	private static void criarSequencia02() {
		int n = Console.recuperaInteiro("Informe um n�mero inteiro positivo qualquer:");
		
		ArrayList<Integer> sequencia = Exercicios.criarSequencia02(n);
		System.out.println(sequencia);
	}
	
	/**
	 * M�todo respons�vel por contabilizar a quantidade de n�meros pares e �mpares inseridos pelo usu�rio.
	 */
	private static void contabilizaParImpar() {
		int[] quantidadeImparPar = null;
		boolean continua = false;
		System.out.print("Selecione que tipo de n�mero deseja inserir ao contador:\n"
				 + "1 - Digitar um n�mero �mpar\n"
				 + "2 - Digitar um n�mero par\n"
				 + "3 - Sair\n");
		int opcao = Console.recuperaInteiro("Op��o:");
		if (opcao == 1 || opcao == 2 || opcao == 3) {
			do {
				int numero = Console.recuperaInteiro("Informe o n�mero:");
				if (opcao == 1 && numero %2 != 0 || opcao == 2 && numero == 0) {
					quantidadeImparPar = Exercicios.contabilizaParImpar(opcao, numero);
				} else {
					continua = true;
				}
			} while (continua);
			System.out.println("Quantidade de n�meros �mpares: " + quantidadeImparPar[0]);
			System.out.println("Quantidade de n�meros pares: " + quantidadeImparPar[1]);
		} else {
			System.out.println("C�digo Inv�lido! Valor deve ser entre 1 e 3.");
		}
	}
	
}