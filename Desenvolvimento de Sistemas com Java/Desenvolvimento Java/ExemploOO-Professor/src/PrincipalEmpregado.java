import java.util.ArrayList;
import java.util.Date;

public class PrincipalEmpregado {

	public static void main(String[] args) {

		EmpregadoMensal lidia = new EmpregadoMensal("Lidia", new Date(), "lidia@up.com", "41 99999", new Date(), null,
				"789456", 1200.23d);
		EmpregadoHorista carlos = new EmpregadoHorista("Carlos", new Date(), "carlos@cc.com", "78997789", new Date(),
				null, "12345", 10.5d, 150);

		EmpregadoComissionado joao = new EmpregadoComissionado("Joao", new Date(), "joao@cc.com", "54564", new Date(),
				null, "12789", 4000d, 10000d);
		
		EmpregadoProdutividade alcindo = new EmpregadoProdutividade(
				"Alcindo", new Date(), "a@a.comk", 
				"12431234", new Date(), null, 
				"123123", 1000.0d, 1.8);

		ArrayList<Empregado> empregados = new ArrayList<>();
		empregados.add(lidia);
		empregados.add(carlos);
		empregados.add(joao);
		empregados.add(alcindo);

		FolhaPagamento.imprimirFolhaEmpregados(empregados);

	}

}
