package com.felipeflohr.modularidade.app.calculo;

import com.felipeflohr.modularidade.app.Calculadora;
import com.felipeflohr.modularidade.app.calculo.interno.OperacoesAritmeticas;
import com.felipeflohr.modularidade.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {
	
	private String id = "123";

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	// Método delegate: apenas irá chamar o método
	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
}
