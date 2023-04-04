package br.com.senaisp.bauru.richard.secao09.exemplo03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JogoTester extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		TelaPrincipal telaPrincipal = new TelaPrincipal();
		TelaJogo telaJogo = new TelaJogo();
		//Vamos criar o controlador de telas
		ControladorScena controle = new ControladorScena();
		//Vamos atribuir as scenas para o controlador
		controle.adicionarScene("TelaPrincipal",telaPrincipal.getScena());
		controle.adicionarScene("TelaJogo", telaJogo.getScena());
		//Agora precisamos setar em cada objeto o controlador
		telaPrincipal.setControle(controle);
		telaJogo.setControle(controle);
		//Setando a primeira scena
		Scene scene = telaPrincipal.getScena();
		
		primeiraStage.setTitle("Exemplo de troca de telas");
		primeiraStage.setScene(scene);
		primeiraStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
