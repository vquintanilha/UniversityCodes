import java.util.ArrayList;

public class FolhaPagamento {

	public static void imprimirFolhaEmpregados
						(ArrayList<Empregado> empregados) {
		
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