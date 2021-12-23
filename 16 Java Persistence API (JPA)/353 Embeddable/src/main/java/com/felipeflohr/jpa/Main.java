package com.felipeflohr.jpa;

import com.felipeflohr.jpa.infra.DAO;

public class Main {

	public static void main(String[] args) {
		// Utilizando o Embeddable na classe "Endereco"
		Fornecedor fornecedor = new Fornecedor("Zé do Pastel", new Endereco("Rua John People 123", "14a"));
		Funcionario funcionario = new Funcionario("Invitational Rodrigo", new Endereco("Rua Kaiser 1918", "1b"));
		
		DAO<Object> dao = new DAO<>();
		dao.incluirAtomico(fornecedor);
		dao.incluirAtomico(funcionario);
	}
}
