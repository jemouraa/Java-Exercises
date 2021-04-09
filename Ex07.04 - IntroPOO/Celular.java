package PacoteJava;

public class Celular {
	
	private String marca;
	private String modelo;
	private String cor;
	
	public Celular(String m, String mod, String c) {
		this.setMarca(m);
		this.setModelo(mod);
		this.setCor(c);
	}
	public void imprimirInfo() {
		System.out.println("Smartphone\nMarca: "+this.getMarca()+"\nModelo: "+this.getModelo()+"\nCor: "+this.getCor());
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String m) {
		marca = m;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String mod) {
		modelo = mod;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String c) {
		cor = c;
	}
	
	

}
