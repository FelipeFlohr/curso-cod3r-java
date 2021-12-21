package com.felipeflohr.jpa;

import com.felipeflohr.jpa.infra.DAO;

public class Main {

	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();

		Pedido pedido = new Pedido();
		Produto produto = new Produto("Geladeira", 2789.99);
		ItemPedido itemPedido = new ItemPedido(pedido, produto, 10);
		
		dao.abrirTransacao()
		   .incluir(produto)
		   .incluir(pedido)
		   .incluir(itemPedido)
		   .fecharTransacao()
		   .fechar();
	}
}
