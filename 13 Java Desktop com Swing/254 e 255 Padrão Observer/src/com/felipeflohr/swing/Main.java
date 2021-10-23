package com.felipeflohr.swing;

public class Main {

	public static void main(String[] args) {

		// Padr�o de projeto Observer
		/* 
		 * Subject -> Respons�vel por detectar a ocorr�ncia de
		 * determinado exemplo.
		 * 
		 * No Subject, observadores s�o registrados, na qual pos-
		 * suem a fun��o de executar eventos.
		 */

		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();

		porteiro.registrarObservador(namorada);

		// Implementando atrav�s de Lambda
		porteiro.registrarObservador(e -> {
			System.out.println("Surpresa via lambda!");
			System.out.println("Ocorreu em " + e.getMomento());
		});

		porteiro.monitorar();
	}
}
