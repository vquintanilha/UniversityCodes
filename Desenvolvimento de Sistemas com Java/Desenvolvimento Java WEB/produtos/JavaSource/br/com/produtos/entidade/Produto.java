package br.com.produtos.entidade;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Produto {
	
	@Id
	@SequenceGenerator(sequenceName = "PRODUTO_SEQUENCIAL", name = "NUM_SEQ_PRODUTO", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUTO_SEQUENCIAL")
	private Integer id;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Marca_id")
	private Marca marca;
	
	@NotBlank
	private String nome;
	
	@NotNull
	@Min(value = 0)
	private Double valor;
	
	public Produto() {
		
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}