package br.com.senaisp.bauru.richard.secao09.exemplo05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TelaMain extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		BorderPane root = (BorderPane) FXMLLoader.load(
				getClass().getResource("TelaPrincipal.fxml"));
		
		Scene scene = new Scene(root,800,600);
		scene.getStylesheets().add(getClass()
				.getResource("aplicacao.css").toExternalForm());
		
		primeiraStage.setTitle("Aplicação Principal");
		primeiraStage.setScene(scene);
		primeiraStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
