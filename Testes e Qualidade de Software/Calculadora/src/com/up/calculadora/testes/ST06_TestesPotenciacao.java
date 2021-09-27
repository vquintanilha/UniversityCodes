package com.up.calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.up.calculadora.Calculadora;

class ST06_TestesPotenciacao {

	@Test
	void CT01_PotenciacaoPositivos() {
		assertEquals(64, Calculadora.potenciacao(4, 3));
	}
	
	@Test
	void CT02_PotenciacaoNegativos() {
		assertEquals(-0.015625, Calculadora.potenciacao(-4, -3));
	}
	
	@Test
	void CT03_PotenciacaoPositivoNegativo() {
		assertEquals(0.015625, Calculadora.potenciacao(4, -3));
	}

}
