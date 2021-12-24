package com.felipeflohr.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//@Inheritance <- A annotation Inheritance permite modificar o tipo de herança.
@Entity
@DiscriminatorColumn(name = "veiculo_tipo")
@Table(name = "veiculos")
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String marca;

	private String modelo;

	@ManyToMany(mappedBy = "veiculos")
	@Column(name = "dono")
	private List<Comprador> compradores = new ArrayList<>();
	
	public Veiculo() {
		
	}

	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public List<Comprador> getCompradores() {
		return compradores;
	}

	public void setCompradores(List<Comprador> compradores) {
		this.compradores = compradores;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, marca, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(id, other.id) && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo);
	}

	@Override
	public String toString() {
		return this.marca + " " + this.modelo + " | ID: " + getId();
	}
}
