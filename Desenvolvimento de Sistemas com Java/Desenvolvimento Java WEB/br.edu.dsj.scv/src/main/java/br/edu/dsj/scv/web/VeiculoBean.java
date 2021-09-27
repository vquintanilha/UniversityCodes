package br.edu.dsj.scv.web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.dsj.scv.entidade.Veiculo;
import br.edu.dsj.scv.modelo.ServicoVeiculo;
import br.edu.dsj.scv.web.util.JSFUtils;

@Named
@RequestScoped
public class VeiculoBean {

	@EJB
	private ServicoVeiculo servicoVeiculo;

	private Veiculo veiculo;

	public VeiculoBean() {
		this.veiculo = new Veiculo();
	}

	public void salvarVeiculo() {
		this.servicoVeiculo.cadastrarVeiculo(this.veiculo);
		this.veiculo = new Veiculo();
		JSFUtils.enviarMensagemDeSucesso("Ve�culo cadastrado com sucesso!");
	}

	public List<Veiculo> listarVeiculos() {
		return this.servicoVeiculo.listar();
	}

	public void excluirVeiculo(Veiculo veiculo) {
		this.servicoVeiculo.excluirVeiculo(veiculo);
		JSFUtils.enviarMensagemDeSucesso("Ve�culo exclu�do com sucesso!");
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
