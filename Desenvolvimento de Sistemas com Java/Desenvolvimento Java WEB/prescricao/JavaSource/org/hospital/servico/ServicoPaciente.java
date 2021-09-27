package org.hospital.servico;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hospital.entidade.Paciente;

@Stateless
public class ServicoPaciente {
	
	@PersistenceContext
	private EntityManager em;
	
	public void cadastrar(Paciente paciente) throws Exception {
		List<Paciente> existente = listarPorCPF(paciente.getCpf());
		if(existente.isEmpty()) {
			this.em.persist(paciente);
		} else {
			throw new Exception("Já existe paciente cadastrado com o CPF informado!");
		}
	}
	
	public List<Paciente> listarPorCPF(String cpf) {
		return this.em.createQuery("SELECT p FROM Paciente p WHERE p.cpf=:p1", Paciente.class).setParameter("p1", cpf).getResultList();
	}
	
}