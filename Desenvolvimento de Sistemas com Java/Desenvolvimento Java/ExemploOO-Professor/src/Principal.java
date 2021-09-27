import java.util.ArrayList;

/**
 * Exemplo OO
 * 
 * @author 4694
 *
 */
public class Principal {

	public static void main(String[] args) {

		Parede paredeDaFrente = new Parede();

		paredeDaFrente.trocarAltura(10);
		paredeDaFrente.trocarLargura(5);
		System.out.println(paredeDaFrente.pegarArea());
		paredeDaFrente.trocarAltura(1);
		System.out.println(paredeDaFrente.pegarArea());

		Parede daEsquerda = new Parede();

		daEsquerda.trocarAltura(5);
		daEsquerda.trocarLargura(2);

		System.out.println("da esquerda: " + daEsquerda.pegarArea());

		double areaTotal = paredeDaFrente.pegarArea() + daEsquerda.pegarArea();

		ArrayList<Parede> paredes = new ArrayList<>();
		paredes.add(paredeDaFrente);
		paredes.add(daEsquerda);

		for (Parede parede : paredes) {
			areaTotal += parede.pegarArea();
		}

	}

}
