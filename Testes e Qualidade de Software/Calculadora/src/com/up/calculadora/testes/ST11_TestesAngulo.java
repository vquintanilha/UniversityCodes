package com.up.calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.up.calculadora.Calculadora;

class ST11_TestesAngulo {

	@Test
	void CT01() {
		assertEquals("Valor do seno: 0.5 e valor da tangente: 0.58", Calculadora.angulo(30));
	}
	
	@Test
	void CT02() {
		assertEquals("Valor do cosseno: 0.0", Calculadora.angulo(90));
	}
	
	@Test
	void CT03() {
		assertEquals("Valor do seno: 0.71", Calculadora.angulo(45));
	}

}
