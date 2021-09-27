package com.victor.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.victor.enumerado.Tipo;

@Entity
public class Comentario {
	
	@Id
	@SequenceGenerator(sequenceName = "COMENTARIOS_SEQUENCIA", name = "NUM_SEQ_COMENTARIOS", initialValue = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMENTARIOS_SEQUENCIA")
	private Integer id;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	@Length(min = 10, max = 140)
	private String comentario;
	
	@NotNull
	@Enumerated(value = EnumType.STRING)
	private Tipo tipo;
	
	private Date data;
	
	private Integer curtidas;
	
	public Comentario() {
		this.data = new Date();
		this.curtidas = 0;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}
	
}