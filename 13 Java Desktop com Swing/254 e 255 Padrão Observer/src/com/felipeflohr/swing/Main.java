package com.felipeflohr.swing;

public class Main {

	public static void main(String[] args) {

		// Padrão de projeto Observer
		/* 
		 * Subject -> Responsável por detectar a ocorrência de
		 * determinado exemplo.
		 * 
		 * No Subject, observadores são registrados, na qual pos-
		 * suem a função de executar eventos.
		 */

		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();

		porteiro.registrarObservador(namorada);

		// Implementando através de Lambda
		porteiro.registrarObservador(e -> {
			System.out.println("Surpresa via lambda!");
			System.out.println("Ocorreu em " + e.getMomento());
		});

		porteiro.monitorar();
	}
}
