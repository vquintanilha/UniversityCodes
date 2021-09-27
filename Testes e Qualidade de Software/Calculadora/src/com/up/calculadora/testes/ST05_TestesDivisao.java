package com.up.calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.up.calculadora.Calculadora;

class ST05_TestesDivisao {

	@Test
	void CT01_DivisaoPositivos() {
		assertEquals(25, Calculadora.divisao(50, 2));
	}
	
	@Test
	void CT02_DivisaoNegativos() {
		assertEquals(25, Calculadora.divisao(-50, -2));
	}
	
	@Test
	void CT03_DivisaoPositivoNegativo() {
		assertEquals(-25, Calculadora.divisao(50, -2));
	}

}
