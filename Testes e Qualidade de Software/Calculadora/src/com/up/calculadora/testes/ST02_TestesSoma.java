package com.up.calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.up.calculadora.Calculadora;

class ST02_TestesSoma {

	@Test
	void CT01_SomaPositivos() {
		assertEquals(4, Calculadora.soma(2, 2));
	}
	
	@Test
	void CT02_SomaNegativos() {
		assertEquals(-4, Calculadora.soma(-2, -2));
	}
	
	@Test
	void CT03_SomaPositivoNegativo() {
		assertEquals(0, Calculadora.soma(2, -2));
	}

}
