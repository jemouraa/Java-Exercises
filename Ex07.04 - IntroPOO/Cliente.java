package PacoteJava;

public class Cliente {
	private String nome;
	private int idade;
	private String sexo;
	
	public Cliente (String n, int i, String s) {
		
		this.setNome(n);
		this.setIdade(i);
		this.setSexo(s);
	}
		
	
	public void imprimirInfo() {
			System.out.println("Cliente: "+nome+", "+idade+" anos , sexo "+sexo);
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		nome = n;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int i) {
		idade = i;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String s) {
		sexo = s;
	}
	

}
	
