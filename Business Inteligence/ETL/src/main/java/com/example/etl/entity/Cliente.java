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
@Table(name = "CLIENTE")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GUIDCLIENTE")
	private Integer guidCliente;
	
	@Column(name = "FISICA_JURIDICA")
	@NotNull
	// 0 = pessoa física, 1 = pessoa jurídica
	private Integer fisicaJuridica;
	
	@Column(name = "FAIXA_SALARIAL")
	@NotNull
	private String faixaSalarial;
	
	@Column(name = "GENERO")
	@NotNull
	// 0 = masculino, 1 = feminino, 3 = outros
	private Integer genero;
	
	public Cliente() {
	}

	public Cliente(Integer guidCliente, @NotNull Integer fisicaJuridica, @NotNull String faixaSalarial, @NotNull Integer genero) {
		super();
		this.guidCliente = guidCliente;
		this.fisicaJuridica = fisicaJuridica;
		this.faixaSalarial = faixaSalarial;
		this.genero = genero;
	}

	public Integer getGuidCliente() {
		return guidCliente;
	}

	public void setGuidCliente(Integer guidCliente) {
		this.guidCliente = guidCliente;
	}

	public Integer getFisicaJuridica() {
		return fisicaJuridica;
	}

	public void setFisicaJuridica(Integer fisicaJuridica) {
		this.fisicaJuridica = fisicaJuridica;
	}

	public String getFaixaSalarial() {
		return faixaSalarial;
	}

	public void setFaixaSalarial(String faixaSalarial) {
		this.faixaSalarial = faixaSalarial;
	}

	public Integer getGenero() {
		return genero;
	}

	public void setGenero(Integer genero) {
		this.genero = genero;
	}
	
}
