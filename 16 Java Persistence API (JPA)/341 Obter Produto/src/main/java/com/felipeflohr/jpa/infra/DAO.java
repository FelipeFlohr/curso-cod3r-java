package com.felipeflohr.jpa.infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("curso-jpa-hibernate");
		} catch (Exception e) {
			
		}
	}

	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}

	public DAO<E> abrirTransacao() {
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharTransacao() {
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluir(E entidade) {
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade) {
		return this.abrirTransacao().incluir(entidade).fecharTransacao();
	}

	public List<E> obterTodos() {
		return this.obterTodos(10, 0);
	}
	
	public List<E> obterTodos(int qntRegistros, int deslocamento) {
		if (classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}

		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);

		query.setMaxResults(qntRegistros);
		query.setFirstResult(deslocamento);
		
		return query.getResultList();
	}
	
	public void fechar() {
		em.clear();
	}
}
