package br.com.classes;

public class Cliente extends Pessoa {
	
	protected double depositar;

//@Override é uma anotação 
	@Override
	public void sacar(double valor) {

		var saldoDisponivel = getSaldo();
		var novoSaldo = saldoDisponivel - valor;
		setSaldo(novoSaldo);

	}

	@Override
	public void depositar(double valor) {

		var saldoDisponivel = getSaldo();
		var novoSaldo = saldoDisponivel - valor;
		setSaldo(novoSaldo);
	}

// Metodos
	public void PrestadoraDeServicos(String nomeDiarista) {
		System.out.println("Esta contratando a diarista: " + nomeDiarista);

	}

}
