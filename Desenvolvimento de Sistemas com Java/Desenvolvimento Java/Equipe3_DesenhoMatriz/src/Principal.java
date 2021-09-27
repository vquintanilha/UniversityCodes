import java.util.ArrayList;

/**
 * Classe principal do programa.
 * 
 * @autores Victor, Gleidson e Jociel
 *
 */
public class Principal {

	/**
	 * Função para iniciar o programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String[] opcoes = { "Formar Matriz X", "Formar Matriz X com bordas", "Formar Matriz Cruz",
				"Formar Matriz Cruz com bordas", "Formar Matriz X com Array"};

		boolean continua = true;

		do {

			int opcao = Console.mostrarMenu(opcoes, "Desenhos com Matriz", null);

			switch (opcao) {
			case 1:
				formarMatrizX();
				break;

			case 2:
				formarMatrizXBorda();
				break;

			case 3:
				formarMatrizCruz();
				break;

			case 4:
				formarMatrizCruzBorda();
				break;

			case 5:
				formarMatrizXArray();
				break;

			case -1:
				continua = false;
				break;
			}

		} while (continua);

	}

	/**
	 * Executa a formação de uma matriz x.
	 */
	private static void formarMatrizX() {

		int dimensao = Console.recuperaInteiro("Informe a dimensão da matriz:");

		boolean bordaEscolhida = false;

		char[][] matrizX = DesenhoMatriz.matrizX(dimensao, bordaEscolhida);

		imprimeMatriz(matrizX);
	}

	/**
	 * Executa a formação de uma matriz x com borda.
	 */
	private static void formarMatrizXBorda() {

		int dimensao = Console.recuperaInteiro("Informe a dimensão da matriz:");

		boolean bordaEscolhida = true;

		char[][] matrizX = DesenhoMatriz.matrizX(dimensao, bordaEscolhida);

		imprimeMatriz(matrizX);
	}

	/**
	 * Executa a formação de uma matriz cruz.
	 */
	private static void formarMatrizCruz() {
		int dimensao = Console.recuperaInteiro("Informe a dimensão da matriz:");

		boolean bordaEscolhida = false;

		char[][] matrizCruz = DesenhoMatriz.matrizCruz(dimensao, bordaEscolhida);

		imprimeMatriz(matrizCruz);
	}

	/**
	 * Executa a formação de uma matriz cruz com borda.
	 */
	private static void formarMatrizCruzBorda() {
		int dimensao = Console.recuperaInteiro("Informe a dimensão da matriz:");

		boolean bordaEscolhida = true;

		char[][] matrizCruz = DesenhoMatriz.matrizCruz(dimensao, bordaEscolhida);

		imprimeMatriz(matrizCruz);
	}

	/**
	 * Imprimir matriz primitiva.
	 * 
	 * @param matriz Matriz.
	 * @return Impressão da matriz recebida.
	 */
	public static void imprimeMatriz(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("");
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
		}
		System.out.println("");
	}
	
	public static void formarMatrizXArray () {
		int dimensao = Console.recuperaInteiro("Informe a dimensão da matriz:");

		boolean bordaEscolhida = false;
		ArrayList<ArrayList<String>> matrizDesenho = new ArrayList<>();
		matrizDesenho = DesenhoMatriz.matrizXArray(dimensao, bordaEscolhida);
		System.out.println(matrizDesenho);
		
	}

}