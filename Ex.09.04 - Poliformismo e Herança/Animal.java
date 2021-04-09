package pacotejava;

public abstract class Animal {
	
	private String especie;
	private String nome;
	private int idade;

	public Animal(String especie) {
		this.especie = especie;
	}
	
	abstract public String som();
	
	abstract public String locomocao();

	public String getEspecie() {
		return especie;
	}
	public void imprimirInfo() {
		System.out.println("Esse é meu amigo "+getEspecie()+"\no nome dele é "+getNome()
				+" e ele tem "+getIdade()+" anos");
		System.out.println("Ele adora ".concat(locomocao()));
		System.out.println("e o som que ele faz é ".concat(som()));
		System.out.println("------------------------------------------------------------");
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
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
}
	
