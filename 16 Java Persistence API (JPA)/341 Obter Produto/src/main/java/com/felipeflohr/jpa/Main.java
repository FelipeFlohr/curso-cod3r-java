package com.felipeflohr.jpa;

import java.util.List;

import com.felipeflohr.jpa.infra.ProdutoDAO;

public class Main {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for (Produto produto: produtos) {
			System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
		}
		
		double precoTotal = produtos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (total, precoAtual) -> total + precoAtual) // Ir� fazer o pre�o total
				.doubleValue(); // Transformar� em double
		
		System.out.println("O valor total �: R$" + precoTotal);
		
		dao.fechar();
	}
}
