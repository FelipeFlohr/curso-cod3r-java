package com.felipeflohr.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

	private final int linha;
	private final int coluna;

	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false; // Quando o jogo identifica que h� uma mina no campo

	private List<Campo> vizinhos = new ArrayList<>();
	private List<CampoObservador> observadores = new ArrayList<>();

	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public void registrarObservador(CampoObservador observador) {
		observadores.add(observador);
	}

	private void notificarObservadores(CampoEvento evento) {
		observadores.stream()
				.forEach(obs -> obs.eventoOcorreu(this, evento));
	}

	boolean adicionarVizinho(Campo vizinho) {

		// Verificar se um campo � vizinho ou n�o
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

			if(marcado) {
				notificarObservadores(CampoEvento.MARCAR);
			} else {
				notificarObservadores(CampoEvento.DESMARCAR);
			}
		}
	}

	// Método para abrir um campo
	boolean abrir() {
		if(!aberto && !marcado) {
			if(minado) {
				notificarObservadores(CampoEvento.EXPLODIR);
				return true;
			}

			setAberto(true);
			notificarObservadores(CampoEvento.ABRIR);

			// Se a vizinhança for segura, irá abrir para os mesmos
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir()); // Recursivo
			}

			return true;
		} else {
			return false;
		}
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

	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}

	long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}

	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}

	// Getters e Setters
	public boolean isMarcado() {
		return marcado;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean a) {
		this.aberto = a;

		if(aberto) {
			notificarObservadores(CampoEvento.ABRIR);
		}
	}
	
	public boolean isMinado() {
		return minado;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

}
