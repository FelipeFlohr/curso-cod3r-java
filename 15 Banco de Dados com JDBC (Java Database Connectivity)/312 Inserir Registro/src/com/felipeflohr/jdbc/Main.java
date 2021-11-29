package com.felipeflohr.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = scanner.nextLine();

		Connection conexao = FabricaConexao.getConexao();
		
		// String sql = "INSERT INTO pessoas (nome) VALUES ('" + nome + "')"; <- Esta maneira é insegura, pois deixa uma brecha para SQL Injection (ex: colocar "DROP DATABASE pessoas" como nome de usuário, e consequentemente afetar o banco de dados)
		String sql = "INSERT INTO pessoas (nome) VALUES (?)"; // Maneira segura
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);

		stmt.execute();

		System.out.println("Pessoa incluida com sucesso!");
		scanner.close();
	}
}
