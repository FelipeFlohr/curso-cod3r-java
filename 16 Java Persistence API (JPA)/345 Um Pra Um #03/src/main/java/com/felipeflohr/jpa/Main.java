package com.felipeflohr.jpa;

import com.felipeflohr.jpa.infra.DAO;

public class Main {

	public static void main(String[] args) {
		DAO<Cliente> daoCliente = new DAO<Cliente>(Cliente.class);
		Cliente cliente = daoCliente.obterPorID(1L);
		daoCliente.fechar();
		
		DAO<Assento> daoAssento = new DAO<Assento>(Assento.class);
		Assento assento = daoAssento.obterPorID(5L);
		daoAssento.fechar();

		System.out.println("Nome do assento a partir do cliente: " + cliente.getAssento().getNome());
		System.out.println("Nome do cliente a partir do assento: " + assento.getCliente().getNome());
	}
}
