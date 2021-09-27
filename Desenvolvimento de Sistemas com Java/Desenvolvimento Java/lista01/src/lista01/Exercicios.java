package lista01;

/**
 * Classe para executar os exercícios da Lista 01
 * @author 1829203
 *
 */
public class Exercicios {
	
	/**
	 * Calcula o Enésimo termo da PA.
	 * 
	 * @param a1 - primeiro termo.
	 * @param n - indice do enésimo termo.
	 * @param r - razăo da PA.
	 * @return O Enésimo termo da PA.
	 */
	public static int calcularEnesimoTermoPA (int a1, int n, int r) {
		return a1 + (n-1) * r;
	}
	
	/**
	 * Calcula a distância entre dois pontos no plano cartesiano.
	 * @param x1 Coordenada x do ponto 1.
	 * @param y1 Coordenada y do ponto 1.
	 * @param x2 Coordenada x do ponto 2.
	 * @param y2 Coordenada y do ponto 2.
	 * @return A distância entre os pontos.
	 */
	public static double calcularDistanciaEntrePontos(double x1, double y1, double x2, double y2) {
		//return Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

		double distanciaX = x2 - x1;
		double distanciaY = y2 - y1;
		double quadradoDistanciaX = Math.pow(distanciaX, 2);
		double quadradoDistanciaY = Math.pow(distanciaY, 2);
		double somaQuadradoDistancias = quadradoDistanciaX + quadradoDistanciaY;
		double distancia = Math.sqrt(somaQuadradoDistancias);
		return distancia;
	}
	
	/**
	 * Calcula a média aritmética de 3 notas.
	 * 
	 * @param n1 Primeira nota do aluno.
	 * @param n2 Segunda nota do aluno.
	 * @param n3 Terceira nota do aluno.
	 * @return Média aritmética das 3 notas recebidas.
	 */
	public static double calcularMediaAritmeticaAluno (double n1, double n2, double n3) {
		return (n1 + n2 + n3) / 3;
	}
	
	/**
	 * Calcula a média ponderada de 3 notas.
	 * 
	 * @param n1 Primeira nota do aluno.
	 * @param n2 Segunda nota do aluno.
	 * @param n3 Terceira nota do aluno.
	 * @param peso1 Peso da primeira nota do aluno.
	 * @param peso2 Peso da segunda nota do aluno.
	 * @param peso3 Peso da terceira nota do aluno.
	 * @return Média ponderada das 3 notas recebidas.
	 */
	public static double calcularMediaPonderadaAluno (double n1, double n2, double n3, int peso1, int peso2, int peso3) {
		return ((n1 * peso1) + (n2 * peso2) + (n3 * peso3)) / (peso1 + peso2 + peso3);
	}
	
	/**
	 * Calcula a média harmônica de três notas.
	 * 
	 * @param nota1 Primeira nota do aluno.
	 * @param nota2	Segunda nota do aluno.
	 * @param nota3 Terceira nota do aluno.
	 * @return a média harmônica das três notas.
	 */
	public static double calcularMediaHarmonica (double nota1, double nota2, double nota3) {
		return 3 / (1 / nota1 + 1 / nota2 + 1 / nota3);
	}
	
	/**
	 * Converte uma temperatura em Celsius para Fahrenheit.
	 * 
	 * @param c - Temperatura em Celsius.
	 * @return - Retorna a temperatura convertida em Fahrenheit.
	 */
	public static double converterDeCelsiusParaFahrenheit (double c) {
		// 1.8 * c + 32
		return (12.6 * c + 224) / 7;
	}
	
	/**
	 * Calcula o volume de um cilindro.
	 * 
	 * @param raio - Raio do cilindro.
	 * @param altura - Altura do cilindro.
	 * @return - O volume do cilindro.
	 */
	public static double calcularVolumeCilindro (double raio, double altura) {
		return 3.14 * (raio * raio) * altura;
	}
	
	/**
	 * Calcula a quantidade de litros de combustível gasta em uma viagem.
	 * 
	 * @param tempo Tempo da viagem.
	 * @param velocidade Velocidade média da viagem.
	 * @return Consumo.
	 */
	public static double calcularLitrosViagem (double tempo, double velocidade) {
		return (tempo * velocidade) / 12;
	}
	
	/**
	 * Calcula a soma entre um valor e uma porcentagem.
	 * 
	 * @param valor Valor.
	 * @param porcentagem Porcentagem.
	 * @return Valor somado à porcentagem selecionada.
	 */
	public static double calcularPorcentagem (double valor, double porcentagem) {
		return valor + (valor * (porcentagem / 100));
	}
	
}