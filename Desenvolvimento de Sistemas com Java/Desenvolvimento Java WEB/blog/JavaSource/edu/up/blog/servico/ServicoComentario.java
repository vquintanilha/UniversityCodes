package edu.up.blog.servico;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.up.blog.entidade.Comentario;

/**
 * Regras de negócio e persistência para o {@link Comentario}
 * 
 * @author Aluno
 *
 */
@Stateless
public class ServicoComentario {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Cadastra o {@link Comentario} no banco de dados
	 * 
	 * @param comentario
	 */
	public void cadastrar(Comentario comentario) {
		comentario.setDataHora(new Date());
		comentario.setCurtidas(0);
		this.em.persist(comentario);
	}

	public List<Comentario> listar() {
		return this.em.createQuery("FROM Comentario c", Comentario.class).getResultList();
	}

	public void curtir(Comentario comentario) {
		comentario.curtir();
		this.em.merge(comentario);
	}
	
	public void excluir(Comentario comentario) throws Exception {
		if(comentario.getCurtidas() > 0) {
			throw new Exception("Não é possível excluir comentários curtidos!");
		}
		if(!comentario.getTipo().equalsIgnoreCase("Normal")) {
			throw new Exception("Apenas comentários normais podem ser excluídos!");
		}
		//daqui pra frente, posso excluir
		this.em.remove(this.em.merge(comentario));
	}

}
