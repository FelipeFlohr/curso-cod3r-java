package com.felipeflohr.generics;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new HashSet<>();

	public void adicionar(C chave, V valor) {
		if (chave == null) return; // Isso irá fazer sair do método caso for nulo

		Par<C, V> novoPar = new Par<C, V>(chave, valor);

		// Caso já exista um item com a chave atual, o mesmo
		// será removido e substituido por um novo item da mes-
		// ma chave, porém com o valor podendo ser diferente.
		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		}

		if (chave != null) {
			itens.add(new Par<C, V>(chave, valor));
		}
	}

	public V getValor(C chave) {
		if(chave == null) return null;

		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();

		return parOpcional.isPresent() 
				? parOpcional.get().getValor() : null;
	}
}
