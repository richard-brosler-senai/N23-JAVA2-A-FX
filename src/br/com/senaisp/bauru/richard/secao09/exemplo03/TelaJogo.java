package br.com.senaisp.bauru.richard.secao09.exemplo03;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TelaJogo extends VBox {
	private Button btnTelaPrincipal;
	private Button btnSair;
	private Scene scena;
	private ControladorScena controle;
	
	public TelaJogo() {
		btnTelaPrincipal = new Button("Tela Principal");
		btnSair = new Button("Sair");
		//Colocando os eventos - Usando lambda
		btnSair.setOnAction((evt)->{
			Node no = (Node)evt.getSource();
			Stage janela = (Stage)no.getScene().getWindow();
			janela.close();
		});
		//criando o evento do botão para a tela principal
		btnTelaPrincipal.setOnAction((evt)->{
			Node no = (Node) evt.getSource();
			Stage janela = (Stage) no.getScene().getWindow();
			Scene scenaPrincipal = controle.buscarScene("TelaPrincipal");
			janela.setScene(scenaPrincipal);
		});
		//Colocando os botões para se auto-dimensionarem
		btnTelaPrincipal.prefWidthProperty().bind(this.widthProperty());
		btnSair.prefWidthProperty().bind(this.widthProperty());
		//Dando espaço entre os componentes
		this.setSpacing(10);
		//Deixando o fundo transparente
		this.setStyle("-fx-background-color: rgba(255,255,255,0);");
		//Colocando o espaço nas bordas internas da vbox
		this.setPadding(new Insets(10));
		//Colocando o alinhamento no centro 
		this.setAlignment(Pos.CENTER);
		//adicionando os componentes na tela
		this.getChildren().addAll(btnTelaPrincipal,btnSair);
		//Criando a scene principal
		scena = new Scene(this,800,600,Color.CYAN);
	}

	public Scene getScena() {
		return scena;
	}

	public ControladorScena getControle() {
		return controle;
	}

	public void setControle(ControladorScena controle) {
		this.controle = controle;
	}

}
