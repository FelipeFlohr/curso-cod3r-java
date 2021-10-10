package com.felipeflohr.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import com.felipeflohr.cm.excecao.ExplosaoException;
import com.felipeflohr.cm.excecao.SairException;
import com.felipeflohr.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
	private Tabuleiro tabuleiro;
	private Scanner scanner = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			
			while(continuar) {
				cicloDoJogo();

				System.out.println("Outra partida? (S/n) ");
				String resposta = scanner.nextLine();

				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairException e) {
			System.out.println("Saindo do jogo.");
		} finally {
			scanner.close();
		}
	}

	private void cicloDoJogo() {
		try {

			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);

				String digitado = capturarValorDigitado("Digite (x, y): ");

				Iterator<Integer> xy = Arrays.stream(digitado.split(", "))
					.map(e -> Integer.parseInt(e)).iterator();

				digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");
				
				if("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				} else if ("2".equals(digitado)) {
					tabuleiro.alterarMarcacao(xy.next(), xy.next());
				}
			}

			System.out.println("Voc� ganhou!");
		} catch (ExplosaoException e) {
			System.out.println("Voc� perdeu!");
		}
	}

	private String capturarValorDigitado(String texto) {
		System.out.println(texto);
		String digitado = scanner.nextLine();

		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}

		return digitado;
	}
}
