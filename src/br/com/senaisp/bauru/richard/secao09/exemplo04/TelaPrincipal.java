package br.com.senaisp.bauru.richard.secao09.exemplo04;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TelaPrincipal extends BorderPane {
	private Scene scena;
	private ControladorScena controle;
	private MenuBar mainMenu;
	private Menu menuItem;
	
	public TelaPrincipal() {
		menuItem = new Menu("Itens");
		mainMenu = new MenuBar();
		//Adicionando o menu no menubar
		mainMenu.getMenus().addAll(menuItem);
		//Criando a Scene
		scena = new Scene(this,800,600,Color.BEIGE);
		this.setStyle("-fx-background-color: rgba(255,255,255,0);");
		//Adicionando o menu bar no bordepane no topo
		this.setTop(mainMenu);
	}

	public ControladorScena getControle() {
		return controle;
	}

	public void setControle(ControladorScena controle) {
		this.controle = controle;
		//Construir o menuitem
		for(String it: controle.getChaves()) {
			MenuItem mn = new MenuItem();
			String titulo = controle.getTitulo(it);
			mn.setText(titulo);
			//Jogando a chave para a propriedade Id do menuitem
			mn.setId(it);
			//Adicionando o menuitem ao menu
			menuItem.getItems().add(mn);
			//Criando o evento
			mn.setOnAction((evt)->{
				Stage janela = (Stage) this.getScene().getWindow();
				//Obtendo a chave através da propriedade id do menuitem
				String id = ((MenuItem)evt.getSource()).getId();
				janela.setScene(controle.getScena(id));
			});
		}
		//Atribuir o principal para o controle
		controle.addScena("TelaPrincipal", scena);
		controle.addTitulo("TelaPrincipal", "Tela Principal");
	}

	public Scene getScena() {
		return scena;
	}
}
