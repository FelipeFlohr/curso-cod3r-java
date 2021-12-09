package com.felipeflohr.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("curso-jpa-hibernate");
		EntityManager em = emf.createEntityManager();

		// Alterar usuário
		// Para fazer uma alteração, será necessário abrir uma transação
		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 2L);
		usuario.setNome("Brayon");
		usuario.setEmail("brayon@email.com.br");
		em.merge(usuario); // Dessa maneira será possível fazer a alteração
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
