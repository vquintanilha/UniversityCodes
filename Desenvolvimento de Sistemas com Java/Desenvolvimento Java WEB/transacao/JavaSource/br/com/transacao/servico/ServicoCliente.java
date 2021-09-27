package br.com.transacao.servico;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.transacao.entidade.Cliente;

@Stateless
public class ServicoCliente {
	
	@PersistenceContext
	private EntityManager em;
	
	public void cadastrar(Cliente cliente) throws Exception {
		List<Cliente> existente = listarPorCPF(cliente.getCpf());
		if(existente.isEmpty()) {
			this.em.persist(cliente);
		} else {
			throw new Exception("Já existe cliente cadastrado com este CPF informado!");
		}
	}
	
	public List<Cliente> listarPorCPF(String cpf) {
		return this.em.createQuery("SELECT c FROM Cliente c WHERE c.cpf=:c1", Cliente.class).setParameter("c1", cpf).getResultList();
	}
	
}