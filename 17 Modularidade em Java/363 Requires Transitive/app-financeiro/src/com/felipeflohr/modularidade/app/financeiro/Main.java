package com.felipeflohr.modularidade.app.financeiro;

import com.felipeflohr.modularidade.app.calculo.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2, 3, 4));

		System.out.println(calc.getLoggerClass());
	}
}
