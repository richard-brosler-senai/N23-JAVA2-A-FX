package br.com.senaisp.bauru.richard.secao09.exemplo03;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaPrincipal extends VBox {
	private Button btnJogo;
	private Button btnSair;
	
	public TelaPrincipal() {
		btnJogo =  new Button("Chamar o Jogo");
		btnSair = new Button("Terminar");
		//Métodos dos botões
		btnSair.setOnAction((evt)->{
			(
			  (Stage)((Node)evt.getSource())
					.getScene().getWindow()
			).close();
		});
		//Tirando a cor de fundo
		this.setStyle("-fx-background-color: rgba(255,255,255,0);");
		//Amarrando a propriedade de comprimento da hbox ao tamanho 
		//dos botões
		btnJogo.prefWidthProperty().bind(this.widthProperty());
		btnSair.prefWidthProperty().bind(this.widthProperty());
		//Colocando espaços entre os componentes
		this.setSpacing(10);
		//Alinhando no centro da tela
		this.setAlignment(Pos.CENTER);
		//Colocar espaçamento interno para não ficar 
		//colado no box
		this.setPadding(new Insets(10));
		this.getChildren().addAll(btnJogo, btnSair);
	}
}
