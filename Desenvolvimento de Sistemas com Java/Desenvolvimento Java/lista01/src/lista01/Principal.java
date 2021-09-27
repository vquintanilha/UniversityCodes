package lista01;

/**
 * A classe Principal do sistema.
 * 
 * @author 1829203
 * @version 1.0
 * @since 28/02/2019
 *
 */
public class Principal {
	
	/**
	 * Função para iniciar o programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] opcoes = {"Enésimo termo PA",
						   "Distância entre pontos",
						   "Média aritmética",
						   "Média ponderada",
						   "Média harmônica",
						   "Conversão de temperaturas",
						   "Volume de um cilindro",
						   "Consumo",
						   "Porcentagem"};
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Lista 01", null);
			switch (opcao) {
			case 1:
				calcularEnesimoTermoPA();
				break;
				
			case 2:
				calcularDistanciaEntrePontos();
				break;
				
			case 3:
				calcularMediaAritmeticaAluno();
				break;
				
			case 4:
				calcularMediaPonderadaAluno();
				break;
				
			case 5:
				calcularMediaHarmonica();
				break;
				
			case 6:
				converterDeCelsiusParaFahrenheit();
				break;
				
			case 7:
				calcularVolumeCilindro();
				break;
				
			case 8:
				calcularLitrosViagem();
				break;
				
			case 9:
				calcularPorcentagem();
				break;
				
			case -1:
				continua = false;
				break;
			}
		} while (continua);
	}
	
	/**
	 * Faz a execução de tela do cálculo do enésimo termo da PA.
	 */
	public static void calcularEnesimoTermoPA() {
		// Pega as variáveis do teclado
		int a1 = Console.recuperaInteiro("Digite o termo a1:");
		int n = Console.recuperaInteiro("Digite o n:");
		int r = Console.recuperaInteiro("Digite a razão:");

		// Executa a conta
		int an = Exercicios.calcularEnesimoTermoPA(a1, n, r);

		// Mostra o resultado na tela
		System.out.println("O resultado é: " + an);
	}
	
	/**
	 * Faz a execução de tela da distância entre pontos.
	 */
	public static void calcularDistanciaEntrePontos() {

		double x1 = Console.recuperaDecimal("A coordenada X do ponto 1:");
		double y1 = Console.recuperaDecimal("A coordenada Y do ponto 1:");
		double x2 = Console.recuperaDecimal("A coordenada X do ponto 2:");
		double y2 = Console.recuperaDecimal("A coordenada Y do ponto 2:");
		
		double distancia = Exercicios.calcularDistanciaEntrePontos(x1, y1, x2, y2);
		
		//System.out.println("A distância é: " + distancia);
		System.out.printf("A distância é: %.4f\n\n", distancia);
	}
	
	/**
	 * Faz a execução de tela do cálculo da média aritmética de 3 notas.
	 */
	public static void calcularMediaAritmeticaAluno() {

		double n1 = Console.recuperaDecimal("Digite a primeira nota:");
		double n2 = Console.recuperaDecimal("Digite a segunda nota:");
		double n3 = Console.recuperaDecimal("Digite a terceira nota:");
		
		double mediaAritmetica = Exercicios.calcularMediaAritmeticaAluno(n1, n2, n3);
		
		//System.out.println("O resultado é: " + String.format("%.2f", mediaAritmetica));
		System.out.printf("O resultado é: %.2f\n\n", mediaAritmetica);
	}
	
	/**
	 * Faz a execução de tela do cálculo da média ponderada de 3 notas.
	 */
	public static void calcularMediaPonderadaAluno() {

		double n1 = Console.recuperaDecimal("Digite a primeira nota:");
		double n2 = Console.recuperaDecimal("Digite a segunda nota:");
		double n3 = Console.recuperaDecimal("Digite a terceira nota:");
		int peso1 = Console.recuperaInteiro("Digite o peso da 1ª nota:");
		int peso2 = Console.recuperaInteiro("Digite o peso da 2ª nota:");
		int peso3 = Console.recuperaInteiro("Digite o peso da 3ª nota:");
		
		double mediaPonderada = Exercicios.calcularMediaPonderadaAluno(n1, n2, n3, peso1, peso2, peso3);
		
		System.out.printf("O resultado é: %.2f\n\n", mediaPonderada);
	}
	
	/**
	 * Faz a execução de tela do cálculo da média harmônica.
	 */
	public static void calcularMediaHarmonica() {

		double nota1 = Console.recuperaDecimal("Digite a primeira nota:");
		double nota2 = Console.recuperaDecimal("Digite a segunda nota:");
		double nota3 = Console.recuperaDecimal("Digite a terceira nota:");
		
		double mediaHarmonica = Exercicios.calcularMediaHarmonica(nota1, nota2, nota3);
		
		System.out.printf("O resultado é: %.2f\n\n", mediaHarmonica);
	}
	
	/**
	 * Faz a execução de tela da conversão de uma temperatura de Celsius para Fahrenheit.
	 */
	public static void converterDeCelsiusParaFahrenheit() {

		double c = Console.recuperaDecimal("Digite uma temperatura em Celsius:");
		
		double conversaoCelsiusParaFahrenheit = Exercicios.converterDeCelsiusParaFahrenheit(c);
		
		System.out.printf("A temperatura em Fahrenheit é: %.0f°F\n\n", conversaoCelsiusParaFahrenheit);
	}
	
	/**
	 * Faz a execução de tela do cálculo do volume de um cilindro.
	 */
	public static void calcularVolumeCilindro() {

		double raio = Console.recuperaDecimal("Digite o raio do cilindro:");
		double altura = Console.recuperaDecimal("Digite a altura do cilindro:");
		
		double volumeCilindro = Exercicios.calcularVolumeCilindro(raio, altura);
		
		System.out.printf("O volume do cilindro é: %.2f\n\n", volumeCilindro);
	}
	
	/**
	 * Faz a execução de tela do cálculo de consumo de uma viagem.
	 */
	public static void calcularLitrosViagem() {

		double tempo = Console.recuperaDecimal("Digite o tempo da viagem em horas:");
		double velocidade = Console.recuperaDecimal("Digite a velocidade média em km/h:");
		
		double litrosViagem = Exercicios.calcularLitrosViagem(tempo, velocidade);
		
		System.out.printf("O consumo da viagem foi: %.2f\n\n", litrosViagem);
	}
	
	/**
	 * Faz a execução de tela do cálculo de porcentagem.
	 */
	public static void calcularPorcentagem() {

		double valor = Console.recuperaDecimal("Digite o valor inicial:");
		double porcentagem = Console.recuperaDecimal("Digite a porcentagem:");

		double resultadoPorcentagem = Exercicios.calcularPorcentagem(valor, porcentagem);

		System.out.printf("Resultado: %.2f\n\n", resultadoPorcentagem);
	}
	
}