package com.felipeflohr.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("curso-jpa-hibernate");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 1L);
		em.detach(usuario); // <- Dessa maneira, o usuário não ficará no modo gerenciado, e as alterações não serão aplicadas
		usuario.setNome("Felipe");

		// Sem o objeto estar no modo genreciado, a única maneira de atualizá-lo é utilizando o método merge()
		em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
