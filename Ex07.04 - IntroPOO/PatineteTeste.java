package PacoteJava;

public class PatineteTeste {

	public static void main(String[] args) {
			
		Patinete pat1 = new Patinete("rosa",450.00,"Caloi");
		
		System.out.println("Informações adcionais:\nCOR: "+pat1.getCor()+"\nPREÇO: "+pat1.getPreço()+"\nMARCA: "+pat1.getMarca());
		
	}

}
