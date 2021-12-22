package com.felipeflohr.jpa;

import com.felipeflohr.jpa.infra.DAO;

public class Main {

	public static void main(String[] args) {
		DAO<Pedido> dao = new DAO<>(Pedido.class);

		Pedido pedido = dao.obterPorID(3L);

		System.out.println("Quantidade de itens: " + pedido.getItens().size());
		
		for (ItemPedido item: pedido.getItens()) {
			System.out.println("Produto: " + item.getProduto().getNome() + ". Qnt.: " + item.getQuantidade());
		}

		dao.fechar();
	}
}
