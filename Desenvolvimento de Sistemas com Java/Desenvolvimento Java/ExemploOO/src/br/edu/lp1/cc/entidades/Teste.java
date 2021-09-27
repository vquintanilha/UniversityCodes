package br.edu.lp1.cc.entidades;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) throws InterruptedException {

		ArrayList<Integer> dados = new ArrayList<>();
		
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < 50; i++) {
			Thread.sleep(10);
			dados.add(i);
		}
		long fim = System.currentTimeMillis();
		
		System.out.println(fim - inicio);
		
	}

	public static double dividir(Double a, Double b) throws Exception {
		if(a == null || b == null) {
			throw new Exception("Não pode ter valores nulos!");
		}
		if (b == 0) {
			throw new Exception("Não é possível dividir por zero!");
		} else {
			return a / b;
		}
	}

}
