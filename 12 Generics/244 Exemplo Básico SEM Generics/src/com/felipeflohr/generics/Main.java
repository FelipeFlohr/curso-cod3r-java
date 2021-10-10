package com.felipeflohr.generics;

public class Main {

	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double -> Double (Autoboxing)

		// Isto irá gerar erro, pois o retoro de caixaA.abrir é
		// Double, e não será possível realizar o cast para Integer
		try {
			Integer coisa = (Integer) caixaA.abrir();
			System.out.println(coisa);
		} catch (ClassCastException e) {
			System.out.println("Aconteceu o erro. \n");
		}

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");

		// Sem o Generics, é necessário fazer este cast óbvio pois
		// o valor original é do tipo Object
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}

}
