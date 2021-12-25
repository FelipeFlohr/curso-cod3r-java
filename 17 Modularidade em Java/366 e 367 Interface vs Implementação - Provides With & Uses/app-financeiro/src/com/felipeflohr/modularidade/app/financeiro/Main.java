package com.felipeflohr.modularidade.app.financeiro;

import java.util.ServiceLoader;

import com.felipeflohr.modularidade.app.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get(); // Irá pegar a implementação da classe. Veja o classpath
		System.out.println(calc.soma(2, 3, 4));
	}
}
