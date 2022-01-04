package com.felipeflohr.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.felipeflohr.exerciciossb.model.entities.Produto;
import com.felipeflohr.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	// Create e Update
	/* O método "save" pode servir tanto para inserir uma entidade nova como para atualizar
	 * uma já existente. Também é possível passar dois métodos HTTP atrelados á um método,
	 * como pode se ver abaixo.
	 */
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) { // A Annotation "Valid" serve para explicitar que este produto tem que ser válido
		produtoRepository.save(produto);
		return produto;
	}

	// Read
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}

	// Read
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
}
