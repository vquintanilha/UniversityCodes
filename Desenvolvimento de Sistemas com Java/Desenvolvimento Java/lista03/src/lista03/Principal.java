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
	 * Função para iniciar o programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] opcoes = {"Peso ideal",
						   "Calcular Báskara",
						   "Calcular pagamento",
						   "Calculadora inteiros",
						   "Verificar tipo do triângulo",
						   "Calcular fatorial",
						   "Verificar número perfeito",
						   "Verificar número primo",
						   "Fibonacci Vetor e Array",
						   "Conversão de bases",
						   "Sequência 01",
						   "Sequência 02",
						   "Par - Ímpar"};
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
	 * Faz a execução de tela do cálculo de peso ideal.
	 */
	public static void calcularPesoIdeal() {
		// Pega as variáveis do teclado
		String sexo = Console.recuperaTexto("Informe o sexo, M para masculino e F para feminino:");
		double h = Console.recuperaDecimal("Informe a sua altura:");
		
		// Executa a conta
		double pesoIdeal = Exercicios.calcularPesoIdeal(h, sexo);
		
		// Mostra o resultado na tela
		System.out.printf("O seu peso ideal é: %.2f\n\n", pesoIdeal);
	}
	
	/**
	 * Calcula a equação do segundo grau conforme Báskara.
	 */
	private static void calcularBaskara() {
		double a = Console.recuperaDecimal("Informe o termo a:");
		double b = Console.recuperaDecimal("Informe o termo b:");
		double c = Console.recuperaDecimal("Informe o termo c:");
		double[] raizes = Exercicios.calcularEquacao2Grau(a, b, c);
		
		if(raizes.length == 0) {
			System.out.println("Não existem raízes reais!");
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
	 * Calcula o pagamento de um produto de acordo com uma condição.
	 */
	private static void calcularPagamento() {
		double precoNormal = Console.recuperaDecimal("Informe o valor de etiqueta do produto:");
		System.out.println("Selecione a condição de pagamento:\n"
						 + "1 - À vista em dinheiro ou cheque, recebe 10% de desconto\n"
						 + "2 - À vista no cartão de crédito, recebe 5% de desconto\n"
						 + "3 - Em 2 vezes, preço normal da etiqueta sem juros\n"
						 + "4 - Em 3 vezes, preço normal da etiqueta mais juros de 10%");
		int condicao = Console.recuperaInteiro("Condição:");
		if (condicao == 1 || condicao == 2 || condicao == 3 || condicao == 4) {
			double precoFinal = Exercicios.calcularPagamento(precoNormal, condicao);
			System.out.printf("Preço final: %.2f\n", precoFinal);
		} else {
			System.out.println("Condição Inválida! Valor deve ser entre 1 e 4.");
		}
	}
	
	/**
	 * Recebe dois números inteiros e realiza a operação solicitada.
	 */
	private static void calcularInteiros() {
		int v1 = Console.recuperaInteiro("Informe o primeiro valor inteiro:");
		int v2 = Console.recuperaInteiro("Informe o segundo valor inteiro");
		System.out.println("Selecione a operação aritmética que deseja realizar:\n"
				 + "1 - + (Adição)\n"
				 + "2 - - (Subtração)\n"
				 + "3 - * (Multiplicação)\n"
				 + "4 - / (Divisão)");
		int operacao = Console.recuperaInteiro("Operação:");
		if (operacao == 1 || operacao == 2 || operacao == 3 || operacao == 4) {
			double operaçãoRealizada = Exercicios.calcularInteiros(v1, v2, operacao);
			System.out.printf("Resultado: %.2f\n", operaçãoRealizada);
		} else {
			System.out.println("Código Inválido! Valor deve ser entre 1 e 4.");
		}
	}
	
	/**
	 * Recebe três pontos do plano cartesiano, indica se os mesmos formam um triângulo. Caso verdadeiro,
indicar se formam um triângulo escaleno, isóceles ou eqüilátero.
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
	 * Calcula o fatorial de um número.
	 */
	private static void calcularFatorial() {
		int num = Console.recuperaInteiro("Informe o número que deseja calcular o fatorial:");
		int resultado = Exercicios.calcularFatorial(num);
		System.out.printf("Resultado: %d\n", resultado);
	}
	
	/**
	 * Verifica se um número é perfeito ou não.
	 */
	private static void verificarNumeroPerfeito() {
		int num = Console.recuperaInteiro("Informe um número inteiro:");
		boolean resultado = Exercicios.verificarNumeroPerfeito(num);
		if (resultado == true) {
			System.out.println("O número " + num + " é perfeito!");
		} else {
			System.out.println("O número " + num + " NÃO é perfeito!");
		}
	}
	
	/**
	 * Verifica se um número é primo ou não.
	 */
	private static void verificarNumeroPrimo() {
		int num = Console.recuperaInteiro("Informe um número inteiro:");
		boolean resultado = Exercicios.verificarNumeroPrimo(num);
		if (resultado == true) {
			System.out.println("O número " + num + " é primo!");
		} else {
			System.out.println("O número " + num + " NÃO é primo!");
		}
	}
	
	/**
	 * Cria a série de Fibonacci com vetor e Array com o tamanho informado pelo usuário.
	 */
	private static void criarSerieFibonacci() {
		int quantidade = Console.recuperaInteiro("Informe a quantidade de elementos da série:");
		
		int[] fiboVetor = Exercicios.criaSerieFibonacciComVetor(quantidade);
		System.out.println("Vetor primitivo");
		imprimirVetorInteiros(fiboVetor);
		System.out.println("ArrayList");
		ArrayList<Integer> fiboArray = Exercicios.criarSerieFibonacciComArray(quantidade);
		System.out.println(fiboArray);
	}
	
	/**
	 * Efetua a conversão da representação de um número na base 10 para uma
representação em String desse número na base 8 ou na base 2.
	 */
	private static void converterDecimalBase8() {
		int num = Console.recuperaInteiro("Informe um numero inteiro: ");
		String base8 = Exercicios.converterDecimalBase8(num);
		System.out.println("Base 8:" + base8);
	}
	
	/**
	 * Cria a sequência do exercício 11.
	 */
	private static void criarSequencia01() {
		int n = Console.recuperaInteiro("Informe um número inteiro positivo qualquer:");
		
		ArrayList<Integer> sequencia = Exercicios.criarSequencia01(n);
		System.out.println(sequencia);
	}
	
	/**
	 * Cria a sequência do exercício 12.
	 */
	private static void criarSequencia02() {
		int n = Console.recuperaInteiro("Informe um número inteiro positivo qualquer:");
		
		ArrayList<Integer> sequencia = Exercicios.criarSequencia02(n);
		System.out.println(sequencia);
	}
	
	/**
	 * Método responsável por contabilizar a quantidade de números pares e ímpares inseridos pelo usuário.
	 */
	private static void contabilizaParImpar() {
		int[] quantidadeImparPar = null;
		boolean continua = false;
		System.out.print("Selecione que tipo de número deseja inserir ao contador:\n"
				 + "1 - Digitar um número ímpar\n"
				 + "2 - Digitar um número par\n"
				 + "3 - Sair\n");
		int opcao = Console.recuperaInteiro("Opção:");
		if (opcao == 1 || opcao == 2 || opcao == 3) {
			do {
				int numero = Console.recuperaInteiro("Informe o número:");
				if (opcao == 1 && numero %2 != 0 || opcao == 2 && numero == 0) {
					quantidadeImparPar = Exercicios.contabilizaParImpar(opcao, numero);
				} else {
					continua = true;
				}
			} while (continua);
			System.out.println("Quantidade de números ímpares: " + quantidadeImparPar[0]);
			System.out.println("Quantidade de números pares: " + quantidadeImparPar[1]);
		} else {
			System.out.println("Código Inválido! Valor deve ser entre 1 e 3.");
		}
	}
	
}