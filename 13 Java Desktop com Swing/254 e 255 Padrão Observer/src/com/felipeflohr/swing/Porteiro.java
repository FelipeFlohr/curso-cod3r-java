package com.felipeflohr.swing;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ChegadaAniversarianteObservador> observadores =
			new ArrayList<>(); // Lista de registros de observadores

	public void registrarObservador(
			ChegadaAniversarianteObservador observador) {
		observadores.add(observador);
	}

	public void monitorar() {
		Scanner scanner = new Scanner(System.in);

		String valor = "";

		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante chegou? ");
			valor = scanner.nextLine();

			if("sim".equalsIgnoreCase(valor)) {
				// Criar o evento
				EventoChegadaAniversariante evento = new 
						EventoChegadaAniversariante(new Date());

				// Notificar os observadores
				observadores.stream().forEach(o -> 
				o.chegou(evento));

				valor = "sair"; // Dessa maneira o programa encerra automaticamente
			} else {
				System.out.println("Alarme falso.");
			}
		}

		scanner.close();
	}
}
