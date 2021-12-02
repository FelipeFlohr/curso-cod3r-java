package com.felipeflohr.jdbc;

public class Main {

	public static void main(String[] args) {
		// Padr�o de Projeto DAO - Data Access Object
		// DAO separa o c�digo da parte do objeto e do SQL

		/* O objeto dentro do DAO:
		 * - Prov� uma interface que abstrai o acesso a dados;
		 * - L� e grava a partir da origem de dados;
		 * - Encapsula o acesso aos dados, de forma que as demais classes n�o precisam saber
		 * sobre isso.
		 */

		DAO dao = new DAO();

		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		System.out.println(dao.incluir(sql, "Jo�o da Silva", 1000));
		System.out.println(dao.incluir(sql, "Ana J�lia", 1001));
		System.out.println(dao.incluir(sql, "Bateus de Marros", 1002));
		System.out.println(dao.incluir(sql, "Jennifer Pommewagen", 1003));

		dao.close();
	}
}