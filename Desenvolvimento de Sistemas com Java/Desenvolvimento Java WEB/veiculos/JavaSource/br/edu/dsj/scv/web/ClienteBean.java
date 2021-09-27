package br.edu.dsj.scv.web;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.dsj.scv.entidade.Cliente;
import br.edu.dsj.scv.modelo.ServicoCliente;
import br.edu.dsj.scv.web.util.JSFUtils;

@Named
@RequestScoped
public class ClienteBean {
	
	@EJB
	private ServicoCliente servicoCliente;
	
	private Cliente cliente;
	
	public ClienteBean() {
		this.setCliente(new Cliente());
	}
	
	public void cadastrarCliente() {
		this.servicoCliente.cadastrarCliente(this.cliente);
		JSFUtils.enviarMensagemDeSucesso("Cliente cadastrado com sucesso!");
		this.cliente = new Cliente();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}