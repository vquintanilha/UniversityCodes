import java.util.Date;

public class EmpregadoProdutividade extends Empregado {

	private Double salarioBase;

	private Double produtividade;

	/**
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param telefone
	 * @param dataContratacao
	 * @param dataDemissao
	 * @param matricula
	 * @param salarioBase
	 * @param produtividade
	 */
	public EmpregadoProdutividade(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double salarioBase, Double produtividade) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		this.salarioBase = salarioBase;
		this.produtividade = produtividade;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getProdutividade() {
		return produtividade;
	}

	public void setProdutividade(Double produtividade) {
		this.produtividade = produtividade;
	}

	@Override
	public Double getValorAPagar() {
		return this.salarioBase * this.produtividade;
	}

}
