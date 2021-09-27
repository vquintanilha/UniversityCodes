package com.victor.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.victor.enumerado.Tipo;

@Named
@RequestScoped
public class TipoBean {
	
	public Tipo[] listarTipos() {
		return Tipo.values();
	}
	
}