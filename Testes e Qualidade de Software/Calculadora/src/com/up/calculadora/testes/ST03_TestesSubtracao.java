package com.up.calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.up.calculadora.Calculadora;

class ST03_TestesSubtracao {

	@Test
	void CT01_SubtracaoPositivos() {
		assertEquals(5, Calculadora.subtracao(10, 5));
	}
	
	@Test
	void CT02_SubtracaoNegativos() {
		assertEquals(-5, Calculadora.subtracao(-10, -5));
	}
	
	@Test
	void CT03_SubtracaoPositivoNegativo() {
		assertEquals(15, Calculadora.subtracao(10, -5));
	}

}
