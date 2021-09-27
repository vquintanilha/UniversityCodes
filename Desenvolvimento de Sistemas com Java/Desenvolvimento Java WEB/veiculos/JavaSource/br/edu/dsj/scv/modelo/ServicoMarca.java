package br.edu.dsj.scv.modelo;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.dsj.scv.entidade.Marca;

/**
 * Classe para teste de persistencia.
 * 
 * @author 4694
 *
 */
@Stateless
public class ServicoMarca {
	
	@PersistenceContext	
	private EntityManager em;
	
	public void cadastrarMarca(Marca marca) {
		this.em.persist(marca);
	}
	
	public void excluirMarca(Marca marca) {
		this.em.remove(this.em.merge(marca));
	}

	public List<Marca> listar() {
		return this.em.createQuery("FROM Marca m", Marca.class).getResultList();
	}
	
}