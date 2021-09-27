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
@Table(name = "TIPO_IMOVEL")
public class TipoImovel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GUIDTIPOIMOVEL")
	private Integer guidTipoImovel;
	
	@Column(name = "CATEGORIA")
	@NotNull
	private String categoria;
	
	@Column(name = "STATUS_IMOVEL")
	@NotNull
	private String statusImovel;
	
	public TipoImovel() {
	}

	public TipoImovel(Integer guidTipoImovel, @NotNull String categoria, @NotNull String statusImovel) {
		super();
		this.guidTipoImovel = guidTipoImovel;
		this.categoria = categoria;
		this.statusImovel = statusImovel;
	}

	public Integer getGuidTipoImovel() {
		return guidTipoImovel;
	}

	public void setGuidTipoImovel(Integer guidTipoImovel) {
		this.guidTipoImovel = guidTipoImovel;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getStatusImovel() {
		return statusImovel;
	}

	public void setStatusImovel(String statusImovel) {
		this.statusImovel = statusImovel;
	}

}
