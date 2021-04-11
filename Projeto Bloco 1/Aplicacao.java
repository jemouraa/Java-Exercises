package programadeincentivo;

public class Aplicacao {

	public static void main(String[] args) {
		
		DevJunior dev1 = new DevJunior();
		DevPleno dev2 = new DevPleno();
		DevSenior dev3 = new DevSenior();
				
		dev1.setNome("Daniel");	
		dev1.setAdmissao("11/10/2020");
		dev1.avaliar();
		dev1.ImprimirInfo();
		
		
		
		
	}

}
