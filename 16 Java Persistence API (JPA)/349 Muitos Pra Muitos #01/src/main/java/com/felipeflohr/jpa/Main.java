package com.felipeflohr.jpa;

import com.felipeflohr.jpa.infra.DAO;

public class Main {

	public static void main(String[] args) {
		Tio tia1 = new Tio("Maria");
		Tio tio2 = new Tio("João");

		Sobrinho sobrinho1 = new Sobrinho("Davi");
		Sobrinho sobrinha2 = new Sobrinho("Ana");

		// Adicionando tios e sobrinhos
		// Da mesma forma que é necessário adicionar um sobrinho á um tio, é necessário
		// fazer o contrário, senão geraria inconsistência nos dados
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);

		tia1.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tia1);

		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirTransacao()
			.incluir(tia1)
			.incluir(tio2)
			.incluir(sobrinho1)
			.incluir(sobrinha2)
			.fecharTransacao()
			.fechar();
	}
}
