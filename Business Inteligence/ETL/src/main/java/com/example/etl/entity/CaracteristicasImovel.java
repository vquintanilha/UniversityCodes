package com.example.etl.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CARACTERISTICAS_IMOVEL")
public class CaracteristicasImovel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GUIDCARACTERISTICASIMOVEL")
	private Integer guidCaracteristicasImovel;
	
	@Column(name = "FAIXA_VALOR_VENDA")
	@NotNull
	private String faixaValorVenda;
	
	@Column(name = "FAIXA_IPTU")
	private String faixaIPTU;
	
	@Column(name = "FAIXA_CONDOMINIO")
	private String faixaCondominio;
	
	@Column(name = "FAIXA_AREA_TOTAL")
	private String faixaAreaTotal;
	
	@Column(name = "FAIXA_AREA_PRIVATIVA")
	private String faixaAreaPrivativa;
	
	@Column(name = "SACADA")
	private String sacada;
	
	@Column(name = "PORTARIA")
	private String portaria;
	
	@Column(name = "ELEVADOR")
	private String elevador;
	
	@Column(name = "CHURRASQUEIRA")
	private String churrasqueira;
	
	@Column(name = "QUANTIDADE_DORMITORIOS")
	private Integer quantidadeDormitorios;
	
	@Column(name = "QUANTIDADE_SUITES")
	private Integer quantidadeSuites;
	
	@Column(name = "QUANTIDADE_VAGAS")
	private Integer quantidadeVagas;
	
	@Column(name = "QUANTIDADE_BANHEIROS")
	private Integer quantidadeBanheiros;

	public CaracteristicasImovel() {
	}

	public CaracteristicasImovel(Integer guidCaracteristicasImovel, @NotNull String faixaValorVenda, String faixaIPTU,
			String faixaCondominio, String faixaAreaTotal, String faixaAreaPrivativa, String sacada, String portaria,
			String elevador, String churrasqueira, Integer quantidadeDormitorios, Integer quantidadeSuites,
			Integer quantidadeVagas, Integer quantidadeBanheiros) {
		super();
		this.guidCaracteristicasImovel = guidCaracteristicasImovel;
		this.faixaValorVenda = faixaValorVenda;
		this.faixaIPTU = faixaIPTU;
		this.faixaCondominio = faixaCondominio;
		this.faixaAreaTotal = faixaAreaTotal;
		this.faixaAreaPrivativa = faixaAreaPrivativa;
		this.sacada = sacada;
		this.portaria = portaria;
		this.elevador = elevador;
		this.churrasqueira = churrasqueira;
		this.quantidadeDormitorios = quantidadeDormitorios;
		this.quantidadeSuites = quantidadeSuites;
		this.quantidadeVagas = quantidadeVagas;
		this.quantidadeBanheiros = quantidadeBanheiros;
	}

	public Integer getGuidCaracteristicasImovel() {
		return guidCaracteristicasImovel;
	}

	public void setGuidCaracteristicasImovel(Integer guidCaracteristicasImovel) {
		this.guidCaracteristicasImovel = guidCaracteristicasImovel;
	}

	public String getFaixaValorVenda() {
		return faixaValorVenda;
	}

	public void setFaixaValorVenda(String faixaValorVenda) {
		this.faixaValorVenda = faixaValorVenda;
	}

	public String getFaixaIPTU() {
		return faixaIPTU;
	}

	public void setFaixaIPTU(String faixaIPTU) {
		this.faixaIPTU = faixaIPTU;
	}

	public String getFaixaCondominio() {
		return faixaCondominio;
	}

	public void setFaixaCondominio(String faixaCondominio) {
		this.faixaCondominio = faixaCondominio;
	}

	public String getFaixaAreaTotal() {
		return faixaAreaTotal;
	}

	public void setFaixaAreaTotal(String faixaAreaTotal) {
		this.faixaAreaTotal = faixaAreaTotal;
	}

	public String getFaixaAreaPrivativa() {
		return faixaAreaPrivativa;
	}

	public void setFaixaAreaPrivativa(String faixaAreaPrivativa) {
		this.faixaAreaPrivativa = faixaAreaPrivativa;
	}

	public String getSacada() {
		return sacada;
	}

	public void setSacada(String sacada) {
		this.sacada = sacada;
	}

	public String getPortaria() {
		return portaria;
	}

	public void setPortaria(String portaria) {
		this.portaria = portaria;
	}

	public String getElevador() {
		return elevador;
	}

	public void setElevador(String elevador) {
		this.elevador = elevador;
	}

	public String getChurrasqueira() {
		return churrasqueira;
	}

	public void setChurrasqueira(String churrasqueira) {
		this.churrasqueira = churrasqueira;
	}

	public Integer getQuantidadeDormitorios() {
		return quantidadeDormitorios;
	}

	public void setQuantidadeDormitorios(Integer quantidadeDormitorios) {
		this.quantidadeDormitorios = quantidadeDormitorios;
	}

	public Integer getQuantidadeSuites() {
		return quantidadeSuites;
	}

	public void setQuantidadeSuites(Integer quantidadeSuites) {
		this.quantidadeSuites = quantidadeSuites;
	}

	public Integer getQuantidadeVagas() {
		return quantidadeVagas;
	}

	public void setQuantidadeVagas(Integer quantidadeVagas) {
		this.quantidadeVagas = quantidadeVagas;
	}

	public Integer getQuantidadeBanheiros() {
		return quantidadeBanheiros;
	}

	public void setQuantidadeBanheiros(Integer quantidadeBanheiros) {
		this.quantidadeBanheiros = quantidadeBanheiros;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
