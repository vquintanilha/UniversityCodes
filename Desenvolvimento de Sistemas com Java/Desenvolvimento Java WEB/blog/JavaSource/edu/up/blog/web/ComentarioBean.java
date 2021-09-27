package edu.up.blog.web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import edu.up.blog.entidade.Comentario;
import edu.up.blog.servico.ServicoComentario;
import edu.up.blog.web.utils.MsgUtils;

@Named
@RequestScoped
public class ComentarioBean {

	@EJB
	private ServicoComentario servicoComentario;

	private Comentario comentario;

	public ComentarioBean() {
		this.comentario = new Comentario();
	}

	public void cadastrar() {
		this.servicoComentario.cadastrar(this.comentario);
		MsgUtils.enviarSucesso("Comentário cadastrado!");
		this.comentario = new Comentario();
	}

	public void curtir(Comentario comentario) {
		this.servicoComentario.curtir(comentario);
		MsgUtils.enviarAtencao("Postagem curtida!");
	}

	public void excluir(Comentario comentario) {
		try {
			this.servicoComentario.excluir(comentario);
			MsgUtils.enviarSucesso("Comentário excluído!");
		} catch (Exception e) {
			MsgUtils.enviarAtencao(e.getMessage());
		}
	}

	public List<Comentario> listar() {
		return this.servicoComentario.listar();
	}

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

}
