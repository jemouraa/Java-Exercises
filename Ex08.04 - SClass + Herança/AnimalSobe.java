package PacoteJava;

public class AnimalSobe  extends Animal {
	
	private boolean sobe;
	
	public AnimalSobe (String nome, int idade, String som, boolean sobe, String animal) {
		super (nome,idade,som,animal);
		this.sobe = true;
	}

	public void imprimirInfo() {
		System.out.println("Nome do animal: "+getNome()+"\nEspécie: "+getAnimal()+"\nIdade: "
				+getIdade()+" anos\nSom: "+getSom()+"\nEste animal sobe em árvores");

	}
	public boolean isSobe() {
		return sobe;
	}

	public void setCorrer(boolean sobe) {
		this.sobe = sobe;
		
	}
	
}


