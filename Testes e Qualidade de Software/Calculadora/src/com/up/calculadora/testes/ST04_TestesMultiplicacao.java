package com.up.calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.up.calculadora.Calculadora;

class ST04_TestesMultiplicacao {

	@Test
	void CT01_MultiplicacaoPositivos() {
		assertEquals(15, Calculadora.multiplicacao(3, 5));
	}
	
	@Test
	void CT02_MultiplicacaoNegativos() {
		assertEquals(15, Calculadora.multiplicacao(-3, -5));
	}
	
	@Test
	void CT03_MultiplicacaoPositivoNegativo() {
		assertEquals(-15, Calculadora.multiplicacao(3, -5));
	}

}
