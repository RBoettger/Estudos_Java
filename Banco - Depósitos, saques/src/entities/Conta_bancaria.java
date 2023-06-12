package entities;

public class Conta_bancaria {
	private int numConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta_bancaria(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}
	
	
	public int getNumConta() {
		return numConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaque(double saque) {
		this.saldo -= saque + 5.0;
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public String toString() {
		return "Account " + getNumConta() +
				" Holder: " + getNomeTitular() +
				", Balance: $" + getSaldo();
	}
	
}
