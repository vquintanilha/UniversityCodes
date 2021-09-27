package lista04;

import java.util.ArrayList;

/**
 * Representa uma Pilha de {@link Livro}
 * 
 * @author 1829203
 *
 */
public class Pilha {

	/**
	 * Representa a Pilha
	 */
	private ArrayList<Livro> pilhaDeLivros;

	/**
	 * Quantidade máxima de {@link Livro}
	 */
	private Integer topo;

	public Pilha() {
		this.topo = 5;
		this.pilhaDeLivros = new ArrayList<>();
	}

	/**
	 * Verifica se a pilha está cheia.
	 * 
	 * @return
	 */
	public boolean cheia() {
		return this.topo == this.pilhaDeLivros.size();
	}

	/**
	 * Verifica se a pilha está vazia.
	 * 
	 * @return
	 */
	public boolean vazia() {
		return this.pilhaDeLivros.size() == 0;
	}

	/**
	 * Adicione um Livro na Pilha, se a pilha não estiver cheia. Caso cheia, ignora.
	 * 
	 * @param livro
	 */
	public void push(Livro livro) {
		if (!cheia()) {
			this.pilhaDeLivros.add(livro);
		}
	}

	private int indiceDoTopo() {
		return this.pilhaDeLivros.size() - 1;
	}

	/**
	 * Remove e retorna o último livro da Pilha.
	 * 
	 * @return
	 */
	public Livro pop() {
		if (vazia()) {
			return null;
		} else {
			Livro removido = this.pilhaDeLivros.remove(indiceDoTopo());
			return removido;
		}
	}

	/**
	 * Retorna o Livro do topo da Pilha.
	 * 
	 * @return
	 */
	public Livro peek() {
		if (vazia()) {
			return null;
		} else {
			Livro removido = this.pilhaDeLivros.get(indiceDoTopo());
			return removido;
		}
	}

	@Override
	public String toString() {
		String retorno = "";
		for (int i = indiceDoTopo(); i >= 0; i--) {
			retorno += this.pilhaDeLivros.get(i) + "\n\n";
		}
		return retorno;
	}

}
