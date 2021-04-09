package PacoteJava;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Jeruza",30,"feminino");
		Cliente c2 = new Cliente("Maria",2,"feminino");
		
		c1.imprimirInfo();
		System.out.println("------------------------------------------");
		c2.imprimirInfo();

	}

}
