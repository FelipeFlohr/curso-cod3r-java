package com.felipeflohr.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene principal = new Scene(new TesteAnchorPane(), 800, 600);

		primaryStage.setScene(principal);
		primaryStage.setTitle("Layouts");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
