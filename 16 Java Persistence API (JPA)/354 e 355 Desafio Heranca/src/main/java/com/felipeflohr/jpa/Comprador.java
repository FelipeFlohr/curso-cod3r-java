package com.felipeflohr.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "compradores")
public class Comprador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;

	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Veiculo> veiculos = new ArrayList<>();
	
	public Comprador() {
		
	}

	public Comprador(String nome) {
		this.nome = nome;
	}
	
	public void adicionarVeiculo(Veiculo veiculo) {
		if (veiculo != null && !veiculos.contains(veiculo)) {
			System.out.println("Veiculo " + veiculo + " foi adicionado ao comprador " + getNome());
			veiculos.add(veiculo);

			if (!veiculo.getCompradores().contains(this)) {
				veiculo.getCompradores().add(this);
			} else {
				System.out.println("Esse comprador (" + getNome() + ") não foi adicionado a lista de compradores do veículo " + veiculo + " pois já está presente na mesma");
			}
		} else {
			System.out.println("Veiculo " + veiculo + " não foi adicionado ao comprador (" + getNome() + ") pois o comprador já possui este veículo. Lista de veículos: " + getVeiculos());
		}
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

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, veiculos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comprador other = (Comprador) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(veiculos, other.veiculos);
	}
}
