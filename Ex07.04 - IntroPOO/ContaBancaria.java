package PacoteJava;

public class ContaBancaria {
	private String titular = "Talita";
	private double saldo=10;
	
	public ContaBancaria(String titular) {
		this.titular = titular;
		
	}
	public void imprimirInfo() {
		System.out.println("Titular da Conta: "+titular+"\nSaldo: "+getSaldo());
		
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
