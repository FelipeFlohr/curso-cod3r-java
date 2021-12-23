package com.felipeflohr.jpa;

import com.felipeflohr.jpa.infra.DAO;

public class Main {

	public static void main(String[] args) {
		Filme filmeA = new Filme("Star Wars Epis�dio 4", 8.9);
		Filme filmeB = new Filme("O Fugitivo", 8.1);
		
		Ator atorA = new Ator("Harrison Ford");
		Ator atrizB = new Ator("Carrie Fisher");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>(Filme.class);
		
		/* Aqui ir� acontecer uma opera��o em cascata: como tanto a classe "Ator" e "Filme"
		 * est�o realizando uma opera��o em cascata para persistir entre si, quando persis-
		 * tirmos o Filme A, automaticamente persistiremos os atores A e B (pois est�o rela-
		 * cionados com o Filme A). Por�m, como o ator A tamb�m est� relacionado com o Filme
		 * B, automaticamente ele persistir� o mesmo
		 */
		dao.incluirAtomico(filmeA); // Persistir� tanto os atores A e B como os filmes A e B
	}
}
