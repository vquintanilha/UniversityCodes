import java.util.Date;

public class EmpregadoEventual extends Empregado {

	private Double valorContratado;

	/**
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param telefone
	 * @param dataContratacao
	 * @param dataDemissao
	 * @param matricula
	 */
	public EmpregadoEventual(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double valorContratado) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		this.valorContratado = valorContratado;
	}

	public Double getValorContratado() {
		return valorContratado;
	}

	public void setValorContratado(Double valorContratado) {
		this.valorContratado = valorContratado;
	}

	@Override
	public Double getValorAPagar() {
		return this.valorContratado;
	}
	
}
