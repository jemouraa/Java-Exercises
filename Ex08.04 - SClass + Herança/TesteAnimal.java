package PacoteJava;

public class TesteAnimal {

	public static void main(String[] args) {
		
		AnimalCorre cachorro = new AnimalCorre("Marley",2,"Au au",true,"cachorro");
		AnimalCorre cavalo = new AnimalCorre("P� de Pano",4,"hinn in in",true,"cavalo");
		AnimalSobe pregui�a = new AnimalSobe("Talita",27,"**Reclama��es**",true,"bicho pregui�a");
		
		System.out.println("---------Lista de Animais------------");
		
		cachorro.imprimirInfo();
		System.out.println("\n---------------------------------\n");
		cavalo.imprimirInfo();
		System.out.println("\n---------------------------------\n");
		pregui�a.imprimirInfo();
		
	}

}
