package br.com.produtos.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

@Entity
public class Marca {
	
	@Id
	@SequenceGenerator(sequenceName = "MARCA_SEQUENCIAL", name = "NUM_SEQ_MARCA", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MARCA_SEQUENCIAL")
	private Integer id;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String descricao;
	
	public Marca() {
		
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}