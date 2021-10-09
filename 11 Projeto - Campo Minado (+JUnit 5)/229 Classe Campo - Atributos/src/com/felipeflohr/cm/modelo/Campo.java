package com.felipeflohr.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false; // Quando o jogo identifica que há uma mina no campo
	
	private List<Campo> vizinhos = new ArrayList<>();

	public Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		
	}
}
