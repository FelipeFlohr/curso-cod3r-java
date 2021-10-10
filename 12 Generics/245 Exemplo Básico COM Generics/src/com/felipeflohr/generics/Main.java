package com.felipeflohr.generics;

public class Main {

	public static void main(String[] args) {
		// Com o Generics, não é necessário o Cast, assim deixan-
		// do o trabalho mais simples
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Olá");

		System.out.println(caixaA.abrir());

		Caixa<Integer> caixaIdade = new Caixa<>();
		caixaIdade.guardar(18);

		System.out.println(caixaIdade.abrir());
	}
}
