package com.felipeflohr.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import com.felipeflohr.cm.excecao.ExplosaoException;

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

		// Verificar se um campo é vizinho ou não
		/* | x | y | x |
		 * | y | z | y |
		 * | x | y | x |
		 * 
		 * x = Vizinho na diagonal
		 * y = Vizinho direto
		 * z = Campo atual
		 */

		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;

		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;

		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if(deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}

	void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
		}
	}

	// Método para abrir um campo
	boolean abrir() {
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException();
			}
			
			// Se a vizinhança for segura, irá abrir para os mesmos
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir()); // Recursivo
			}
			
			return true;
		}
		
		return false;
	}

	// Método para ver se os campos ao redor estão seguros
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}

	boolean minar() {
		if(!minado) {
			minado = true;
			return true;
		}
		return false;
	}

	// Getters e Setters
	public boolean isMarcado() {
		return marcado;
	}
	
	public boolean isAberto() {
		return aberto;
	}
}
