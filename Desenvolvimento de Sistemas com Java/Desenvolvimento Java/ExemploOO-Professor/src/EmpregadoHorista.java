import java.util.Date;

public class EmpregadoHorista extends Empregado {

	private Double salarioPorHora;

	private Integer quantidadeHoras;

	/**
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param telefone
	 * @param dataContratacao
	 * @param dataDemissao
	 * @param matricula
	 */
	public EmpregadoHorista(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double salarioPorHora, Integer quantidadeHoras) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		this.salarioPorHora = salarioPorHora;
		this.quantidadeHoras = quantidadeHoras;
	}

	public Integer getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Integer quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public Double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(Double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}
	
	@Override
	public Double getValorAPagar() {
		return this.salarioPorHora * this.quantidadeHoras;
	}

}
