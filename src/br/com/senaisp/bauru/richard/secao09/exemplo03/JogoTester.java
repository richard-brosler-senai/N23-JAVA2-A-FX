package br.com.senaisp.bauru.richard.secao09.exemplo03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JogoTester extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		TelaPrincipal telaPrincipal = new TelaPrincipal();
		
		Scene scene = new Scene(telaPrincipal,800,600,Color.BEIGE);
		
		primeiraStage.setTitle("Exemplo de troca de telas");
		primeiraStage.setScene(scene);
		primeiraStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
