package PacoteJava;

public class AnimalCorre extends Animal {
		
		private boolean correr;
		
		public AnimalCorre (String nome, int idade, String som, boolean correr, String animal) {
			super (nome,idade,som,animal);
			this.correr = true;
			
		}
		public void imprimirInfo() {
			System.out.println("Nome do animal: "+getNome()+"\nEspécie: "+getAnimal()+"\nIdade: "
					+getIdade()+" anos\nSom: "+getSom()+"\nEste animal corre");
	
	}

		public boolean isCorrer() {
			return correr;
			
		}

		public void setCorrer(boolean correr) {
			this.correr = correr;
			
		}
		
		
		

}
