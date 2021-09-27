package lista04;

/**
 * Representa um Compromisso médico.
 * 
 * @author 1829203
 *
 */
public class Compromisso {
	
	private Paciente paciente;
	
	private String data;
	
	private String hora;
	
	private String medico;
	
	public Compromisso(Paciente paciente, String data, String hora, String medico) {
		this.paciente = paciente;
		this.data = data;
		this.hora = hora;
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}
	
	@Override
	public String toString() {
		return "Compromisso [paciente=" + paciente + ", data=" + data + ", hora=" + hora + ", medico=" + medico + "]";
	}
	
}
