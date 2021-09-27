import java.util.Date;

public class Empregado {

	private String nome;

	private Date dataNascimento;

	private String email;

	private String telefone;

	private Date dataContratacao;

	private Date dataDemissao;

	private String matricula;

	/**
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param telefone
	 * @param dataContratacao
	 * @param dataDemissao
	 * @param matricula
	 */
	public Empregado(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.telefone = telefone;
		this.dataContratacao = dataContratacao;
		this.dataDemissao = dataDemissao;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Double getValorAPagar() {
		return 0d;
	}

}
