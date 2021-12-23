package com.felipeflohr.jpa;

import com.felipeflohr.jpa.infra.DAO;

public class Main {

	public static void main(String[] args) {
		Filme filmeA = new Filme("Star Wars Episódio 4", 8.9);
		Filme filmeB = new Filme("O Fugitivo", 8.1);
		
		Ator atorA = new Ator("Harrison Ford");
		Ator atrizB = new Ator("Carrie Fisher");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>(Filme.class);
		
		/* Aqui irá acontecer uma operação em cascata: como tanto a classe "Ator" e "Filme"
		 * estão realizando uma operação em cascata para persistir entre si, quando persis-
		 * tirmos o Filme A, automaticamente persistiremos os atores A e B (pois estão rela-
		 * cionados com o Filme A). Porém, como o ator A também está relacionado com o Filme
		 * B, automaticamente ele persistirá o mesmo
		 */
		dao.incluirAtomico(filmeA); // Persistirá tanto os atores A e B como os filmes A e B
	}
}
