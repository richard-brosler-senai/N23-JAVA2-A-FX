package br.com.senaisp.bauru.richard.secao09.exemplo04;

import javafx.application.Application;
import javafx.stage.Stage;

public class JogoTester extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		TelaJogo telaJogo = new TelaJogo();
		
		
		primeiraStage.setTitle("Jogo do Duke");
		primeiraStage.setScene(telaJogo.getScena());
		primeiraStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
