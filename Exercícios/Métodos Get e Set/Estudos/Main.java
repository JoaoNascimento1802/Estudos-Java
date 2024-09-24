package Main;

import java.util.Scanner;

import Entity.Entity;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Insira o nome do titular:");
        String titular = scn.nextLine();

        System.out.println("Insira o saldo inicial da conta:");
        double saldo = scn.nextDouble();
        scn.nextLine(); 
        
        System.out.println("Insira o número da conta:");
        int numConta = scn.nextInt();
        scn.nextLine(); 
        
        Entity entity = new Entity(numConta, saldo, titular);

        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");

            opcao = scn.nextInt();
            scn.nextLine(); 
            
            switch (opcao) {
                case 1:
                    entity.titularInfo();
                    System.out.println(entity.setnome(titular));
                    entity.numInfo();
                    System.out.println(entity.getNumConta());
                    entity.saldoInfo();
                    System.out.println(entity.getSaldo());
                    break;
                case 2:
                    System.out.print("Valor a depositar: ");
                    double valorDeposito = scn.nextDouble();
                    entity.Deposito(valorDeposito);
                    break;
                case 3:
                    System.out.print("Valor a sacar: ");
                    double valorSaque = scn.nextDouble();
                    entity.Saque(valorSaque);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scn.close();
    }
}
