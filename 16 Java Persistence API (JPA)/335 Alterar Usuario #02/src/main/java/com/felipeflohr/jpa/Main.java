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
		usuario.setNome("Felipe Matheus"); // <- A mudan�a aqui ser� aplicada mesmo sem o m�todo merge(), pois quando uma consulta � realizada dentro de uma transa��o, � dito que esta entidade est� dentro de um contexto de gerenciamento, ou seja, toda mudan�a aplicada � ela ser� sincronizada com o banco de dados

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
