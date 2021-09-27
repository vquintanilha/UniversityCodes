package br.edu.dsj.scv.modelo;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.dsj.scv.entidade.Veiculo;

@Stateless
public class ServicoVeiculo {

	@PersistenceContext
	private EntityManager em;

	public void cadastrarVeiculo(Veiculo veiculo) {
		this.em.persist(veiculo);
	}

	public void excluirVeiculo(Veiculo veiculo) {
		this.em.remove(this.em.merge(veiculo));
	}

	public List<Veiculo> listar() {
		return this.em.createQuery("SELECT v FROM Veiculo v", Veiculo.class).getResultList();
	}

}
