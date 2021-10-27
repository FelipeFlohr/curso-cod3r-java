package com.felipeflohr.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador {

	private final int linhas;
	private final int colunas;
	private final int minas;
	
	private final List<Campo> campos = new ArrayList<>();
	private final List<Consumer<ResultadoEvento>> observadores =
			new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarOsVizinhos();
		sortearMinas();
	}

	public void paraCadaCampo(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}

	public void registrarObservador(Consumer<ResultadoEvento> observador) {
		observadores.add(observador);
	}

	private void notificarObservadores(boolean resultado) {
		observadores.stream()
				.forEach(o -> o.accept(new ResultadoEvento(resultado)));
	}

	public void abrir(int linha, int coluna) {
		try {
			campos.parallelStream()
					.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
					.findFirst()
					.ifPresent(c -> c.abrir());
		} catch (Exception e) {
			// FIXME Ajustar a implementação do método abrir
			campos.forEach(c -> c.setAberto(true));
			throw e;
		}
	}

	public void alterarMarcacao(int linha, int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.alternarMarcacao());;
	}

	private void gerarCampos() {
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				Campo campo = new Campo(linha, coluna);
				campo.registrarObservador(this);
				campos.add(campo);
			}
		}
	}

	private void associarOsVizinhos() {
		// Este método irá tentar associar todo mundo ao vizinho, e conforme as con-
		// dições baterem, realizará a execução
		for (Campo c1: campos) {
			for (Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}

	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = campo -> campo.isMinado();

		do {
			int aleatorio = (int) (Math.random() * campos.size()); // Ir� selecionar um campo aleat�rio
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
		} while (minasArmadas < minas);
	}

	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(campo -> campo.objetivoAlcancado());
	}
	
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("  ");
		for (int c = 0; c < colunas; c++) {
			sb.append(" ");
			sb.append(c);
			sb.append(" ");
		}
		
		sb.append("\n");

		int i = 0;
		for (int linha = 0; linha < linhas; linha++) {
			sb.append(linha);
			sb.append(" ");
			for (int coluna = 0; coluna < colunas; coluna++) {
				sb.append(" ");
				sb.append(campos.get(i));
				sb.append(" ");
				i++;
			}
			sb.append("\n");
		}

		return sb.toString();
	}

	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		if(evento == CampoEvento.EXPLODIR) {
			mostrarMinas();
			notificarObservadores(false);
		} else if (objetivoAlcancado()) {
			notificarObservadores(true);
		}
	}

	private void mostrarMinas() {
		campos.stream()
				.filter(c -> c.isMinado())
				.filter(c -> !c.isMarcado())
				.forEach(c -> c.setAberto(true));
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
}
