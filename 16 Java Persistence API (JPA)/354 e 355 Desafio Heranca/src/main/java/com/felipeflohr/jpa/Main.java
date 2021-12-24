package com.felipeflohr.jpa;

import com.felipeflohr.jpa.infra.DAO;

public class Main {

	public static void main(String[] args) {
		// Desafio: realizar uma heran�a em JPA
		DAO<Comprador> dao = new DAO<>();
		
		Veiculo veiculo1 = new VeiculoQuatroRodas("Volkswagen", "Up TSI", "Volante VW Esportivo 2018");
		Veiculo veiculo2 = new VeiculoDuasRodas("Harley Davidson", "Fatboy", "Guid�o Peixeira Alto");
		Veiculo veiculo3 = new VeiculoDuasRodas("Caloi", "Bicicleta Esportiva", "Guid�o baixo");
		Veiculo veiculo4 = new VeiculoQuatroRodas("Fiat", "Uno Bruxo s� o dok", "Volante Fiat 89");
		Veiculo veiculo5 = new VeiculoQuatroRodas("Volkswagen", "Gol Sport G8", "Volante VW Esportivo 2018");
		Veiculo veiculo6 = new VeiculoDuasRodas("Honda", "Biz 2009", "Guid�o Biz padr�o");
		
		Comprador comprador1 = new Comprador("Mateus da Terra");
		Comprador comprador2 = new Comprador("Billian Kraus");
		Comprador comprador3 = new Comprador("Wilhelm BX");

		comprador1.adicionarVeiculo(veiculo2);
		comprador1.adicionarVeiculo(veiculo3);
		comprador1.adicionarVeiculo(veiculo4);

		comprador2.adicionarVeiculo(veiculo1);
		comprador2.adicionarVeiculo(veiculo5);

		comprador3.adicionarVeiculo(veiculo4);
		comprador3.adicionarVeiculo(veiculo6);
		
		dao.abrirTransacao()
			.incluir(comprador1)
			.incluir(comprador2)
			.incluir(comprador3)
			.fecharTransacao()
			.fechar();
	}
}
