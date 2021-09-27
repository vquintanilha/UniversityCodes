import java.util.ArrayList;
import java.util.Collections;

public class FolhaPagamento {

	public static void imprimirFolhaEmpregados
						(ArrayList<Empregado> empregados) {
		
		Collections.sort(empregados, new ComparaPorSalario());
		
		for (Empregado empregado : empregados) {
			
			String nome = empregado.getNome();
			String matricula = empregado.getMatricula();
			Double valorAPagar = empregado.getValorAPagar();
			
			System.out.println("Nome: " + nome 
					+ ", Matricula: " + matricula 
					+ ", Valor a pagar: " + valorAPagar + ".");
		}
		
	}

}
