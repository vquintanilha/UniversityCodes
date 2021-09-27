package br.com.produtos.servico;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.produtos.entidade.Marca;

@Stateless
public class ServicoMarca {
	
	@PersistenceContext
	private EntityManager em;
	
	public void cadastrarMarca(Marca marca) throws Exception {
		List<Marca> existente = listarPorNome(marca.getNome());
		if(existente.isEmpty()) {
			this.em.persist(marca);
		} else {
			throw new Exception("Já existe uma marca com esse nome");
		}
	}
	
	public List<Marca> listarPorNome(String nome) {
		return this.em.createQuery("SELECT p FROM Marca p WHERE p.nome=:p1", Marca.class).setParameter("p1", nome).getResultList();
	}
	
}