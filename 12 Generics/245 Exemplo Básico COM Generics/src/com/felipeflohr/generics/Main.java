package com.felipeflohr.generics;

public class Main {

	public static void main(String[] args) {
		// Com o Generics, n�o � necess�rio o Cast, assim deixan-
		// do o trabalho mais simples
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Ol�");

		System.out.println(caixaA.abrir());

		Caixa<Integer> caixaIdade = new Caixa<>();
		caixaIdade.guardar(18);

		System.out.println(caixaIdade.abrir());
	}
}
