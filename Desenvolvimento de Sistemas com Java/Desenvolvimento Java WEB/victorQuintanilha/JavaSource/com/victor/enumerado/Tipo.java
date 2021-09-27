package com.victor.enumerado;

public enum Tipo {
	
	NORMAL("Normal"),
	IMPORTANTE("Importante"),
	URGENTE("Urgente");
	
	private String descricao;
	
	private Tipo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}