package br.com.produtos.bean;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.produtos.entidade.Produto;
import br.com.produtos.servico.ServicoProduto;
import br.com.produtos.util.JSFUtils;

@Named
@RequestScoped
public class ProdutoBean {
	
	@EJB
	private ServicoProduto servicoProduto;
	
	private Produto produto;
	
	public ProdutoBean() {
		this.setProduto(new Produto());
	}
	
	public void cadastrar() {
		try {
			this.servicoProduto.cadastrarProduto(this.produto);
			this.produto = new Produto();
			JSFUtils.enviarMensagemDeSucesso("Produto cadastrado com sucesso!");
		} catch (Exception e) {
			JSFUtils.enviarMensagemDeSucesso(e.getMessage());
		}
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}