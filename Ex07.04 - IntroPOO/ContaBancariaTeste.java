package PacoteJava;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria("");
		
		
		c1.imprimirInfo();
		
		c1.depositar(100.00);
		
		System.out.println("************************************");
		
		c1.imprimirInfo();
		
		c1.setSaldo(-100);
		
		c1.imprimirInfo();
		
		
	}

}
