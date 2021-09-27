package lista03;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe para desenvolver os exerc�cios da lista 03.
 * 
 * @author 1829203
 *
 */
public class Exercicios {
	
	/**
	 * Primeiro fator fixo para utiliza��o do c�lculo de peso ideal para homens.
	 */
	public static final double FATOR_MASCULINO_1 = 72.7d;
	
	/**
	 * Segundo fator fixo para utiliza��o do c�lculo de peso ideal para homens.
	 */
	public static final double FATOR_MASCULINO_2 = 58d;
	
	/**
	 * Primeiro fator fixo para utiliza��o do c�lculo de peso ideal para mulheres.
	 */
	public static final double FATOR_FEMININO_1 = 62.1d;
	
	/**
	 * Segundo fator fixo para utiliza��o do c�lculo de peso ideal para mulheres.
	 */
	public static final double FATOR_FEMININO_2 = 44.7d;
	
	/**
	 * Calcula o peso ideal de uma pessoa baseado no sexo e na altura.
	 * 
	 * @param h Altura em metros da pessoa.
	 * @param sexo Sexo, utilize M para Masculino e F pra Feminino.
	 * @return O peso ideal em Kg.
	 */
	public static double calcularPesoIdeal (double h, String sexo) {
		
		double pesoIdeal = 0d;
		
		/*	sexo == "M"
			sexo.equals("M")
			sexo.equalsIgnoreCase("M") */
		
		if (sexo.equalsIgnoreCase("F")) {
			pesoIdeal = (FATOR_FEMININO_1 * h) - FATOR_FEMININO_2;
		}
		
		if (sexo.equalsIgnoreCase("M")) {
			pesoIdeal = (FATOR_MASCULINO_1 * h) - FATOR_MASCULINO_2;
		}
		
		return pesoIdeal;
		
	}
	
	/**
	 * Faz o c�lculo de B�skara para a equa��o do segundo grau.
	 * 
	 * @param a Termo em x ao quadrado.
	 * @param b Termo em x.
	 * @param c Termo em x elevado a zero.
	 * @return
	 */
	public static double[] calcularEquacao2Grau (double a, double b, double c) {
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if(delta < 0) {
			// N�o tem ra�zes reais.
			double[] vazio = {};
			return vazio;
		}
		
		if(delta == 0) {
			// Apenas uma ra�z real.
			double raiz = -b / 2 * a;
			double[] umaRaiz = {raiz};
			return umaRaiz;
		}
		
		// Duas ra�zes reais.
		double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
		double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;
		double[] raizes = {raiz1, raiz2};
		return raizes;
	}
	
	/**
	 * Calcula o valor final de um produto de acordo com uma condi��o.
	 * 
	 * @param precoNormal Pre�o da etiqueta.
	 * @param condicao Condi��o de pagamento.
	 * @return Pre�o final do produto.
	 */
	public static double calcularPagamento (double precoNormal, int condicao) {
		double precoFinal = precoNormal;
		switch (condicao) {
			case 1:
				precoFinal = precoNormal * 0.9;
				break;
				
			case 2:
				precoFinal = precoNormal * 0.95;
				break;
				
			case 3:
				precoFinal = precoNormal;
				break;
				
			case 4:
				precoFinal = precoNormal * 1.1;
				break;
		}
		return precoFinal;
	}
	
	/**
	 * Recebe dois n�meros inteiros e realiza a opera��o solicitada
	 * 
	 * @param v1 Primeiro n�mero.
	 * @param v2 Segundo n�mero.
	 * @param operacao Opera��o solicitada.
	 * @return Resultado da opera��o.
	 */
	public static double calcularInteiros (int v1, int v2, int operacao) {
		double operacaoRealizada = 0;
		switch (operacao) {
			case 1:
				operacaoRealizada = v1 + v2;
				break;
				
			case 2:
				operacaoRealizada = v1 - v2;			
				break;
				
			case 3:
				operacaoRealizada = v1 * v2;
				break;
				
			case 4:
				operacaoRealizada = v1 / v2;
				break;
		}
		return operacaoRealizada;
	}
	
	/**
	 * Recebe tr�s pontos do plano cartesiano, indica se os mesmos formam um tri�ngulo. Caso verdadeiro,
indicar se formam um tri�ngulo escaleno, is�celes ou eq�il�tero.
	 * 
	 * @param x1 X1
	 * @param y1 Y1
	 * @param x2 X2
	 * @param y2 Y2
	 * @param x3 X3
	 * @param y3 Y3
	 * @return Tipo do tri�ngulo.
	 */
	public static String verificarTipoDoTriangulo(int x1, int y1, int x2, int y2, int x3, int y3) {
		int p1 = x1 + y1;
		int p2 = x2 + y2;
		int p3 = x3 + y3;
		String tipo = "";
		if (p1 > (p2 + p3) && p2 > (p1 + p3) && p3 > (p1 + p2)) {
			return "N�o formam tri�ngulo";
		}
		if (p1 != p2 && p1 != p3 && p2 != p3) {
			tipo = "Tri�ngulo escaleno";
		}
		if (p1 == p2 || p2 == p3 || p3 == p1) {
			tipo = "Tri�ngulo is�celes";
		}
		if (p1 == p2 && p2 == p3 && p3 == p1) {
			tipo = "Tri�ngulo eq�il�tero";
		}
		return tipo;
	}
	
