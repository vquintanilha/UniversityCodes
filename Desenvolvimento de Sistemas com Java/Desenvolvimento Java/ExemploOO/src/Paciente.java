import java.util.ArrayList;

/**
 * Classe para representar um Paciente em um compromisso.
 * 
 * @author 4694
 *
 */
public class Paciente {

	private String codigo;

	private String nome;

	private ArrayList<String> doencas;

	public Paciente() {

	}

	/**
	 * @param codigo
	 * @param nome
	 */
	public Paciente(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		this.doencas = new ArrayList<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getHistorico() {
		return this.doencas;
	}

	public void addHistorico(String doenca) {
		this.doencas.add(doenca);
	}

//	@Override
//	public String toString() {
//		return "Codigo:" + codigo + ", nome=" + nome;
//	}

}
