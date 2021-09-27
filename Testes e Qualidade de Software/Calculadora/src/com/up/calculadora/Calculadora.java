package com.up.calculadora;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import javafx.css.ParsedValue;

/**
 * Classe para executar as ações da calculadora.
 * 
 * @author 1829203
 *
 */
public class Calculadora {
	
	/**
	 * Calcula a soma entre dois números
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double soma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Calcula a subtração entre dois números
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double subtracao(int a, int b) {
		return a - b;
	}
	
	/**
	 * Calcula a multiplicação entre dois números
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double multiplicacao(int a, int b) {
		return a * b;
	}
	
	/**
	 * Calcula a divisão entre dois números
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double divisao(double a, double b) {
		return a / b;
	}
	
	/**
	 * Realiza o cálculo de potenciação
	 * 
	 * @param a base
	 * @param b expoente
	 * @return
	 */
	public static double potenciacao(int a, int b) {
		return Math.pow(a, b);
	}
	
	/**
	 * Calcula a raíz quadrada de um número
	 * 
	 * @param a
	 * @return
	 */
	public static double raizQuadrada(int a) {
		return Math.sqrt(a);
	}
	
	/**
	 * Calcula as raízes de uma equação do segundo grau (Baskara)
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static double[] bhaskara(double a, double b, double c) {
		
		double delta = Math.pow(b, 2) -4 * a * c;
		
		if(delta < 0) {
			// Não tem raízes reais
			double[] vazio = {};
			return vazio;
		}
		
		if(delta == 0) {
			// Apenas uma raíz real
			double raiz = (-b) / (2 * a);
			double[] umaRaiz = {raiz};
			return umaRaiz;
		}
		
		// Duas raízes reais
		double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
		double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
		double[] raizes = {raiz1, raiz2};
		return raizes;
	}
	
	// Funcionalidades solicitadas pelo professor para exercitar testes de desvio
	
	public static int doisValores(int n1, int n2) {
		int res;
		if (n1 % 2 != 0 || n2 % 2 != 0) {
			res = n1 * n2;
			if(res > 10) {
				return res;
			}
			else {
				return res += 10; 
			}
		}
		else {
			res = n1 + n2;
			if(res > 5) {
				return res += 5;
			}
			else {
				return res;
			}
		}
	}

	public static String calcularPoligonos(int l, ArrayList<Integer> t) {
		if (l >= 3) {
			if (l == 3) {
				int x = t.get(0);
				int y = t.get(1);
				int z = t.get(2);
				if (x == y && x == z) {
					return "O Poligono é um Triangulo Equilatero";
				} else if (x == y || x == z) {
					return "O Poligono é um Triangulo Isosceles";
				} else {
					return "O Poligono é um Triangulo Escaleno";
				}
			} else if (l == 4) {
				int v = t.get(0);
				int x = t.get(1);
				int y = t.get(2);
				int z = t.get(3);
				if (v == x && y == z && z == v) {
					return "O Poligono é um Quadrado";
				} else {
					return "O Poligono tem quatro lados";
				}
			} else {
				return "O Poligono tem " + l + " lados";
			}
		} else {
			return "Não é um poligono";
		}
	}

	public static Integer calcularPerimetro(ArrayList<Integer> tamanhos) {
		Integer perimetro = 0;
		for (int t : tamanhos) {
			perimetro += t;
		}
		return perimetro;
	}

	public static String angulo(double n1) {
		double v1 = n1;
		double v2 = Math.toRadians(n1);
		if (v1 < 90) {
			double resSeno = Math.sin(v2);
			double resTan = Math.tan(v2);
			if (resTan != 1) {
				return ("Valor do seno: " + round(resSeno, 2) + " e valor da tangente: " + round(resTan, 2));
			} else {
				return ("Valor do seno: " + round(resSeno, 2));
			}
		} else {
			double resCos = Math.cos(v2);
			double resTan = Math.tan(v2);
			if (resTan != 1) {
				if (v1 == 90) {
					return ("Valor do cosseno: " + round(resCos, 2));
				} else {
					return ("Valor do cosseno: " + round(resCos, 2) + " e valor da tangente: " + round(resTan, 2));					
				}
			} else {
				return ("Valor do cosseno: " + round(resCos, 2));
			}
		}
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
}