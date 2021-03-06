package com.felipeflohr.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainCaixa extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox temp = new VBox();
		temp.getChildren().add(new Caixa().comTexto("1"));
		temp.getChildren().add(new Caixa().comTexto("2"));
		temp.getChildren().add(new Caixa().comTexto("3"));
		temp.getChildren().add(new Caixa().comTexto("4"));

		Scene principal = new Scene(temp, 800, 600);

		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
