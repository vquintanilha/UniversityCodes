package lista04;

/**
 * Representa a fila de atendimento de {@link Paciente}
 * 
 * @author 1829203
 *
 */
public class Fila {

	private Nodo head;
	
	public Fila() {
		
	}
	
	private void enqueue(Paciente paciente) {
		if (this.head == null) {
			Nodo nodo = new Nodo(paciente);
			this.head = nodo;
		} else {
			Nodo atual = this.head;
			while(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
			atual.setProximo(new Nodo(paciente));
		}
	}
	
	/**
	 * Remove o primeiro elemento da Fila.
	 * 
	 * @return
	 */
	private Paciente dequeue() {
		if (this.head == null) {
			return null;
		} else {
			Paciente paciente = this.head.getPaciente();
			this.head = this.head.getProximo();
			return paciente;
		}
	}
	
	@Override
	public String toString() {
		return "";
	}
	
}
