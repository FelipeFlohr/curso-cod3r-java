package com.felipeflohr.modularidade.app.calculo;

import com.felipeflohr.modularidade.app.calculo.interno.OperacoesAritmeticas;
import com.felipeflohr.modularidade.app.logging.Logger;

public class Calculadora {

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	// Método delegate: apenas irá chamar o método
	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}

	// Graças ao Require Transitive, a classe Logger pode ser acessada
	public Class<Logger> getLoggerClass() {
		return Logger.class;
	}
}
