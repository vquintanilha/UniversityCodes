package br.edu.dsj.scv.entidade;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

/**
 * Representa um Esporte preferido
 * 
 * @author 1829203
 *
 */
@Entity
public class Esporte {
	
	@Id
	@SequenceGenerator(name = "NUM_SEQ_ESPORTE", sequenceName = "NUM_SEQ_ESPORTE", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_ESPORTE")
	private Integer id;
	
	@NotBlank
	private String nome;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Cliente> clientes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}