package programadeincentivo;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public abstract class Funcionarios {
	private String nome;
	private String cargo;
	private String admissao;
	private double salario;
	

	public Funcionarios(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public String avaliar() {
		return avaliar();
	}	
	
	public void ImprimirInfo() {
		System.out.println("Dados do funcionário\nNome: "+getNome()+"\nCargo: "+getCargo()
		+"\nData de admissão: "+getAdmissao()+"\nSalário: "+getSalario());
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getAdmissao() {
		String data = new SimpleDateFormat("dd/MM/yyyy").format(admissao);
		return admissao;
	}

	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}

	public String getSalario() {
	
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(this.salario);
			return formatoMoeda;
		
		
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
