package com.example.etl.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "VENDA_IMOVEL")
public class VendaImovel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GUIDVENDAIMOVEL")
	private Integer guidVendaImovel;

	@Column(name = "TOTAL_VENDIDO")
	@NotNull
	private Integer totalVendido;
	
	@Column(name = "TOTAL_FINANCEIRO")
	@NotNull
	private Double totalFinanceiro;
	
	@Column(name = "VALOR_MEDIO")
	@NotNull
	private Double valorMedio;
	
	@JoinColumn(name = "TEMPO_ID")
	@ManyToOne
	private Tempo tempo;
	
	@JoinColumn(name = "TIPO_IMOVEL_ID")
	@ManyToOne
	private TipoImovel tipoImovel;
	
	@JoinColumn(name = "CARACTERISTICAS_IMOVEL_ID")
	@ManyToOne
	private CaracteristicasImovel caracteristicasImovel;
	
	@JoinColumn(name = "CLIENTE_ID")
	@ManyToOne
	private Cliente cliente;
	
	@JoinColumn(name = "ENDERECO_ID")
	@ManyToOne
	private Endereco endereco;
	
	public VendaImovel() {
	}

	public VendaImovel(Integer guidVendaImovel, @NotNull Integer totalVendido, @NotNull Double totalFinanceiro,
			@NotNull Double valorMedio, Tempo tempo, TipoImovel tipoImovel, CaracteristicasImovel caracteristicasImovel,
			Cliente cliente, Endereco endereco) {
		super();
		this.guidVendaImovel = guidVendaImovel;
		this.totalVendido = totalVendido;
		this.totalFinanceiro = totalFinanceiro;
		this.valorMedio = valorMedio;
		this.tempo = tempo;
		this.tipoImovel = tipoImovel;
		this.caracteristicasImovel = caracteristicasImovel;
		this.cliente = cliente;
		this.endereco = endereco;
	}

	public Integer getGuidVendaImovel() {
		return guidVendaImovel;
	}

	public void setGuidVendaImovel(Integer guidVendaImovel) {
		this.guidVendaImovel = guidVendaImovel;
	}

	public Integer getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(Integer totalVendido) {
		this.totalVendido = totalVendido;
	}

	public Double getTotalFinanceiro() {
		return totalFinanceiro;
	}

	public void setTotalFinanceiro(Double totalFinanceiro) {
		this.totalFinanceiro = totalFinanceiro;
	}

	public Double getValorMedio() {
		return valorMedio;
	}

	public void setValorMedio(Double valorMedio) {
		this.valorMedio = valorMedio;
	}

	public Tempo getTempo() {
		return tempo;
	}

	public void setTempo(Tempo tempo) {
		this.tempo = tempo;
	}

	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	public CaracteristicasImovel getCaracteristicasImovel() {
		return caracteristicasImovel;
	}

	public void setCaracteristicasImovel(CaracteristicasImovel caracteristicasImovel) {
		this.caracteristicasImovel = caracteristicasImovel;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
