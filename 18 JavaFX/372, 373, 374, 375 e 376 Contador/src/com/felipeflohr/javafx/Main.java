package com.felipeflohr.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	private int contador = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");

		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");

		Button botaoDecremento = new Button("-");
		botaoDecremento.setOnAction(e -> { // Faz com que o contador diminua
			contador--;
			labelNumero.setText(String.valueOf(contador));
		});

		Button botaoIncremento = new Button("+");
		botaoIncremento.setOnAction(e -> { // Faz com que o contador aumente
			contador++;
			labelNumero.setText(String.valueOf(contador));
		});

		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER); // Define o alinhamento da box dos botões
		boxBotoes.setSpacing(10); // Define o espaçamento entre os elementos da box
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);

		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo"); // Adiciona a classe CSS que representa o estilo da Box
		boxConteudo.setAlignment(Pos.CENTER); // Define o alinhamento da box principal
		boxConteudo.setSpacing(10); // Define o espaçamento entre os elementos da box
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);

		String caminhoDoCss = getClass().getResource("/com/felipeflohr/javafx/Main.css").toExternalForm();
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400); // Frame principal
		cenaPrincipal.getStylesheets().add(caminhoDoCss); // Adiciona a estilização na aplicação
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Raleway");
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show(); // Mostra a janela
	}

	public static void main(String[] args) {
		launch(args);
	}
}
