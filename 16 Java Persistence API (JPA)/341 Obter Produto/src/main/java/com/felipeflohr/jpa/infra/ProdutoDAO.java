package com.felipeflohr.jpa.infra;

import com.felipeflohr.jpa.Produto;

public class ProdutoDAO extends DAO<Produto> {

	public ProdutoDAO() {
		super(Produto.class);
	}
}
