package com.felipeflohr.modularidade.app.calculo;

import com.felipeflohr.modularidade.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	// Método delegate: apenas irá chamar o método
	public double soma(double... nums) {
		return opAritmeticas.soma(nums);
	}
}
