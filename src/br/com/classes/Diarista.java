package br.com.classes;

//A palavra extends me permite herdar atributos e metodos de uma classe
public class Diarista extends Pessoa{
	
	//Atributos
	private String chavePix;
	
	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	protected double saque;

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}
	
	@Override
	public void sacar(double valor) {
		
		var saldoDisponivel = getSaldo();
		var novoSaldo = saldoDisponivel - valor;
		setSaldo(novoSaldo);
		
	}
	
	@Override
	public void depositar(double valor) {
		
		var saldoDisponivel = getSaldo();
		var novoSaldo = saldoDisponivel + valor;
		setSaldo(novoSaldo);
		
	}

	//Metodos
	public void servicos(String nomeCliente) {
		System.out.println("Esta realizando o atendimento para o cliente: " + nomeCliente);
		
		
	}
}