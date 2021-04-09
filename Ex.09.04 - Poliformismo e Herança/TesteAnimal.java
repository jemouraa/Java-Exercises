package pacotejava;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro();
		Preguica bipre = new Preguica();
		Cavalo pocoto = new Cavalo();
		
		cao.setNome("Totó");
		bipre.setNome("Pedro");
		pocoto.setNome("Pé de Pano");
		
		cao.setIdade(2);
		bipre.setIdade(4);
		pocoto.setIdade(10);
		
		cao.imprimirInfo();
		bipre.imprimirInfo();
		pocoto.imprimirInfo();
		
	
		
		
		
		
		
		
		
	}

}
