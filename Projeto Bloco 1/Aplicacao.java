package programadeincentivo;

public class Aplicacao {

	public static void main(String[] args) {
		
		DevJunior dev1 = new DevJunior();
		DevPleno dev2 = new DevPleno();
		DevSenior dev3 = new DevSenior();
				
		dev1.setAdmissao("10102020");
		dev1.setNome("Daniel");
		
		dev1.ImprimirInfo();
		
		
		
	}

}
