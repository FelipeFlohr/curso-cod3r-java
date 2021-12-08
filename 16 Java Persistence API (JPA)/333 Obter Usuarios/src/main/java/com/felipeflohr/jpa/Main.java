package com.felipeflohr.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("curso-jpa-hibernate");
		EntityManager em = emf.createEntityManager();

		// Obtendo usuários
		String jpql = "select u from Usuario u"; // "JPQL = Java Persistence Query Language
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);

		List<Usuario> usuarios = query.getResultList();

		for (Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId() + "\nEmail: " + usuario.getEmail() + "\nNome: " + usuario.getNome());
		}

		em.close();
		emf.close();
	}
}
