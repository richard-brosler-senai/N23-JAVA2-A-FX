package br.com.senaisp.bauru.richard.secao09.exemplo01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFxMain extends Application {

	@Override
	public void start(Stage primeiraScena) throws Exception {
		//Painel principal
		Group root = new Group();
		//Adicionando os componentes no painel
		adicionarComponentes(root);
		//Criamos a scena com o painel principal
		Scene scene = new Scene(root, 800, 600, Color.BEIGE);
		//Atribuimos o título e scena para a aplicação
		primeiraScena.setTitle("Título da minha aplicação");
		primeiraScena.setScene(scene);
		//mostramos a aplicação
		primeiraScena.show();
	}
	
	private void adicionarComponentes(Parent root) {
		HBox hbox = new HBox();
		Button btn01 = new Button("Diga Hello World!");
		Button btn02 = new Button();
		Button btn03 = new Button("33333");
		
		btn02.setText("222");
		//Evento do click do botão
		btn01.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Alert msgDlg = new Alert(AlertType.INFORMATION);
				msgDlg.setTitle("Dialogo de Mensagem");
				msgDlg.setHeaderText("Este é o Header da mensagem");
				msgDlg.setContentText("Olá Mundo!");
				msgDlg.showAndWait();
			}
		});
		//Tentando reposicionar o botão 1
		//btn01.setLayoutY(100); //colocando na posiçao y=10
		//Adicionando o objeto ao painel
		hbox.setPrefWidth(800);
		hbox.setLayoutY(550);
		hbox.setPadding(new Insets(10));
		hbox.setSpacing(5);
		//Para que os componentes aumentem com o tamanho do vbox
		//usaremos os comandos abaixo
		HBox.setHgrow(btn01, Priority.ALWAYS);
		HBox.setHgrow(btn02, Priority.ALWAYS);
		HBox.setHgrow(btn03, Priority.ALWAYS);
		//
		btn01.setMaxWidth(Double.MAX_VALUE);
		btn02.setMaxWidth(Double.MAX_VALUE);
		btn03.setMaxWidth(Double.MAX_VALUE);
		
		hbox.getChildren().addAll(btn01,btn02,btn03);
		
		//Aqui estou testando se é Pane ou seus descendentes
		if (root instanceof Pane) {
			((Pane) root).getChildren().addAll(hbox);
		} else { //se não for Pane é Group
			((Group) root).getChildren().addAll(hbox);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
