package br.com.produtos.servico;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.produtos.entidade.Produto;

@Stateless
public class ServicoProduto {
	
	@PersistenceContext
	private EntityManager em;
	
	public void cadastrarProduto(Produto produto) throws Exception {
		List<Produto> existente = listarPorNome(produto.getNome());
		if(existente.isEmpty()) {
			this.em.persist(produto);
		} else {
			throw new Exception("Já existe produto cadastrado com o nome informado!");
		}
	}

	public List<Produto> listarPorNome(String nome) {
		return this.em.createQuery("SELECT p FROM Produto p WHERE p.nome=:p1", Produto.class).setParameter("p1", nome).getResultList();
	}
	
}