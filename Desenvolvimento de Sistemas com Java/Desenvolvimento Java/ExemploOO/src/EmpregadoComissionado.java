import java.util.Date;

public class EmpregadoComissionado extends Empregado {

	private Double comissao;

	private Double fixo;

	/**
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param telefone
	 * @param dataContratacao
	 * @param dataDemissao
	 * @param matricula
	 */
	public EmpregadoComissionado(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double comissao, Double fixo) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		this.comissao = comissao;
		this.fixo = fixo;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getFixo() {
		return fixo;
	}

	public void setFixo(Double fixo) {
		this.fixo = fixo;
	}

	@Override
	public Double getValorAPagar() {
		return this.comissao + this.fixo;
	}

}
