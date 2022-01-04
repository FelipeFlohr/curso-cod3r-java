package com.felipeflohr.exerciciossb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.felipeflohr.exerciciossb.model.entities.Produto;
import com.felipeflohr.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired // Faz com que um objeto seja colocado automaticamente dentro desse atributo
	private ProdutoRepository produtoRepository;

	@PostMapping
	public @ResponseBody Produto novoProduto(@RequestParam String nome, @RequestParam double preco, @RequestParam double desconto) { // ResponseBody faz com que o método seja atrelado ao corpo da resposta. Não é necessário a implementação desse annotation
		Produto produto = new Produto(nome, preco, desconto);
		produtoRepository.save(produto); // Fará a persistencia automáticamente no banco de dados

		return produto;
	}
}
