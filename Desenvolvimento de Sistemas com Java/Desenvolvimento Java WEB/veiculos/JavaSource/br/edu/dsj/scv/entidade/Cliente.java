package br.edu.dsj.scv.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

/**
 * Represente um {@link Cliente} que loca {@link Veiculo}
 * 
 * @author 1829203
 *
 */
@Entity
public class Cliente {
	
	@Id
	@SequenceGenerator(name = "NUM_SEQ_CLI", sequenceName = "NUM_SEQ_CLI", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_CLI")
	private Integer id;
	
	@ManyToMany(mappedBy = "clientes", fetch = FetchType.EAGER)
	private List<Esporte> esportes;
	
	private String nomeCompleto;
	
	private String cpf;
	
	private String rg;
	
	private String usuario;
	
	private String senha;
	
	private Date dataNascimento;
	
	private String sexo;
	
	private String cidade;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Esporte> getEsportes() {
		return esportes;
	}

	public void setEsportes(List<Esporte> esportes) {
		this.esportes = esportes;
	}
	
}