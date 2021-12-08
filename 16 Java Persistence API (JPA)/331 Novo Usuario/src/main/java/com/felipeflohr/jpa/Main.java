package com.felipeflohr.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("curso-jpa-hibernate");
		EntityManager em = emf.createEntityManager(); // Será responsável por fazer alterações, consultas, etc.

		// Inserir determinado objeto no banco de dados
		Usuario novoUsuario1 = new Usuario("Felipe", "felipe@email.com.br");
		Usuario novoUsuario2 = new Usuario("Brayoff", "brayoff@email.com.br");
		Usuario novoUsuario3 = new Usuario("Benio", "benio@email.com.br");
		Usuario novoUsuario4 = new Usuario("Mario Games", "mariogames@email.com.br");
		Usuario novoUsuario5 = new Usuario("Mario Ganha", "marioganha@email.com.br");
		Usuario novoUsuario6 = new Usuario("Não Dropei", "naodropei@email.com.br");
		em.getTransaction().begin(); // Para que o dado persista, será necessário iniciar uma transação
		em.persist(novoUsuario1);
		em.persist(novoUsuario2);
		em.persist(novoUsuario3);
		em.persist(novoUsuario4);
		em.persist(novoUsuario5);
		em.persist(novoUsuario6);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
