package PacoteJava;

public class CelularTeste {

	public static void main(String[] args) {
		
		Celular smart = new Celular("Samsung","A30","Branco");
		Celular smart2 = new Celular("Iphone","11","Preto");
		
		smart.imprimirInfo();
		System.out.println("\n******************************\n");
		smart2.imprimirInfo();

	}

}
