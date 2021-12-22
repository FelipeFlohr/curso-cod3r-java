package com.felipeflohr.jpa;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// Um pedido tem muitos itens
@Entity
public class Pedido {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private Date data;

	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY) // O fetch type "LAZY" (lerdo) faz com que o resultado seja apenas trago de forma explítica (através de getter, por exemplo). Esse é o fetch type padrão para listas.
	private List<ItemPedido> itens;
	
	public Pedido() {
		this(new Date());
	}
	
	public Pedido(Date data) {
		this.data = data;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
}
