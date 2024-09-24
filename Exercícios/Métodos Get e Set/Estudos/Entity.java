package Entity;

public class Entity {
	private int numConta;
	private double saldo;
	private String titular;
	private String nome;
	private boolean deposito1;
	private boolean saque1;
	
	public Entity(int numConta, double saldo, String titular) {
		super();
		this.numConta = numConta;
		this.saldo = saldo;
		this.titular = titular;
		this.nome = nome;
		this.deposito1 = deposito1;
		this.saque1 = saque1;
	}

	public boolean isSaque1() {
		return saque1;
	}
	public boolean isDeposito() {
		return deposito1;
	}
	public int getNumConta() {
		return numConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public String setnome(String novoNome) {
		return nome = novoNome;
	}
	
	public void saldoInfo() {
		System.out.print("O seu Saldo é : ");
	}
	public void titularInfo() {
		System.out.print(" O titular da conta é :");
	}
	public void numInfo() {
		System.out.print(" O numero da sua conta é :");
	}
	
	public void Deposito(double deposito) {
	if(deposito >0) { 
		saldo += deposito;
		deposito1 = true;
		System.out.println(deposito1);
	}
	else {
		System.out.println("Valor Invalido !");
	}
	}
	
	public void Saque(double saque) {
		if(saque >0) { 
			saldo += saque;
			saque1 = true;
			System.out.println(saque1);
		}
		else {
			System.out.println("Valor Invalido !");
		}
	}
}