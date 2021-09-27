package com.up.calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.up.calculadora.Calculadora;

class ST07_TestesRaizQuadrada {

	@Test
	void CT01_RaizQuadradaPositivo() {
		assertEquals(9, Calculadora.raizQuadrada(81));
	}
	
	@Test
	void CT02_RaizQuadradaNegativo() {
		//assertEquals("N�o existe ra�z de n�meros negativos!", Calculadora.raizQuadrada(-81));
		assertEquals(Double.NaN, Calculadora.raizQuadrada(-81));
	}

}
