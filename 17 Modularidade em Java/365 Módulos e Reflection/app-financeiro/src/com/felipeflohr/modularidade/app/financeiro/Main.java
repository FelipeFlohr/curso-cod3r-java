package com.felipeflohr.modularidade.app.financeiro;

import java.lang.reflect.Field;

import com.felipeflohr.modularidade.app.calculo.Calculadora;
import com.felipeflohr.modularidade.app.calculo.interno.OperacoesAritmeticas;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2, 3, 4));
		
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(4, 5, 6));
		
		// Java Reflection: acessando campos privados das classes (introspecção)
		/* Para acessar campos privados de uma classe, o módulo precisa estar aberto. Dessa
		 * maneira, é necessário colocar "open" no "module-info.java"
		 */
		try {
			Field fieldId = Calculadora.class.getDeclaredFields()[0]; // Retorna o primeiro campo declarado da classe. Nesse caso "id";
			fieldId.setAccessible(true);
			fieldId.set(calc, "456");
			System.out.println(fieldId.get(calc)); // Printa o valor do campo
			fieldId.setAccessible(false);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
