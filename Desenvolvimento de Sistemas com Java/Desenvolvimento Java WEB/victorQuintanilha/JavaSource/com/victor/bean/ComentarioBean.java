package com.victor.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.victor.entidade.Comentario;
import com.victor.servico.ServicoComentario;
import com.victor.util.JSFUtils;

@Named
@RequestScoped
public class ComentarioBean {
	
	@EJB
	private ServicoComentario servicoComentario;
	
	private Comentario comentario;
	
	private List<Comentario> comentarios;
	
	public ComentarioBean() {
		this.setComentario(new Comentario());
	}
	
	public void cadastrarComentario() {
		this.servicoComentario.cadastrarComentario(this.comentario);
		this.comentario = new Comentario();
		JSFUtils.enviarMensagemDeSucesso("Comentário cadastrado com sucesso!");
	}
	
	public List<Comentario> listarComentarios() {
		return this.servicoComentario.listarComentarios();
	}
	
	public void excluirComentario(Comentario comentario) {
		try {
			this.servicoComentario.excluirComentario(comentario);
			JSFUtils.enviarMensagemDeSucesso("Comentário excluido com sucesso!");
		} catch(Exception e) {
			JSFUtils.enviarMensagemDeSucesso(e.getMessage());
		}
	}
	
	public void curtirComentario(Comentario comentario) {
		this.servicoComentario.curtirComentario(comentario);
		JSFUtils.enviarMensagemDeSucesso("Comentário curtído com sucesso!");
	}

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
}