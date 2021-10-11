package com.felipeflohr.generics;

import java.util.List;

public class ListaUtil {

	// Pegando o �ltimo item da lista
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}

	// O tipo T � definido, e em seguida � amarrado
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
}
