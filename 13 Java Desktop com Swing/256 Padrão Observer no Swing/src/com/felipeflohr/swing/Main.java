package com.felipeflohr.swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Definindo a operação de fechamento do programa
		janela.setSize(600, 200); // Definindo o tamanho da janela
		janela.setLayout(new FlowLayout()); // Definindo o layout da janela
		janela.setLocationRelativeTo(null); // Dessa maneira a janela aparecerá centralizada na tela do computador

		// Criando um botão no Swing
		JButton botao = new JButton("Clicar!");
		janela.add(botao);

		// Adicionando um observador ao botão
		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu!");
		});

		janela.setVisible(true);
	}

}
