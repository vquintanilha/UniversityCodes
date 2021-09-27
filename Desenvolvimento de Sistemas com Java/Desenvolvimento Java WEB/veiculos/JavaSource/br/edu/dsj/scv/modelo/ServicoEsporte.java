package br.edu.dsj.scv.modelo;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.dsj.scv.entidade.Esporte;

@Stateless
public class ServicoEsporte {

	@PersistenceContext
	private EntityManager em;
	
	public void cadastrarEsporte(Esporte esporte) {
		this.em.persist(esporte);
	}
	
	public List<Esporte> listar(){
		return this.em.createQuery("SELECT e FROM Esporte e", Esporte.class).getResultList();
	}
	
}