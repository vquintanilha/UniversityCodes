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
@Table(name = "ENDERECO")
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GUIDENDERECO")
	private Integer guidEndereco;
	
	@Column(name = "CEP")
	@NotNull
	private String CEP;
	
	@Column(name = "CIDADE")
	@NotNull
	private String cidade;
	
	@Column(name = "ESTADO")
	@NotNull
	private String estado;
	
	@Column(name = "ENDERECO")
	@NotNull
	private String endereco;
	
	@Column(name = "NUMERO")
	@NotNull
	private Integer numero;
	
	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	@Column(name = "BAIRRO")
	@NotNull
	private String bairro;
	
	public Endereco() {
	}

	public Endereco(Integer guidEndereco, @NotNull String cEP, @NotNull String cidade, @NotNull String estado,
			@NotNull String endereco, @NotNull Integer numero, String complemento, @NotNull String bairro) {
		super();
		this.guidEndereco = guidEndereco;
		CEP = cEP;
		this.cidade = cidade;
		this.estado = estado;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
	}

	public Integer getGuidEndereco() {
		return guidEndereco;
	}

	public void setGuidEndereco(Integer guidEndereco) {
		this.guidEndereco = guidEndereco;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
