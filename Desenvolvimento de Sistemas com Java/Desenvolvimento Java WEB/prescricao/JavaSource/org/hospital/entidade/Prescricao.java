package org.hospital.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Prescrição médica de um Medicamento para um Paciente
 * 
 * @author 1829203
 *
 */
@Entity
public class Prescricao {

	@Id
	@SequenceGenerator(name = "PRESCRICAO_SEQUENCIAL", sequenceName = "NUM_SEQ_PRESCRICAO", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRESCRICAO_SEQUENCIAL")
	private Integer id;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Paciente_id")
	private Paciente paciente;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Medicamento_id")
	private Medicamento medicamento;
	
	@NotNull
	private Date dataInicio;
	
	@NotNull
	private Date dataTermino;
	
	@NotBlank
	private String frequencia;
	
	public Prescricao() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	
}