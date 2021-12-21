package com.felipeflohr.jpa;

import javax.persistence.CascadeType;
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

	@OneToOne(cascade = CascadeType.PERSIST) // Dessa maneira, uma operação em cascada será realizada para persistir qualquer assento que não esteja persistido. Exemplo: se não estivesse fazendo essa cascada, um "incluirAtomico" do DAO não causaria efeito, pois não conseguiria persisitir o assento
	@JoinColumn(name = "assento_id", unique = true)
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
