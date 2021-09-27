package lista04;

/**
 * Representa um ponto no plano cartesiano.
 * 
 * @author 1829203
 *
 */
public class Ponto {

	private Double x;
	
	private Double y;

	/**
	 * Cria um ponto na origem (0, 0).
	 */
	public Ponto() {
		this.x = 0d;
		this.y = 0d;
	}

	public Ponto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}
	
	/**
	 * Calcula a distância do ponto atual até as coordenadas informadas.
	 * 
	 * @param x
	 * @param y
	 * @return a distância.
	 */
	public Double distancia(Double x, Double y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}
	
	/**
	 * Calcula a distância do ponto atual até outro ponto informado.
	 * 
	 * @param ponto
	 * @return a distância
	 */
	public Double distancia(Ponto ponto) {
		return distancia(ponto.getX(), ponto.getY());
	}
	
}
