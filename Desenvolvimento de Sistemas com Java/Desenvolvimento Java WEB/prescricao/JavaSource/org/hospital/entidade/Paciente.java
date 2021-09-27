package org.hospital.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Representa um paciente que será internado.
 * 
 * @author 1829203
 *
 */
@Entity
public class Paciente {

	@Id
	@SequenceGenerator(name = "PACIENTE_SEQUENCIAL", sequenceName = "NUM_SEQ_PACIENTE", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PACIENTE_SEQUENCIAL")
	private Integer id;
	
	@NotBlank
	private String nome;
	
	@NotNull
	@Min(value = 12, message = "Vá para o Pequeno Príncipe!")
	private Integer idade;
	
	@NotBlank
	private String cpf;
	
	@NotBlank
	private String sexo;
	
	@NotNull
	@FutureOrPresent
	private Date dataInternacao;
	
	public Paciente() {
		
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataInternacao() {
		return dataInternacao;
	}

	public void setDataInternacao(Date dataInternacao) {
		this.dataInternacao = dataInternacao;
	}
	
}