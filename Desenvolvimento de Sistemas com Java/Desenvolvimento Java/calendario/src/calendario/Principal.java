package calendario;

import java.util.ArrayList;

/**
 * Classe para criar o calendário.
 * @author 1829203
 *
 */
public class Principal {
	
	public static void main(String[] args) {
		String[] opcoes = { "Verificar ano Bissexto",
							"Mostrar mês"};
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Calendário", null);
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
	 * Mostra os dias de um mês em um ano específico.
	 */
	private static void mostrarMes() {
		int mes = Console.recuperaInteiro("Informe o mês de 1 à 12:");
		int ano = Console.recuperaInteiro("Informe o ano:");
		ArrayList<Integer> diasDoMes = Calendario.criarDiasDoMes(mes, ano);
		System.out.println(diasDoMes);
	}

	/**
	 * Verifica se um ano é bissexto pelo teclado.
	 */
	public static void verificarAnoBissexto() {
		int ano = Console.recuperaInteiro("Informe o ano que deseja verificar:");
		if (ano > 0) {
			boolean anoBissexto = Calendario.verificarAnoBissexto(ano);
			System.out.println(ano + " -> " + anoBissexto);
		} else {
			System.out.println("Ano inválido! O valor deve ser positivo.");
		}
	}
	
}