package com.felipeflohr.jpa;

import com.felipeflohr.jpa.infra.DAO;

public class Main {

	public static void main(String[] args) {
		// Incluir atômico persistindo automaticamente o assento
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Rodrigo", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		dao.incluirAtomico(cliente);
	}
}
