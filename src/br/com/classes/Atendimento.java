package br.com.classes;

public class Atendimento {
	
	//encapsulamento promove segurança atraves dos metodos acessores como (public, private, protected)
	//quem promove o acesso do encapsulamento é o get e set
	//this pega um atributo do mesmo nome e pode receber um parâmetro do mesmo nome
	
	private int horas;
	
	//Criando metodo acessor Set, nesse metodo posso passar as minhas regras de negocio
	
	public void setHoras(int horas) {
		if(horas < 1 || horas > 12) {
			
		System.out.println("A quantidade de horas de um atendimento não pode ser menor que 1 e nem maior que 12 Horas\n");
		}
		else  {
			this.horas = horas;
		}
	}
	
//O metodo get não ultiliza o void pois o uso somente para "PEGAR" uma informação
	
	public int getHoras() {
		return horas;
	}
	
}
