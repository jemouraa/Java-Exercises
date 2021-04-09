package PacoteJava;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String setor;
	
	public Funcionario() {
		
	}
	public void imprimirInfo() {
		System.out.println("Colaborador: "+this.getNome()+"\nIdade: "+this.getIdade()+"anos\nCor: "+this.getSetor());
		
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

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
}