	/**
	 * Calcula o fatorial de um n�mero.
	 * 
	 * @param num Numero que se deseja calcular o fatorial.
	 * @return Resultado do fatorial do n�mero escolhido.
	 */
	public static int calcularFatorial (int num) {
		int resultado = 1;
		for (int i = 2; i <= num; i++) {
			resultado *= i;
		}
		return resultado;
	}
	
	/**
	 * Verifica se um n�mero � perfeito ou n�o.
	 * 
	 * @param num N�mero escolhido pelo usu�rio para verifica��o.
	 * @return True = n�mero perfeito, false = n�mero n�o perfeito.
	 */
	public static boolean verificarNumeroPerfeito(int num) {
		boolean result = true;
		int soma = 1;
		for (int i = 2; i < num; i++) {
			if (num %i == 0) {
				soma += i;
			}
		}
		if (num != soma) {
			result = false;
		}
		return result;
	}
	
	/**
	 * Verifica se um n�mero � primo ou n�o.
	 * 
	 * @param num N�mero escolhido pelo usu�rio para verifica��o.
	 * @return True = primo, false = n�o � primo.
	 */
	public static boolean verificarNumeroPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Cria a s�rie de Fibonacci utilizando Vetor primitivo.
	 * 
	 * @param quantidade Quantidade de elementos da s�rie.
	 * @return Um vetor primitivo de inteiros com a s�rie de Fibonacci.
	 */
	public static int[] criaSerieFibonacciComVetor(int quantidade) {
		
		int[] fibonacci = new int[quantidade];
		
		for (int i = 0; i < fibonacci.length; i++) {
			if (i == 0 || i == 1) {
				fibonacci[i] = 1;
			} else {
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			}
		}
		
		return fibonacci;
		
	}
	
	/**
	 * Cria a s�rie de Fibonacci utilizando {@link ArrayList}.
	 * 
	 * @param quantidade Quantidade de elementos da s�rie.
	 * @return Um {@link ArrayList} de inteiros com a s�rie de Fibonacci.
	 */
	public static ArrayList<Integer> criarSerieFibonacciComArray(int quantidade) {
		
		ArrayList<Integer> fibonacci = new ArrayList<>();
		for (int i = 0; i < quantidade; i++) {
			if (i == 0 || i == 1) {
				fibonacci.add(1);
			} else {
				int valor = fibonacci.get(i-1) + fibonacci.get(i-2);
				fibonacci.add(valor);
			}
		}
		return fibonacci;
		
	}
	
	/**
	 * Efetua a convers�o da representa��o de um n�mero na base 10 para uma
representa��o em String desse n�mero na base 8 ou na base 2.
	 * 
	 * @param num N�mero inteiro informado pelo usu�rio para convers�o.
	 * @return N�mero convertido.
	 */
	public static String converterDecimalBase8(int num) {
		int cont = 0, resto = 0, quociente = 0;
		String base8 = "";
		ArrayList<Integer> array = new ArrayList<>();
		while (num > 0) {
				quociente = num / 8;
				resto = num - ((num / 8) * 8);
				array.add(resto);
				num = quociente;
				System.out.println(cont);
		}
		Collections.reverse(array);
		for (int i = 0; i < array.size(); i++) {
			base8 = base8 + Integer.toString(array.get(i));
		}
		return base8;
	}
	
	/**
	 * Cria a sequ�ncia do exerc�cio 11.
	 * 
	 * @param n N�mero qualquer.
	 * @return Sequ�ncia.
	 */
	public static ArrayList<Integer> criarSequencia01(int n) {
		ArrayList<Integer> sequencia = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				sequencia.add(i);
			}
		}
		return sequencia;
	}
	
	/**
	 * Cria a sequ�ncia do exerc�cio 12.
	 * 
	 * @param n N�mero qualquer.
	 * @return Sequ�ncia.
	 */
	public static ArrayList<Integer> criarSequencia02(int n) {
		ArrayList<Integer> sequencia = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				sequencia.add(j);
			}
		}
		return sequencia;
	}
	
	/**
	 * M�todo respons�vel por contabilizar a quantidade de n�meros pares e �mpares inseridos pelo usu�rio.
	 * 
	 * @param opcao 1 = �mpar, 2 = par.
	 * @param numero N�mero digitado pelo usu�rio
	 * @return Quantidade de n�meros pares e n�meros �mpares digitados.
	 */
	public static int[] contabilizaParImpar(int opcao, int numero) {
		int[] quantidadeParImpar = new int[2];
		int somaImpar = 0;
		int somaPar = 0;
		if (opcao == 1) {
			somaImpar++;
		}
		if (opcao == 2) {
			somaPar++;
		}
		quantidadeParImpar[0] = somaImpar;
		quantidadeParImpar[1] = somaPar;
		return quantidadeParImpar;
	}
	
}