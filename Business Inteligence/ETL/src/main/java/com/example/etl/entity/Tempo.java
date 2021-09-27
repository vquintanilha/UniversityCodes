package com.example.etl.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TEMPO")
public class Tempo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GUIDTEMPO")
	private Integer guidTempo;
	
	@Column(name = "DIA")
	@JsonFormat(pattern = "dd/MM/yyyy")
	@NotNull
	private Date dia;
	
	@Column(name = "DIA_SEMANA")
	@NotNull
	private String diaSemana;
	
	@Column(name = "SEMANA_MES")
	@NotNull
	private Integer semanaMes;
	
	@Column(name = "SEMANA_ANO")
	@NotNull
	private Integer semanaAno;
	
	@Column(name = "FERIADO")
	@NotNull
	// 0 = não, 1 = sim
	private Integer feriado;

	public Tempo() {
	}

	public Tempo(Integer guidTempo, @NotNull Date dia, @NotNull String diaSemana, @NotNull Integer semanaMes,
			@NotNull Integer semanaAno, @NotNull Integer feriado) {
		super();
		this.guidTempo = guidTempo;
		this.dia = dia;
		this.diaSemana = diaSemana;
		this.semanaMes = semanaMes;
		this.semanaAno = semanaAno;
		this.feriado = feriado;
	}

	public Integer getGuidTempo() {
		return guidTempo;
	}

	public void setGuidTempo(Integer guidTempo) {
		this.guidTempo = guidTempo;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public Integer getSemanaMes() {
		return semanaMes;
	}

	public void setSemanaMes(Integer semanaMes) {
		this.semanaMes = semanaMes;
	}

	public Integer getSemanaAno() {
		return semanaAno;
	}

	public void setSemanaAno(Integer semanaAno) {
		this.semanaAno = semanaAno;
	}

	public Integer getFeriado() {
		return feriado;
	}

	public void setFeriado(Integer feriado) {
		this.feriado = feriado;
	}
	
}
