package br.com.produtos.bean;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.produtos.entidade.Marca;
import br.com.produtos.servico.ServicoMarca;
import br.com.produtos.util.JSFUtils;

@Named
@RequestScoped
public class MarcaBean {
	
	@EJB
	private ServicoMarca servicomarca;
	
	private Marca marca;

	public MarcaBean() {
		this.setMarca(new Marca());
	}
	
	public void cadastrar() {
		try {
			this.servicomarca.cadastrarMarca(marca);
			this.marca = new Marca();
			JSFUtils.enviarMensagemDeSucesso("Marca Cadastrada com sucesso");
		} catch (Exception e) {
			JSFUtils.enviarMensagemDeSucesso(e.getMessage());
		}
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}