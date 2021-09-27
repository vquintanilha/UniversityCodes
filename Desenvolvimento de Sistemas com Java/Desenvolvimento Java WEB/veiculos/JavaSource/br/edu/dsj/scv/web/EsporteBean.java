package br.edu.dsj.scv.web;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.dsj.scv.entidade.Esporte;
import br.edu.dsj.scv.modelo.ServicoEsporte;
import br.edu.dsj.scv.web.util.JSFUtils;

@Named
@RequestScoped
public class EsporteBean {

	@EJB
	private ServicoEsporte servicoEsporte;

	private Esporte esporte;

	private List<Esporte> esportes;

	public EsporteBean() {
		this.esporte = new Esporte();
	}

	@PostConstruct
	public void init() {
		this.esportes = this.servicoEsporte.listar();
	}

	public void cadastrarEsporte() {
		this.servicoEsporte.cadastrarEsporte(this.esporte);
		JSFUtils.enviarMensagemDeSucesso("Esporte cadastrado com sucesso!");
		this.esporte = new Esporte();
	}

	public List<Esporte> getEsportes() {
		return esportes;
	}

	public void setEsportes(List<Esporte> esportes) {
		this.esportes = esportes;
	}

	public Esporte getEsporte() {
		return esporte;
	}

	public void setEsporte(Esporte esporte) {
		this.esporte = esporte;
	}

}
