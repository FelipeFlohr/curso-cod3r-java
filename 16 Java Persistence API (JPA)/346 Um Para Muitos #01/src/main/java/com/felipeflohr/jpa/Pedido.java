package com.felipeflohr.jpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pedido {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private Date data; // O Date do "java.util.Date" deve ser o Date utilizado para datas

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
}
