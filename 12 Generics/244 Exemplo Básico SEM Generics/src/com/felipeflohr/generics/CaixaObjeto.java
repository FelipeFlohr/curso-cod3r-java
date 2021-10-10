package com.felipeflohr.generics;

public class CaixaObjeto {

	private Object coisa;
	
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}

	public Object abrir() {
		return coisa;
	}
}
