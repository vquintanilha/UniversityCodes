package calendario;

import java.util.ArrayList;

/**
 * Classe para criar o calend�rio.
 * @author 1829203
 *
 */
public class Principal {
	
	public static void main(String[] args) {
		String[] opcoes = { "Verificar ano Bissexto",
							"Mostrar m�s"};
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Calend�rio", null);
			switch (opcao) {
			case 1:
				verificarAnoBissexto();
				break;
				
			case 2:
				mostrarMes();
				break;

			case -1:
				continua = false;
				System.out.println("Saindo do programa...");
				break;
			}
		} while (continua);
	}

	/**
	 * Mostra os dias de um m�s em um ano espec�fico.
	 */
	private static void mostrarMes() {
		int mes = Console.recuperaInteiro("Informe o m�s de 1 � 12:");
		int ano = Console.recuperaInteiro("Informe o ano:");
		ArrayList<Integer> diasDoMes = Calendario.criarDiasDoMes(mes, ano);
		System.out.println(diasDoMes);
	}

	/**
	 * Verifica se um ano � bissexto pelo teclado.
	 */
	public static void verificarAnoBissexto() {
		int ano = Console.recuperaInteiro("Informe o ano que deseja verificar:");
		if (ano > 0) {
			boolean anoBissexto = Calendario.verificarAnoBissexto(ano);
			System.out.println(ano + " -> " + anoBissexto);
		} else {
			System.out.println("Ano inv�lido! O valor deve ser positivo.");
		}
	}
	
}