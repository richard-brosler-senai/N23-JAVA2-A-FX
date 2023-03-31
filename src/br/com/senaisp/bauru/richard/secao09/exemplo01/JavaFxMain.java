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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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
		
		Rectangle rect = new Rectangle(200,200,Color.CYAN);
		
		Text text = new Text("Dorm 6:\n200");
		
		ImageView imgVw = new ImageView();
		Image img = new Image("https://pbs.twimg.com/media/C4nRXI4WYAAej54.jpg");
		//Dimensionando o visualizador para 100px X 100px
		imgVw.setFitWidth(200);
		imgVw.setFitHeight(200);
		//Setando a imagem para o view
		imgVw.setImage(img);
		//Indicando que ele vai manter as proporções da imagem
		imgVw.setPreserveRatio(true);
		//Posicionando o imageview na tela
		imgVw.setX(500);
		imgVw.setY(200);
		
		//https://pbs.twimg.com/media/C4nRXI4WYAAej54.jpg
		
		text.setFill(Color.RED);
		text.setX(350);
		text.setY(250);
		text.setFont(Font.font("Arial", FontWeight.BOLD,
				FontPosture.REGULAR, 28));
		text.setStroke(Color.BLACK);
		text.setStrokeWidth(5);
		//Colocando o contorno por fora da letra
		text.setStrokeType(StrokeType.OUTSIDE);
		//Mudando o formato do contorno para ficar contorno arredondado
		text.setStrokeLineJoin(StrokeLineJoin.ROUND);
		
		rect.setX(100);
		rect.setY(10);
		
		rect.setStroke(Color.ORANGE);
		rect.setStrokeWidth(5);
		
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
			((Pane) root).getChildren().addAll(hbox,rect,text,imgVw);
		} else { //se não for Pane é Group
			((Group) root).getChildren().addAll(hbox,rect,text,imgVw);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
