package lista04;

/**
 * Representa uma posição na Fila.
 * 
 * @author 1829203
 *
 */
public class Nodo {

	private Paciente paciente;
	
	private Nodo proximo;

	public Nodo(Paciente paciente) {
		this.paciente = paciente;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Nodo getProximo() {
		return proximo;
	}

	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
	
}
