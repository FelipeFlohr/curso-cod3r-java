package com.felipeflohr.jpa;

import javax.persistence.Embeddable;

@Embeddable // O Embeddable faz com que os atributos da classe virem colunas e não uma tabela em si
public class Endereco {

	private String logradouro;
	private String complemento;
	
	public Endereco() {
		
	}

	public Endereco(String logradouro, String complemento) {
		this.logradouro = logradouro;
		this.complemento = complemento;
	}

	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
