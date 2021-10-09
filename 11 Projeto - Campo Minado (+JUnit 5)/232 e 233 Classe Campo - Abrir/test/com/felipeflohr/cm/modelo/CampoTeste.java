package com.felipeflohr.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.felipeflohr.cm.excecao.ExplosaoException;

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

	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}

	// Irá gerar uma exceção
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
	}

	// Irá checar se vizinhos reais estão abrindo os campos
	@Test
	void testeAbrirComVizinhos() {
		Campo campo11 = new Campo(1, 1); // Este campo não irá abrir pois não tem vizinhança segura
		Campo campo12 = new Campo(1, 2);
		campo12.minar();
		
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && !campo11.isAberto());
	}
}
