package com.felipeflohr.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.felipeflohr.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> { // Uma classe pode estender outra classe. Nessa caso, ela estende CrudRepository, passando como primeiro argumento a classe que deseja implementar e como segundo o tipo do ID

}
