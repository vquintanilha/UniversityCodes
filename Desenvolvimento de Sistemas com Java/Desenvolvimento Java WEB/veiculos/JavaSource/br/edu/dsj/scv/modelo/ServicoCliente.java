package br.edu.dsj.scv.modelo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.dsj.scv.entidade.Cliente;

@Stateless
public class ServicoCliente {
	
	@PersistenceContext
	private EntityManager em;
	
	public void cadastrarCliente(Cliente cliente) {
		this.em.persist(cliente);
	}
	
}