package PacoteJava;

public class Patinete {
		private String cor;
		private double preço;
		private String marca;
		
		
		public Patinete(String cor, double preço, String marca) {
			this.setCor(cor);
			this.setPreço(preço);
			this.setMarca(marca);
			
		}

		public String getCor() {
			return cor;
		}


		public void setCor(String cor) {
			this.cor = cor;
		}


		public double getPreço() {
			return preço;
		}


		public void setPreço(double preço) {
			this.preço = preço;
		}


		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		
		
}
