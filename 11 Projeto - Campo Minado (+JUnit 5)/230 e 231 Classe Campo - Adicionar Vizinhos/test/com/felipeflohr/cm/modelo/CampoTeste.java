package com.felipeflohr.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CampoTeste {

	private Campo campo;

	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}

	@Test
	void testeVizinhoRealEsquerda() {
		Campo vizinhoCampo = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinhoCampo);

		assertTrue(resultado);
	}

	@Test
	void testeVizinhoRealDireita() {
		Campo vizinhoCampo = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinhoCampo);

		assertTrue(resultado);
	}

	@Test
	void testeVizinhoRealCima() {
		Campo vizinhoCampo = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinhoCampo);

		assertTrue(resultado);
	}

	@Test
	void testeVizinhoRealBaixo() {
		Campo vizinhoCampo = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinhoCampo);

		assertTrue(resultado);
	}

	@Test
	void testeVizinhoRealCantoSuperiorEsquerdo() {
		Campo vizinhoCampo = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinhoCampo);

		assertTrue(resultado);
	}

	@Test
	void testeVizinhoRealCantoSuperiorDireito() {
		Campo vizinhoCampo = new Campo(2, 4);
		boolean resultado = campo.adicionarVizinho(vizinhoCampo);

		assertTrue(resultado);
	}

	@Test
	void testeVizinhoRealCantoInferiorEsquerdo() {
		Campo vizinhoCampo = new Campo(4, 2);
		boolean resultado = campo.adicionarVizinho(vizinhoCampo);

		assertTrue(resultado);
	}

	@Test
	void testeVizinhoRealCantoInferiorDireito() {
		Campo vizinhoCampo = new Campo(4, 4);
		boolean resultado = campo.adicionarVizinho(vizinhoCampo);

		assertTrue(resultado);
	}
}
