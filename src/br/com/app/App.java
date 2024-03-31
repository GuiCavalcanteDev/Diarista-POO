package br.com.app;

import br.com.classes.Atendimento;
import br.com.classes.Cliente;
import br.com.classes.Diarista;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Diarista diarista = new Diarista();
        Cliente cliente = new Cliente();
        Atendimento atendimento = new Atendimento();

        System.out.println("Digite o nome do Cliente: ");
        cliente.setNome(scanner.nextLine());
        System.out.println("Digite o telefone do Cliente: ");
        cliente.setTelefone(scanner.nextLine());
        System.out.println("Digite o endereco do Cliente: ");
        cliente.setEndereco(scanner.nextLine()); 
        cliente.setSaldo(1000.00);
        System.out.println("Digite o valor do depósito:");
        double valorDeposito = scanner.nextDouble(); // Lê o valor do depósito
        valorDeposito *= 1.10; // Adiciona 10% ao valor do depósito
        cliente.depositar(valorDeposito); 

        scanner.nextLine();

        System.out.println("Digite o nome da diarista: ");
        diarista.setNome(scanner.nextLine());
        System.out.println("Digite o telefone da diarista:");
        diarista.setTelefone(scanner.nextLine());
        System.out.println("Digite o endereco da diarista:");
        diarista.setEndereco(scanner.nextLine());
        System.out.println("Digite o pix da diarista:");
        diarista.setChavePix(scanner.nextLine());

        System.out.println("Digite a quantidade de horas trabalhada ");
        atendimento.setHoras(scanner.nextInt());

        System.out.println("nome do cliente: " + cliente.getNome());
        System.out.println("telefone do cliente: " + cliente.getTelefone());
        System.out.println("endereço do cliente: " + cliente.getEndereco());
        System.out.println("Saldo do cliente é de: " + cliente.getSaldo());
        System.out.printf("Valor do depósito: %.2f\n", valorDeposito); 

        System.out.println("\n***********************************************\n");

        System.out.println("nome da diarista: " + diarista.getNome());
        System.out.println("telefone da diarista: " + diarista.getTelefone());
        System.out.println("endereço da diarista: " + diarista.getEndereco());
        System.out.println("Pix da diarista: " + diarista.getChavePix());
        System.out.printf("Valor disponivel para saque: %.2f\n", valorDeposito);

        System.out.println("\n***********************************************");

        System.out.println("Digite a quantidade de horas trabalhada: " + atendimento.getHoras());
        atendimento.setHoras(scanner.nextInt());

        scanner.close();
    }
}
