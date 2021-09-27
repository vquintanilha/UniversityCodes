package com.up.calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import com.up.calculadora.Calculadora;

class ST10_TestesPoligonos {
	ArrayList<Integer> t = new ArrayList<>();

	@Test
	void CT01() {
		t.clear();
		t.add(5);
		assertEquals("Não é um poligono", Calculadora.calcularPoligonos(1, t));
	}
	@Test
	void CT02() {
		t.clear();
		t.add(5);
		t.add(3);
		assertEquals("Não é um poligono", Calculadora.calcularPoligonos(2, t));
	}
	@Test
	void CT03() {
		t.clear();
		t.add(5);
		t.add(5);
		t.add(5);
		assertEquals("O Poligono é um Triangulo Equilatero", Calculadora.calcularPoligonos(3, t));
	}
	@Test
	void CT04() {
		t.clear();
		t.add(5);
		t.add(2);
		t.add(5);
		assertEquals("O Poligono é um Triangulo Isosceles", Calculadora.calcularPoligonos(3, t));
	}
	@Test
	void CT05() {
		t.clear();
		t.add(5);
		t.add(2);
		t.add(4);
		assertEquals("O Poligono é um Triangulo Escaleno", Calculadora.calcularPoligonos(3, t));
	}
	@Test
	void CT06() {
		t.clear();
		t.add(2);
		t.add(2);
		t.add(2);
		t.add(2);
		assertEquals("O Poligono é um Quadrado", Calculadora.calcularPoligonos(4, t));
	}
	@Test
	void CT07() {
		t.clear();
		t.add(1);
		t.add(2);
		t.add(5);
		t.add(3);
		assertEquals("O Poligono tem quatro lados", Calculadora.calcularPoligonos(4, t));
	}
	@Test
	void CT08() {
		t.clear();
		t.add(1);
		t.add(2);
		t.add(5);
		t.add(3);
		t.add(9);
		t.add(7);
		t.add(4);
		assertEquals("O Poligono tem 7 lados", Calculadora.calcularPoligonos(7, t));
	}

	@Test
	void CT09() {
		t.clear();
		t.add(5);
		t.add(5);
		t.add(5);
		assertEquals(15, Calculadora.calcularPerimetro(t));
	}
	@Test
	void CT10() {
		t.clear();
		t.add(5);
		t.add(2);
		t.add(5);
		assertEquals(12, Calculadora.calcularPerimetro(t));
	}
	@Test
	void CT11() {
		t.clear();
		t.add(5);
		t.add(2);
		t.add(4);
		assertEquals(11, Calculadora.calcularPerimetro(t));
	}
	@Test
	void CT12() {
		t.clear();
		t.add(2);
		t.add(2);
		t.add(2);
		t.add(2);
		assertEquals(8, Calculadora.calcularPerimetro(t));
	}
	@Test
	void CT13() {
		t.clear();
		t.add(1);
		t.add(2);
		t.add(5);
		t.add(3);
		assertEquals(11, Calculadora.calcularPerimetro(t));
	}
	@Test
	void CT14() {
		t.clear();
		t.add(1);
		t.add(2);
		t.add(5);
		t.add(3);
		t.add(9);
		t.add(7);
		t.add(4);
		assertEquals(31, Calculadora.calcularPerimetro(t));
	}

}