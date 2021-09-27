package br.edu.dsj.scv.entidade;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

/**
 * Representa um Esporte preferido
 * 
 * @author 4694
 *
 */
@Entity
public class Esporte {

	@Id
	@SequenceGenerator(name = "NUM_SEQ_ESPORTE", sequenceName = "NUM_SEQ_ESPORTE", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_ESPORTE")
	private Integer id;

	@NotNull
	private String nome;

	@ManyToMany(mappedBy = "esportes", fetch = FetchType.LAZY)
	private List<Cliente> clientes;

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

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
