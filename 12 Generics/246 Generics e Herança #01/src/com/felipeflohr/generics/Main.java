package com.felipeflohr.generics;

public class Main {

	public static void main(String[] args) {
		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(123);

		int coisaA = caixaA.abrir();
		System.out.println(coisaA);
	}
}
