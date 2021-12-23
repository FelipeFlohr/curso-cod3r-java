package com.felipeflohr.jpa;

import java.util.List;

import com.felipeflohr.jpa.infra.DAO;

public class Main {

	public static void main(String[] args) {

		DAO<Filme> dao = new DAO<Filme>(Filme.class);
		
		// Método consultar(nome da consulta, nome do parâmetro, valor do parâmetro)
		List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);

		System.out.println("Filmes com nota maior que 8.5:");
		for (Filme filme: filmes) {
			System.out.println(filme.getNome() + " -> Nota: " + filme.getNota());
			
			System.out.println("\nAtores que participaram desse filme:");
			for (Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	}
}
