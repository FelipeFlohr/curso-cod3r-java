package com.felipeflohr.cm;

import com.felipeflohr.cm.modelo.Tabuleiro;
import com.felipeflohr.cm.visao.TabuleiroConsole;

public class Main {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}
}
