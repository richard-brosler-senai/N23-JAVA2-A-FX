package br.com.senaisp.bauru.richard.secao09.exemplo02;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TesteCores extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		Group root = new Group();
		//Aqui vou adicionar os componentes
		Rectangle rect = new Rectangle(20,20,200,100);
		//Preenchendo com a cor branca          //X  Y  X  Y  propr
		LinearGradient grad1 = new LinearGradient(0, 0, 1, 0, true, 
				CycleMethod.NO_CYCLE, new Stop[]{
						new Stop(0,Color.DODGERBLUE),
						new Stop(1,Color.BLACK),
				});
		rect.setFill(grad1);
		
		Polygon star = new Polygon(
				
				);
		
		star.setFill(Color.WHITE);
		//Adiocionando o item ao nó root
		root.getChildren().addAll(rect, star);
		//Criando a scene
		Scene scene = new Scene(root,800,600,Color.BLACK);
		
		primeiraStage.setTitle("Demonstração de cores e formas");
		primeiraStage.setScene(scene);
		primeiraStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
