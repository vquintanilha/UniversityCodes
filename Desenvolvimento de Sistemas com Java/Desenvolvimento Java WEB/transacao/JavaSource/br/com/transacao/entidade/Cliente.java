package br.com.transacao.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Representa um cliente
 * 
 * @author 1829203
 *
 */
@Entity
public class Cliente {
	
	@Id
	@SequenceGenerator(sequenceName = "CLIENTE_SEQUENCIAL", name = "NUM_SEQ_CLIENTE", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENTE_SEQUENCIAL")
	private Integer id;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String email;
	
	@NotNull
	private Date dataNascimento;
	
	@NotBlank
	private String cpf;
	
	public Cliente() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}