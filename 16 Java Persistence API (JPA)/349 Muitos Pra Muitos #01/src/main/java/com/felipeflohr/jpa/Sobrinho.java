package com.felipeflohr.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sobrinho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@ManyToMany(mappedBy = "sobrinhos") // Sobrinhos indica aonde está a relação mapeada. Dessa maneira, a tabela "tio_sobrinho" será criada. Se o mappedBy estivesse apontando de tio para sobrinho, a tabela "sobrinho_tio" seria criada no lugar.
	private List<Tio> tios = new ArrayList<>();
	
	public Sobrinho() {
		
	}

	public Sobrinho(String nome) {
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

	public List<Tio> getTios() {
		return tios;
	}

	public void setTios(List<Tio> tios) {
		this.tios = tios;
	}
}
