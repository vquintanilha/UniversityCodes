package com.up.calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.up.calculadora.Calculadora;

class ST01_FluxoSimples {

	@Test
	void CT01_Soma() {
		assertEquals(4, Calculadora.soma(2, 2));
	}
	
	@Test
	void CT02_Subtracao() {
		assertEquals(5, Calculadora.subtracao(10, 5));
	}
	
	@Test
	void CT03_Multiplicacao() {
		assertEquals(15, Calculadora.multiplicacao(3, 5));
	}
	
	@Test
	void CT04_Divisao() {
		assertEquals(25, Calculadora.divisao(50, 2));
	}
	
	@Test
	void CT05_DivisaoDivisorZero() {
		//assertEquals("É impossível dividir por 0!", Calculadora.divisao(50, 0));
		assertTrue(Double.isInfinite(Calculadora.divisao(50, 0)));
	}
	
	@Test
	void CT06_Potenciacao() {
		assertEquals(64, Calculadora.potenciacao(4, 3));
	}
	
	@Test
	void CT07_RaizQuadrada() {
		assertEquals(9, Calculadora.raizQuadrada(81));
	}
	
	@Test
	void CT08_BhaskaraSemRaiz() {
		double[] expected = {};
		assertArrayEquals(expected, Calculadora.bhaskara(1, -2, 16));
	}
	
	@Test
	void CT09_BhaskaraUmaRaiz() {
		double[] expected = {0.5};
		assertArrayEquals(expected, Calculadora.bhaskara(4, -4, 1));
	}
	
	@Test
	void CT10_BhaskaraDuasRaizes() {
		double[] expected = {1, -7};
		assertArrayEquals(expected, Calculadora.bhaskara(2, 12, -14));
	}

}
