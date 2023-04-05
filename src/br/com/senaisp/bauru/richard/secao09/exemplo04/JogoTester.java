package br.com.senaisp.bauru.richard.secao09.exemplo04;

import javafx.application.Application;
import javafx.stage.Stage;

public class JogoTester extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		TelaJogo telaJogo = new TelaJogo();
		TelaPrincipal telaPrincipal = new TelaPrincipal();
		TelaMediaPlayer telaMediaPlayer = new TelaMediaPlayer();
		ControladorScena controle = new ControladorScena();
		//Adicionando o controle nas telas
		telaJogo.setControle(controle);
		telaMediaPlayer.setControle(controle);
		
		//A tela principal deve ser a última
		telaPrincipal.setControle(controle);
		
		primeiraStage.setTitle("Jogo do Duke");
		primeiraStage.setScene(telaPrincipal.getScena());
		primeiraStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
