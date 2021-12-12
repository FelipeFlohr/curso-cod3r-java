package com.felipeflohr.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos", schema = "cursojava") // O schema é referente ao banco de dados que vai ser acessado. Não é recomendado especificar o esquema, pois isso pode ser feito na hora de criar uma conexão
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "prod_nome", length = 200, nullable = false)
	private String nome;

	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2) // O precision é referente a quantidade de digitos, e o scale é referente a quantidade de casas decimais
	private double preco;

	public Produto() {

	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
