package com.victor.servico;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.victor.entidade.Comentario;
import com.victor.enumerado.Tipo;

@Stateless
public class ServicoComentario {
	
	@PersistenceContext
	private EntityManager em;
	
	public void cadastrarComentario(Comentario comentario) {
		this.em.persist(comentario);
	}
	
	public List<Comentario> listarComentarios() {
		return this.em.createQuery("FROM Comentario c", Comentario.class).getResultList();
	}
	
	public void excluirComentario(Comentario comentario) throws Exception {
		
		List<Comentario> comentariosFiltrados = verificarCurtidasTipo(comentario.getId());
		
		if(comentariosFiltrados.get(0).getCurtidas() == 0) {
			if(comentariosFiltrados.get(0).getTipo() == Tipo.NORMAL)
				this.em.remove(this.em.merge(comentario));
			else {
				throw new Exception("Este comentário não é do tipo normal, não é possível deletá-lo!");
			}
		} else {
			throw new Exception("Este comentário possui curtidas, não é possível deletá-lo!");
		}
	}
	
	public void curtirComentario(Comentario comentario) {
		Integer curtidas = comentario.getCurtidas();
		curtidas++;
		comentario.setCurtidas(curtidas);
		this.em.merge(comentario);
	}
	
	public List<Comentario> verificarCurtidasTipo(Integer id) {
		return this.em.createQuery("SELECT c FROM Comentario c WHERE c.id=:p1", Comentario.class).setParameter("p1", id).getResultList();
	}
	
}