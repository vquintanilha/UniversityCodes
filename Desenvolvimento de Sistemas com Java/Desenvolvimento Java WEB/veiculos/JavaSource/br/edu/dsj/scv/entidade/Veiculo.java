package br.edu.dsj.scv.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import br.edu.dsj.scv.enumerado.Combustivel;

/**
 * Representa um veículo
 * 
 * @author 4694
 *
 */
@Entity
public class Veiculo {

	@Id
	@SequenceGenerator(name = "NUM_SEQ_VEICULO", sequenceName = "NUM_SEQ_VEICULO", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_VEICULO")
	private Integer id;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_MARCA")
	private Marca marca;

	private String modelo;

	private String placa;

	private Date dataEmplacamento;

	private String cor;

	private Integer anoModelo;

	private Integer anoFabricacao;

	@NotNull
	@Enumerated(value = EnumType.STRING)
	private Combustivel combustivel;

	private Double precoFipe;

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Double getPrecoFipe() {
		return precoFipe;
	}

	public void setPrecoFipe(Double precoFipe) {
		this.precoFipe = precoFipe;
	}

	public Date getDataEmplacamento() {
		return dataEmplacamento;
	}

	public void setDataEmplacamento(Date dataEmplacamento) {
		this.dataEmplacamento = dataEmplacamento;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
