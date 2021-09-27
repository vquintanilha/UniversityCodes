package calendario;

import java.util.ArrayList;

/**
 * Classe para confec��o de Calend�rio.
 * 
 * @author 1829203
 *
 */
public class Calendario {
	
	/**
	 * Verifica se o ano informado � bissexto.
	 * 
	 * @param ano Ano escolhido para verifica��o.
	 * @return True para bissexto e false pra n�o bissexto.
	 */
	public static boolean verificarAnoBissexto (int ano) {
		// return (ano %4 == 0 && ano %100 != 0) || (ano %400 == 0);
		if (ano %4 == 0 && ano %100 != 0 || ano %400 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Cria uma lista com os dias do m�s e ano informados.
	 * 
	 * @param mes De 01 a 12.
	 * @param ano Qualquer valor positivo.
	 * @return Lista com os dias do m�s.
	 */
	public static ArrayList<Integer> criarDiasDoMes(int mes, int ano) {
		
		int quantidadeDeDias = 31;
		
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			quantidadeDeDias = 30;
		}
		if (mes == 2) {
			boolean eBissexto = verificarAnoBissexto(ano);
			if (eBissexto) {
				quantidadeDeDias = 29;
			} else {
				quantidadeDeDias = 28;
			}
		}
		
		ArrayList<Integer> diasDoMes = new ArrayList<>();
		for (int i = 1; i <= quantidadeDeDias; i++) {
			diasDoMes.add(i);
		}
		
		return diasDoMes;
		
	}
	
}