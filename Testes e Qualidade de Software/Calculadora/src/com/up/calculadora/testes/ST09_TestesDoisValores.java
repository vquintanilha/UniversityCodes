package com.up.calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.up.calculadora.Calculadora;

class ST09_TestesDoisValores {

	@Test
	void CT01() {
		assertEquals(11, Calculadora.doisValores(1, 1));
	}
	
	@Test
	void CT02() {
		assertEquals(15, Calculadora.doisValores(3, 5));
	}
	
	@Test
	void CT03() {
		assertEquals(4, Calculadora.doisValores(2, 2));
	}
	
	@Test
	void CT04() {
		assertEquals(17, Calculadora.doisValores(6, 6));
	}

}
