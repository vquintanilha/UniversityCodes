/**
 * Classe para representar uma parede.
 * 
 * @author 4694
 *
 */
public class Parede {

	/**
	 * 
	 */
	private double altura;

	/**
	 * 
	 */
	private double largura;

	/**
	 * 
	 */
	private double area;

	public double pegarArea() {
		return area;
	}

	public void trocarAltura(double novaAltura) {
		altura = novaAltura;
		recalculaArea();
	}

	public void trocarLargura(double novaLargura) {
		largura = novaLargura;
		recalculaArea();
	}

	private void recalculaArea() {
		area = altura * largura;
	}

}
