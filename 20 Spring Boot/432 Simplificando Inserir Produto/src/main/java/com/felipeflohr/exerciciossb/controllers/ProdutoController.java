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

	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping
	public @ResponseBody Produto novoProduto(Produto produto) { // Ao invés de colocar todos os campos da classe como parâmetros nesse método, basta colocar a própria classe em si como parâmetro. Contudo, sem validações será possível inserir uma classe com atributos nulos (exemplo: sem preço, sem desconto, sem nome)
		produtoRepository.save(produto);
		return produto;
	}
}
