package br.com.senaisp.bauru.richard.secao09.exemplo04;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TelaJogo extends Group {
	private Scene scena;
	private ControladorScena controle;
	
	public TelaJogo() {
		ImagemDuke img01 = new ImagemDuke();
		ImagemDuke img02 = new ImagemDuke();
		ImagemDuke img03 = new ImagemDuke();
		Label cliqueAqui = new Label("Clique com o lado direito aqui!");
		MenuItem mni = new MenuItem("Tela Principal");
		//Adicionando o evento do menu item
		mni.setOnAction((evt)->{
			Stage janela = (Stage) this.getScene().getWindow();
			janela.setScene(controle.getScena("TelaPrincipal"));
		});
		ContextMenu mnct = new ContextMenu();
		//Adicionando os menus no menu contexto
		mnct.getItems().addAll(mni);
		//Adicionando o menu contexto ao label
		cliqueAqui.setContextMenu(mnct);
		// Posicionando o label
		cliqueAqui.setLayoutX(500);
		cliqueAqui.setLayoutY(10);
		//Posicionando os imagens
		img01.setLayoutX(10);
		img01.setLayoutY(10);
		
		img02.setLayoutX(200);
		img02.setLayoutY(10);
		
		img03.setLayoutX(300);
		img03.setLayoutY(200);
		//Adicionando os groups de imagens no group root
		this.getChildren().addAll(img01,img02,img03, cliqueAqui);
		//Criando a scena e atribuindo o group
		scena = new Scene(this, 800,600, Color.BEIGE);
	}
	
	public Scene getScena() {
		return scena;
	}

	public ControladorScena getControle() {
		return controle;
	}

	public void setControle(ControladorScena controle) {
		this.controle = controle;
		controle.addScena("TelaJogo", scena);
		controle.addTitulo("TelaJogo", "Tela do Jogo Duke");
	}
}
