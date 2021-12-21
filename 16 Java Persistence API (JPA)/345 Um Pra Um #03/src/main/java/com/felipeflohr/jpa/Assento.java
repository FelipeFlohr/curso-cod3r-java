package com.felipeflohr.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "assentos")
public class Assento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@OneToOne(mappedBy = "assento") // Dessa maneira ser� criada uma rela��o bi-direcional. O parametro "mappedBy" se refere ao atributo que est� fazendo a rela��o um-para-um (nesse caso "assento" da classe "Cliente". Se n�o houvesse esse atributo, uma coluna seria criada na tabela assento, violando os princ�pios de uni-direcionalidade dos bancos de dados.
	private Cliente cliente;
	
	public Assento() {
		
	}
	
	public Assento(String nome) {
		this.nome = nome;
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
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente c) {
		cliente = c;
	}
}
