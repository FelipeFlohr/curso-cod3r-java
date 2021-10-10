package com.felipeflohr.generics;

public class Main {

	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double -> Double (Autoboxing)

		// Isto ir� gerar erro, pois o retoro de caixaA.abrir �
		// Double, e n�o ser� poss�vel realizar o cast para Integer
		try {
			Integer coisa = (Integer) caixaA.abrir();
			System.out.println(coisa);
		} catch (ClassCastException e) {
			System.out.println("Aconteceu o erro. \n");
		}

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Ol�");

		// Sem o Generics, � necess�rio fazer este cast �bvio pois
		// o valor original � do tipo Object
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}

}
