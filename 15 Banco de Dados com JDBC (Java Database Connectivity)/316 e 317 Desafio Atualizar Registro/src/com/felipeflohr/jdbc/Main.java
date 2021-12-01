package com.felipeflohr.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		String pessoaNome = null;

		System.out.print("Informe o nome para ser procurado: ");
		String valor = scanner.nextLine();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + valor + "%");
		ResultSet resultado = stmt.executeQuery();

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}

		if (pessoas.isEmpty()) {
			System.out.println("Nenhuma pessoa foi encontrada com este nome.");
		} else {
			System.out.println("Digite o valor da pessoa:\n");
			for (int i = 0; i < pessoas.size(); i++) {
				System.out.println(i + ". " + pessoas.get(i).getNome());
			}

			int pessoaIndex = -1;
			while (pessoaIndex < 0 || pessoaIndex > pessoas.size()) {
				try {
					pessoaIndex = scanner.nextInt();
					scanner.nextLine();
					
				} catch (InputMismatchException e) {
					System.out.println("Valor inválido. Digite novamente.\n");
				}
			}

			pessoaNome = pessoas.get(pessoaIndex).getNome();
		}		

		System.out.print("Informe o novo nome para colocar no lugar: ");
		String novoNome = scanner.nextLine();

		sql = "UPDATE pessoas"
				+ " SET nome = ?"
				+ " WHERE nome = ?;";
		PreparedStatement stmtNome = conexao.prepareStatement(sql);
		stmtNome.setString(1, novoNome);
		stmtNome.setString(2, pessoaNome);
		stmtNome.execute();
		System.out.println("Nome alterado com sucesso.");

		scanner.close();
		stmt.close();
		conexao.close();
	}
}