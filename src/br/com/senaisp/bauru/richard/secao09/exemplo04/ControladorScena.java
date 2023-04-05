package br.com.senaisp.bauru.richard.secao09.exemplo04;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import javafx.scene.Scene;

public class ControladorScena {
	private HashMap<String, Scene> controle;
	private HashMap<String, String> controleTitulos;
	public ControladorScena() {
		controle = new HashMap<>();
		controleTitulos = new HashMap<>();
	}
	public void addScena(String chave, Scene valor) {
		controle.put(chave, valor);
	}
	public Scene getScena(String chave) {
		return controle.get(chave);
	}
	public boolean hasScena(String chave) {
		return controle.containsKey(chave);
	}
	
	public void addTitulo(String chave, String valor) {
		controleTitulos.put(chave, valor);
	}
	public String getTitulo(String chave) {
		return controleTitulos.get(chave);
	}
	public boolean hasTitulo(String chave) {
		return controleTitulos.containsKey(chave);
	}
	
	public List<String> getChaves(){
		return controleTitulos.keySet().stream()
				.collect(Collectors.toList());
	}
	
}
