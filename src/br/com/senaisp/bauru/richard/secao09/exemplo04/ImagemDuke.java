package br.com.senaisp.bauru.richard.secao09.exemplo04;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

public class ImagemDuke extends Group{
	private ImageView imagemDukeVw;
	private Image imagemDuke;
	private ImageView imagemLuvaVw;
	private Image imagemLuva;
	private AudioClip audio;
	
	public ImagemDuke() {
		imagemDuke = new Image(getClass()
				.getResource("Images/Duke.png").toString());
		imagemDukeVw = new ImageView(imagemDuke);
		//Carregando a luva
		imagemLuva = new Image(getClass()
				.getResource("Images/Glove.png").toString());
		imagemLuvaVw = new ImageView(imagemLuva);
		//Carregando o audio
		audio = new AudioClip(getClass()
				.getResource("Audios/Note5.wav").toString());
		//Ajuste de posicionamento
		imagemDukeVw.setX(0);
		imagemDukeVw.setY(11);
		//Ajustes para posicionamento da luva
		imagemLuvaVw.setPreserveRatio(true); //manter proporções
		imagemLuvaVw.setFitHeight(35);
		imagemLuvaVw.setX(13);
		imagemLuvaVw.setY(0);
		//Garantindo que a luva fique na frente
		imagemLuvaVw.toFront();
		//Adicionando as imagens view no group
		this.getChildren().addAll(imagemDukeVw, imagemLuvaVw);
		//Adicionando eventos
		adicionarEventos();
	}

	private void adicionarEventos() {
		this.setOnMouseClicked((evt)->{
			audio.play();
		});
		
		this.setOnMouseDragged((evt)->{
			System.out.println(evt.getScreenX() + ";" + evt.getScreenY());
		});
	}
}
