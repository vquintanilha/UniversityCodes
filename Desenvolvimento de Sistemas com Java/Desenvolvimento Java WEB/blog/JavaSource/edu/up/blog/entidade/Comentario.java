package edu.up.blog.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Representa um {@link Comentario} de um blog
 * 
 * @author Aluno
 *
 */
@Entity
public class Comentario {

	@Id
	@SequenceGenerator(name = "CONTADOR_COMENTARIO", sequenceName = "NUN_SEQ_BLOG", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTADOR_COMENTARIO")
	private Integer id;

	@NotBlank
	private String usuario;

	@NotBlank
	@Size(min = 10, max = 140)
	private String postagem;

	@NotBlank
	private String tipo;

	private Date dataHora;

	private Integer curtidas;

	public Comentario() {

	}

	public void curtir() {
		this.curtidas++;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPostagem() {
		return postagem;
	}

	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
