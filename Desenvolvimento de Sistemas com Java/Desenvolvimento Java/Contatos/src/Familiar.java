
public class Familiar extends Contato {

	private String grauDeParentesco;

	public Familiar(int codigo, String nome, String telefone, String grauDeParentesco) {
		super(codigo, nome, telefone);
		this.grauDeParentesco = grauDeParentesco;
	}

	public String getGrauDeParentesco() {
		return grauDeParentesco;
	}

	public void setGrauDeParentesco(String grauDeParentesco) {
		this.grauDeParentesco = grauDeParentesco;
	}

	@Override
	public String toString() {
		return super.toString() + "\nGrau de Parentesco: " + grauDeParentesco;
	}
	
}