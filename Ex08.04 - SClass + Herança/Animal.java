package pacotejava;

public class Animal {
	private String nome;
	private int idade;
	private String som;
	private String animal;
	
	
	public Animal (String nome,int idade, String som, String animal) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSom(som);
		this.setAnimal(animal);
	}
	

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}
	
	
}
