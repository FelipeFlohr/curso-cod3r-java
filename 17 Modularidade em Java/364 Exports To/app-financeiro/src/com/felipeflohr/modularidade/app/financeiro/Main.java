package com.felipeflohr.modularidade.app.financeiro;

import com.felipeflohr.modularidade.app.calculo.Calculadora;
import com.felipeflohr.modularidade.app.calculo.interno.OperacoesAritmeticas;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2, 3, 4));
		
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(4, 5, 6));
	}
}
