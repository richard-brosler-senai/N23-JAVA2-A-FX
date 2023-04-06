package br.com.senaisp.bauru.richard.secao09.exemplo04;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class TelaMediaPlayer extends VBox{
	private Scene scena;
	private ControladorScena controle;
	
	private HBox barraBotoes;
	private Button btnPlay;
	private Button btnPause;
	private Button btnStop;
	private Button btnSair;
	
	private Media arquivoMP4;
	private MediaPlayer tocadorMP4;
	private MediaView visualizadorMP4;
	
	public TelaMediaPlayer() {
		arquivoMP4 = new Media("https://www.gov.br/plataformamaisbrasil/pt-br/noticias-e-eventos/eventos/apresentacoes-de-eventos/2019/apresentacoes-iv-forum-nacional-das-transferencias-da-uniao/industria_4-0_-_senai.mp4/@@download/file/Industria_4.0_-_SENAI.mp4");
		tocadorMP4 = new MediaPlayer(arquivoMP4);
		visualizadorMP4 = new MediaView(tocadorMP4);
		//dimensionando o visualizador
		visualizadorMP4.setFitWidth(750);
		visualizadorMP4.setFitHeight(550);
		visualizadorMP4.setPreserveRatio(true);
		// Criando o HBox
		barraBotoes = new HBox();
		//Criando os botões
		btnPlay = new Button("Play");
		btnPause = new Button("Pause");
		btnStop = new Button("Stop");
		btnSair = new Button("Sair");
		//Dando espaços no hbox
		barraBotoes.setSpacing(10);
		//Colocando alinhamento no centro
		barraBotoes.setAlignment(Pos.CENTER);
		//adicionando botoes à barra
		barraBotoes.getChildren()
			.addAll(btnPlay,btnPause,btnStop,btnSair);
		//Adicionando itens no VBOx
		getChildren().addAll(visualizadorMP4,barraBotoes);
		//Setando espaço interno (padding)
		setPadding(new Insets(10));
		setSpacing(10);
		setAlignment(Pos.CENTER);
		//Criando a scena
		scena = new Scene(this,800,600);
		//Adicionando eventos
		adicionarEventos();
	}

	private void adicionarEventos() {
		btnPlay.setOnAction((evt)->{
			tocadorMP4.play();
		});
		btnPause.setOnAction((evt)->{
			tocadorMP4.pause();
		});
		btnStop.setOnAction((evt)->{
			tocadorMP4.stop();
		});
		btnSair.setOnAction((evt)->{
			Stage janela = (Stage)this.getScene().getWindow();
			tocadorMP4.stop();
			janela.setScene(controle.getScena("TelaPrincipal"));
		});
		
	}

	public ControladorScena getControle() {
		return controle;
	}

	public void setControle(ControladorScena controle) {
		this.controle = controle;
		controle.addScena("TelaMediaPlayer", scena);
		controle.addTitulo("TelaMediaPlayer", "Tela Media Player");
	}

	public Scene getScena() {
		return scena;
	}

}
