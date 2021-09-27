package br.edu.entidade;

import javax.validation.constraints.NotNull;

/**
 * Representa um cálculo do Enésimo termo da PA.
 * 
 * @author 1829203
 *
 */
public class CalculoPA {
	
	@NotNull
	private Double a1;
	
	@NotNull
	private Integer n;
	
	@NotNull
	private Double r;
	
	private Double an;
	
	public CalculoPA() {
		
	}
	
	/**
	 * Calcula o nÉsimo termo da PA
	 * 
	 * @param a1
	 * @param n
	 * @param r
	 */
	public void calcularNEsimoTermo() {
		this.an = this.a1 + (this.n - 1) * this.r;
	}

	public Double getA1() {
		return a1;
	}

	public void setA1(Double a1) {
		this.a1 = a1;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public Double getR() {
		return r;
	}

	public void setR(Double r) {
		this.r = r;
	}

	public Double getAn() {
		return an;
	}

	public void setAn(Double an) {
		this.an = an;
	}
	
}