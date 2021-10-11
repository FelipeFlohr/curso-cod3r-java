package com.felipeflohr.generics;

public class Main {

	public static void main(String[] args) {
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(6.5);

		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(123);

		double coisaA = caixaA.abrir();
		double coisaB = caixaB.abrir();
		System.out.println(coisaA);
		System.out.println(coisaB);
	}
}
