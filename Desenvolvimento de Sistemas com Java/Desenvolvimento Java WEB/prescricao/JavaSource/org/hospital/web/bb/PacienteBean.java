package org.hospital.web.bb;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.hospital.entidade.Paciente;
import org.hospital.servico.ServicoPaciente;
import org.hospital.web.util.JSFUtils;

@Named
@RequestScoped
public class PacienteBean {
	
	@EJB
	private ServicoPaciente servicoPaciente;
	
	private Paciente paciente;
	
	public PacienteBean() {
		this.setPaciente(new Paciente());
	}

	public void cadastrar() {
		try {
			this.servicoPaciente.cadastrar(this.paciente);
			this.paciente = new Paciente();
			JSFUtils.enviarMensagemDeSucesso("Paciente cadastrado com sucesso!");
		} catch(Exception e) {
			JSFUtils.enviarMensagemDeSucesso(e.getMessage());
		}
	}
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
}