package br.com.senaisp.bauru.richard.secao09.exemplo03;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaJogo extends VBox {
	private Button btnTelaPrincipal;
	private Button btnSair;
	
	public TelaJogo() {
		btnTelaPrincipal = new Button("Tela Principal");
		btnSair = new Button("Sair");
		//Colocando os eventos - Usando lambda
		btnSair.setOnAction((evt)->{
			Node no = (Node)evt.getSource();
			Stage janela = (Stage)no.getScene().getWindow();
			janela.close();
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
	}

}
