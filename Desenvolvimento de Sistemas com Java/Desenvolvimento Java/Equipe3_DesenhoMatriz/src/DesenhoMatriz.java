import java.util.ArrayList;

/**
 * Classe para executar os exercícios.
 * 
 * @autores Victor, Gleidson e Jociel
 *
 */
public class DesenhoMatriz {

	/**
	 * Desenha uma matriz em formato de X
	 * 
	 * @param dimensoes parametro que recebe a dimensao da matriz
	 * @param borda     parametro que recebe se a matriz tera borda ou nao
	 * @return Matriz em formato de X
	 */
	public static char[][] matrizX(int dimensao, boolean borda) {

		char[][] matrizDesenho = new char[dimensao][dimensao];

		for (int i = 0; i < dimensao; i++) {
			for (int j = 0; j < dimensao; j++) {
				if (i == j) {
					matrizDesenho[i][j] = 'X';
				}
				if (i + j == dimensao - 1) {
					matrizDesenho[i][j] = 'X';
				}
			}
		}

		if (borda == true) {
			matrizDesenho = colocarBorda(matrizDesenho);
		}

		return matrizDesenho;

	}

	/**
	 * Desenha uma matriz em formato de cruz
	 * 
	 * @param dimensoes parametro que recebe a dimensao da matriz
	 * @param borda     parametro que recebe se a matriz tera borda ou nao
	 * @return Matriz em formato de Cruz
	 */
	public static char[][] matrizCruz(int dimensao, boolean borda) {

		char[][] matrizDesenho = new char[dimensao][dimensao];
		int centro = dimensao / 2;
		if (dimensao % 2 == 0) {

			for (int i = 0; i < dimensao; i++) {
				for (int j = 0; j < dimensao; j++) {
					if (i == centro || i == centro - 1 || j == centro || j == centro - 1) {

						matrizDesenho[i][j] = 'X';
					}
				}
			}
		} else {

			for (int i = 0; i < dimensao; i++) {
				for (int j = 0; j < dimensao; j++) {
					if (i == centro || j == centro) {

						matrizDesenho[i][j] = 'X';
					}
				}
			}

		}

		if (borda == true) {
			matrizDesenho = colocarBorda(matrizDesenho);
		}

		return matrizDesenho;

	}
	
	/**
	 * Colocar borda na matriz desenho
	 * 
	 * @param matriz recebe matriz sem borda
	 * @return matriz com borda
	 */
	private static char[][] colocarBorda(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz.length - 1) {
					matriz[i][j] = 'X';
				}
			}
		}

		return matriz;

	}

	//ArrayList ------------------------------------------------------------------------------------------------------
	
	public static ArrayList<ArrayList<String>> matrizXArray(int dimensao, boolean borda) {


		
		ArrayList<ArrayList<String>> matrizDesenho = new ArrayList<>();
		
		
		for (int i = 0; i < dimensao; i++) {
			ArrayList<String> arrayDentro = new ArrayList<>();  
			for (int j = 0; j < dimensao; j++) {
				if (i == j) {
					arrayDentro.add("0");
				}else {
					arrayDentro.add("");
				}
				if (i + j == dimensao - 1) {
					arrayDentro.add("0");
				}else {
					arrayDentro.add("");
				}
			}
			matrizDesenho.add(arrayDentro);
		}

		//if (borda == true) {
		//	matrizDesenho = colocarBorda(matrizDesenho);
		//}

		return matrizDesenho;

	}
	
	
	
}