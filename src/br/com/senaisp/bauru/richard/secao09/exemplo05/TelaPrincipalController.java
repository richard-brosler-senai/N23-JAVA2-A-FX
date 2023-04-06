package br.com.senaisp.bauru.richard.secao09.exemplo05;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class TelaPrincipalController {

	@FXML public Button btnCliqueMe;

	@FXML public void btnCliqueMeAction(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("Olá Mundo!!!");
		alert.showAndWait();
	}

}
