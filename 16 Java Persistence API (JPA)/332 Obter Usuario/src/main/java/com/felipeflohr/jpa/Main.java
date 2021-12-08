package com.felipeflohr.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("curso-jpa-hibernate");
		EntityManager em = emf.createEntityManager();

		// Obtendo usu�rios
		Usuario usuario = em.find(Usuario.class, 1L);
		System.out.println("Usu�rio obtido: " + usuario.getNome());
		
		em.close();
		emf.close();
	}
}
