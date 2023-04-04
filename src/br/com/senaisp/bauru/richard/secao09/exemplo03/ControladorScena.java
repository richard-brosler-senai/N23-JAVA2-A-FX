package br.com.senaisp.bauru.richard.secao09.exemplo03;

import java.util.HashMap;

import javafx.scene.Scene;

public class ControladorScena {
	private HashMap<String, Scene> controlador;
	
	public ControladorScena() {
		controlador = new HashMap<>();
	}
	
	public void adicionarScene(String chave, Scene valor) {
		controlador.put(chave, valor);
	}
	
	public Scene buscarScene(String chave) {
		return controlador.get(chave);
	}
	
	public boolean haScene(String chave) {
		return controlador.containsKey(chave);
	}
}
