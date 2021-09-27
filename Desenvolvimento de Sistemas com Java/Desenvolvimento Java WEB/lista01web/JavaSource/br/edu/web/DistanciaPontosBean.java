package br.edu.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

/**
 * Calculo da dist�ncia entre dois pontos.
 * 
 * @author 1829203
 *
 */
@Named
@RequestScoped
public class DistanciaPontosBean {
	
	@NotNull
	private Integer x1;
	
	@NotNull
	private Integer x2;
	
	@NotNull
	private Integer y1;
	
	@NotNull
	private Integer y2;
	
	private Double distancia;
	
	public void calcular() {
		this.distancia = Math.sqrt((Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2)));
	}

	public Integer getX1() {
		return x1;
	}

	public void setX1(Integer x1) {
		this.x1 = x1;
	}

	public Integer getX2() {
		return x2;
	}

	public void setX2(Integer x2) {
		this.x2 = x2;
	}

	public Integer getY1() {
		return y1;
	}

	public void setY1(Integer y1) {
		this.y1 = y1;
	}

	public Integer getY2() {
		return y2;
	}

	public void setY2(Integer y2) {
		this.y2 = y2;
	}

	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

}