package entity;

public class Entity {
    private int numconta;
    private String nome;
    private double saldo;

    public Entity(int numconta, String nome, double saldo) {
        this.numconta = numconta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0 ){
            saldo += valor;
        }
        else {
            System.out.println("Valor insuficiente");
        }
    }

    public void sacar(double valorm) {
        if (valorm > saldo) {
            System.out.println("Valor insuficiente");
        }
        else {
            saldo -= valorm;
            System.out.println("saque efetuado com sucesso");
        }
    }
}

