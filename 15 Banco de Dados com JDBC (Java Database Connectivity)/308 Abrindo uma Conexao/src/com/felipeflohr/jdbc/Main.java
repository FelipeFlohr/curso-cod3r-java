package com.felipeflohr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true"; // SSL realizará uma conexão segura
		final String usuario = "root";
		final String senha = "40028922";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}
}
