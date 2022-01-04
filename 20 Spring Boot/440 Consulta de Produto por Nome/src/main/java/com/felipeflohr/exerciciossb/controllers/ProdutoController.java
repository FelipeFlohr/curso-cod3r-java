package com.felipeflohr.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
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

	// Read. Este método retorna todos os produtos, o que NÃO É ideal para um sistema real
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	// Read. Fazendo consulta pelo nome
	@GetMapping(path = "/nome/{nome}")
	public Iterable<Produto> obterProdutosPeloNome(@PathVariable String nome) {
		return produtoRepository.findByNomeContainingIgnoreCase(nome);
	}

	// Read | Fazendo uma consulta paginada
	@GetMapping(path = "/pagina/{numeroPagina}/{tamanhoDaPagina}")
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int tamanhoDaPagina) {
		if (tamanhoDaPagina > 5) tamanhoDaPagina = 5;
		if (tamanhoDaPagina < 1) tamanhoDaPagina = 1;
		Pageable page = PageRequest.of(numeroPagina, tamanhoDaPagina); // Parâmetros: número da página, tamanho da página
		return produtoRepository.findAll(page);
	}

	// Read
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	//Delete
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
}
