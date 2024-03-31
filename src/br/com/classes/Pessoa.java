package br.com.classes;

import interfaces.Isaldo;

//Criando super classe Pessoa para as classes que terão as mesma caracteristicas
//Sempre que tiver uma super classe, a classe vira uma classe abstract Ex: public abstract class
//extends é usado para herança de classes, enquanto implements é usado para implementação de interfaces.

public abstract class Pessoa implements Isaldo{

	// Atributos
	protected String nome;

	protected String telefone;

	protected String endereco;

	private double saldo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}