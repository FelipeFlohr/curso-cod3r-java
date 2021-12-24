package com.felipeflohr.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class VeiculoQuatroRodas extends Veiculo {

	@Column(name = "manivela_direcao")
	private String manivelaDirecao;
	
	public VeiculoQuatroRodas() {

	}

	public VeiculoQuatroRodas(String marca, String modelo, String manivelaDirecao) {
		super(marca, modelo);
		this.manivelaDirecao = manivelaDirecao;
	}

	public String getManivelaDirecao() {
		return manivelaDirecao;
	}

	public void setManivelaDirecao(String manivelaDirecao) {
		this.manivelaDirecao = manivelaDirecao;
	}
}
