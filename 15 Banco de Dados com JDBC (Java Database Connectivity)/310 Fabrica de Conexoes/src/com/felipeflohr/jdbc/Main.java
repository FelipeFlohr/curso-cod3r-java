package com.felipeflohr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE cursojava");

		System.out.println("Banco criado com sucesso!");
		conexao.close();
	}
}
