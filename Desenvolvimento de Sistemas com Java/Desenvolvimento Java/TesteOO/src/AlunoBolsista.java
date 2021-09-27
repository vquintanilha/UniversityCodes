/**
 * Representa um Aluno Bolsista.
 * 
 * @author 1829203
 *
 */
public class AlunoBolsista extends Aluno {
	
	public Double getSalario() {
		return 1000.0d;
	}
	
	@Override
	public String toString() {
		return "Bolsista";
	}
	
}
