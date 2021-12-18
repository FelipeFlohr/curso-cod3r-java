package com.felipeflohr.jpa;

import com.felipeflohr.jpa.infra.DAO;

public class Main {

	public static void main(String[] args) {
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto = new Produto("Monitor 23", 789.98);
		dao.incluirAtomico(produto);
		
		System.out.println("ID do produto: " + produto.getId());
	}
}
