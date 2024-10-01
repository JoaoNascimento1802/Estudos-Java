package main;

import entity.Entity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Entity entity = new entity (int numconta,String nome ,double saldo);

        System.out.println("Digite o saldo da sua conta : ");
        double valor = sc.nextDouble();

        System.out.println("Digite o seu nome : ");
        String nome = sc.next();

        System.out.println("Digite o numero da sua conta : ");
        int numconta = sc.nextInt();

       int opcoes ;

        System.out.println("Bem vindo ao Sistema de Bancos");
        System.out.println("Digite um número:");
        System.out.println("Opção 1: Saque");
        System.out.println("Opção 2: Depósito");
        System.out.println("Opção 3: Sair");
        opcoes = sc.nextInt();

        switch (opcoes) {
            case 1:
                System.out.println("Quanto você deseja sacar?");
                double valorSaque = sc.nextDouble();
                entity.sacar(valorSaque);
                System.out.println("Novo saldo: " + entity.getSaldo());
                break;
            case 2:
                System.out.println("Quanto você deseja depositar?");
                double valorDeposito = sc.nextDouble();
                entity.depositar(valorDeposito);
                System.out.println("Novo saldo: " + entity.getSaldo());
                break;
            case 3:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    } while (opcoes != 3);

    }

