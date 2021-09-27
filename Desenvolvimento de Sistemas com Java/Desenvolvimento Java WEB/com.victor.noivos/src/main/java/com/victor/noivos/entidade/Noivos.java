package com.victor.noivos.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Noivos {
	
	@Id
	@SequenceGenerator(name = "NUM_SEQ_NOIVOS", sequenceName = "NUM_SEQ_NOIVOS", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_NOIVOS")
	private Integer id;
	
	private String nomes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomes() {
		return nomes;
	}

	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	
}
