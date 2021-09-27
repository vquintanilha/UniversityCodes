package br.edu.dsj.scv.enumerado;

public enum Combustivel {
	
	GASOLINA("Gasolina p�dium"),
	ETANOL("Etanol"),
	DIESEL("Diesel"),
	GNV("GNV"),
	ENERGIA_ELETRICA("Energia el�trica"),
	BIO_COMBUSTIVEL("Biocombust�vel");
	
	private String descricao;
	
	private Combustivel(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
