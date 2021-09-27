package br.com.transacao.bean;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.transacao.entidade.Cliente;
import br.com.transacao.servico.ServicoCliente;
import br.com.transacao.util.JSFUtils;

@Named
@RequestScoped
public class ClienteBean {
	
	@EJB
	private ServicoCliente servicoCliente;
	
	private Cliente cliente;
	
	public ClienteBean() {
		this.setCliente(new Cliente());
	}
	
	public void cadastrar() {
		try {
			this.servicoCliente.cadastrar(this.cliente);
			this.cliente = new Cliente();
			JSFUtils.enviarMensagemDeSucesso("Cliente cadastrado com sucesso!");
		} catch (Exception e) {
			JSFUtils.enviarMensagemDeSucesso(e.getMessage());
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}