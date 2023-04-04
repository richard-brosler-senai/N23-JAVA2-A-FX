package br.com.senaisp.bauru.richard.secao09.exemplo04;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class TelaJogo extends Group {
	private Scene scena;
	
	public TelaJogo() {
		ImagemDuke img01 = new ImagemDuke();
		ImagemDuke img02 = new ImagemDuke();
		ImagemDuke img03 = new ImagemDuke();
		//Posicionando os imagens
		img01.setLayoutX(10);
		img01.setLayoutY(10);
		
		img02.setLayoutX(200);
		img02.setLayoutY(10);
		
		img03.setLayoutX(300);
		img03.setLayoutY(200);
		//Adicionando os groups de imagens no group root
		this.getChildren().addAll(img01,img02,img03);
		//Criando a scena e atribuindo o group
		scena = new Scene(this, 800,600, Color.BEIGE);
	}
	
	public Scene getScena() {
		return scena;
	}
}
