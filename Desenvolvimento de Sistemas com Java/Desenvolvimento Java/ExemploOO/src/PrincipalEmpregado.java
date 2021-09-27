import java.util.ArrayList;
import java.util.Date;

public class PrincipalEmpregado {

	public static void main(String[] args) {
		
		EmpregadoMensal lidia = new EmpregadoMensal("Lidia", 
				new Date(), "lidia@up.com", 
				"41 99999", new Date(), 
				null, "789456", 8574.23d);
		EmpregadoHorista carlos = new EmpregadoHorista("Carlos", 
				new Date(), "carlos@cc.com", "78997789", 
				new Date(), null, "12345", 
				75.5d, 150);
		
		EmpregadoComissionado joao = new EmpregadoComissionado("Joao", 
				new Date(), "joao@cc.com", "54564", 
				new Date(), null, "12789", 85000d, 10000d); 

		
		ArrayList<Empregado> empregados = new ArrayList<>();
		empregados.add(lidia);
		empregados.add(carlos);
		empregados.add(joao);
		
		FolhaPagamento.imprimirFolhaEmpregados(empregados);
		
	}

}