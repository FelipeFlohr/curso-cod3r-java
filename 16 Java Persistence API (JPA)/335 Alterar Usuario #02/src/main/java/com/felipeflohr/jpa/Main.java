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
		usuario.setNome("Felipe Matheus"); // <- A mudança aqui será aplicada mesmo sem o método merge(), pois quando uma consulta é realizada dentro de uma transação, é dito que esta entidade está dentro de um contexto de gerenciamento, ou seja, toda mudança aplicada á ela será sincronizada com o banco de dados

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
