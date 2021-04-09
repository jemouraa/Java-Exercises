package PacoteJava;

public class Aviao {
	private String modelo;
	private String cor;
	private String compania;
	
	public Aviao (String m, String c, String cia) {
		this.setModelo(m);
		this.setCor(c);
		this.setCompania(cia);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String m) {
		modelo = m;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String c) {
		cor = c;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String cia) {
		compania = cia;
	}
	
	public void imprimirInfo() {
		System.out.println("Avião\nModelo: "+modelo+"\nCor: "+cor+"\nCompania: "+compania);
		
	}
}

	
	

