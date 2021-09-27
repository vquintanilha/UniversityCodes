package com.up.calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.up.calculadora.Calculadora;

class ST08_TestesBhaskara {

	@Test
	void CT01_BhaskaraDuasRaizes() {
		double[] expected = {1, -7};
		assertArrayEquals(expected, Calculadora.bhaskara(2, 12, -14));
	}

}
