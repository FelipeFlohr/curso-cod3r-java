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

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label labelTitulo = new Label("Contador");
		Label labelNumero = new Label("0");

		Button botaoDecremento = new Button("-");
		Button botaoIncremento = new Button("+");

		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER); // Define o alinhamento da box dos botões
		boxBotoes.setSpacing(10); // Define o espaçamento entre os elementos da box
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);

		VBox boxPrincipal = new VBox();
		boxPrincipal.setAlignment(Pos.CENTER); // Define o alinhamento da box principal
		boxPrincipal.setSpacing(10); // Define o espaçamento entre os elementos da box
		boxPrincipal.getChildren().add(labelTitulo);
		boxPrincipal.getChildren().add(labelNumero);
		boxPrincipal.getChildren().add(boxBotoes);

		Scene cenaPrincipal = new Scene(boxPrincipal, 400, 400); // Frame principal
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show(); // Mostra a janela
	}

	public static void main(String[] args) {
		launch(args);
	}
}
