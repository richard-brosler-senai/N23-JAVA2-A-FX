package br.com.senaisp.bauru.richard.secao09.exemplo06;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Cliente {
	private SimpleIntegerProperty id;
	private SimpleStringProperty nome;
	private SimpleDoubleProperty salario;
	
	public Cliente(int id, String nome, double salario) {
		this.id = new SimpleIntegerProperty(id);
		this.nome = new SimpleStringProperty(nome);
		this.salario = new SimpleDoubleProperty(salario);
	}

	public int getId() {
		return id.get();
	}

	public void setId(int id) {
		this.id.set(id);
	}

	public String getNome() {
		return nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}

	public double getSalario() {
		return salario.get();
	}

	public void setSalario(double salario) {
		this.salario.set(salario);
	}
	//Delete
	public boolean apagarCliente() {
		//apagando cliente no bd
		return true;
	}
	//Update
	public boolean atualizarCliente() {
		//atualizar no banco de dados
		return true;
	}
	//Read
	public static Cliente consultaCliente(int id) {
		return null;
	}
	//Create
	public static Cliente criarCliente(String nome, double salario) {
		return new Cliente(0, nome, salario);
	}
}
