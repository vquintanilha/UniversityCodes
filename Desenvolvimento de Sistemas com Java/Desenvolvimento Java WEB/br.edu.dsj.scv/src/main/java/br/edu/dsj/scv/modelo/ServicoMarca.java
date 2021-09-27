package br.edu.dsj.scv.modelo;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;

import br.edu.dsj.scv.entidade.Marca;
import br.edu.dsj.scv.entidade.Veiculo;

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

	public void excluirMarca(Marca marca) throws Exception {
		if (listarVeiculoPorMarca(marca).isEmpty()) {
			this.em.remove(this.em.merge(marca));
		} else {
			throw new Exception("Não foi possivel remover a marca porque existem veículos associados!");
		}
	}

	@GET
	public List<Veiculo> listarVeiculoPorMarca(Marca marca) {
		return this.em.createQuery("From Veiculo v WHERE v.marca=:p1", Veiculo.class).setParameter("p1", marca)
				.getResultList();
	}

	public List<Marca> listar() {
		return this.em.createQuery("FROM Marca m", Marca.class).getResultList();
	}

}
