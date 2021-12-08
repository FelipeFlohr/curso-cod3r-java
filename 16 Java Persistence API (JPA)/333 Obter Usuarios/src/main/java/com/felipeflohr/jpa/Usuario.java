package com.felipeflohr.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Aplicando ORM (Object Relational Mapping)
@Entity
public class Usuario {

	@Id // Define o campo "id" como a Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // O Atributo ser� de autoincremento. O tipo de gera��o "Identity" far� com que cada ID seja �nico.
	private Long id;
	private String nome;
	private String email;

	public Usuario() {
	}

	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
