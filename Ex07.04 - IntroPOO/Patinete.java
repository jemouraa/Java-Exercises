package PacoteJava;

public class Patinete {
		private String cor;
		private double pre�o;
		private String marca;
		
		
		public Patinete(String cor, double pre�o, String marca) {
			this.setCor(cor);
			this.setPre�o(pre�o);
			this.setMarca(marca);
			
		}

		public String getCor() {
			return cor;
		}


		public void setCor(String cor) {
			this.cor = cor;
		}


		public double getPre�o() {
			return pre�o;
		}


		public void setPre�o(double pre�o) {
			this.pre�o = pre�o;
		}


		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		
		
}
