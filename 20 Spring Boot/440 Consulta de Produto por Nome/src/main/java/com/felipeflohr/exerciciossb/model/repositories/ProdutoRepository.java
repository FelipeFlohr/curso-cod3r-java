package com.felipeflohr.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.felipeflohr.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> { // Uma classe pode estender outra classe. Nessa caso, ela estende CrudRepository, passando como primeiro argumento a classe que deseja implementar e como segundo o tipo do ID

	/* Dentro da Framework do Spring Boot, é possível criar consultar personalizadas apenas
	 * implementando métodos seguindo as convenções da Spring. No caso abaixo, foi possível
	 * implementar o método "findBy" colocando o campo que deseja ser procurado, que foi
	 * "Nome", e de sufixo houve "Containing". Caso não seja possível implementar uma con
	 * sulta utilizando as convenções do Spring, também é possível fazer uma JPQL utilizan-
	 * do a Annotation @Query
	 */
	public Iterable<Produto> findByNomeContainingIgnoreCase(String nome);
}
