import java.util.Date;

public class EmpregadoMensal extends Empregado {

	private Double salario;

	public EmpregadoMensal(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double salario) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public Double getValorAPagar() {
		return this.salario;
	}

}
