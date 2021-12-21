package com.felipeflohr.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@OneToOne // O cliente estabelecer� a rela��o pois � mais f�cil achar o assento pelo cliente do que o contr�rio
	@JoinColumn(name = "assento_id", unique = true) // Isso far� com que a coluna seja relacionada � "assento_id". Tamb�m far� com que apenas haja valores �nicos, criando assim uma rela��o um para um.
	private Assento assento;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, Assento assento) {
		this.nome = nome;
		this.assento = assento;
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

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}
}
