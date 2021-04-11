package programadeincentivo;

import java.text.NumberFormat;
import java.util.Scanner;

public abstract class Funcionarios {
	private String nome;
	private String cargo;
	private String admissao;
	private double salario;
	

	public Funcionarios(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public int avaliar() {
		String[] habilidades={"Responsabilidade Pessoal","Mentalidade de Crescimento","Orienta��o ao futuro","Persistencia",
				"Comunica��o","Trabalho em equipe", "Aten��o aos Detalhes", "Proatividade","Profissionalismo", "Precis�o T�cnica"};
		int op;
		int pontuacao=0;
		int x;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Avalia�ao do Funcion�rio"+getNome());
		
		for (x=0;x<10;x++) {
		System.out.println("Para a Habilidade "+habilidades[x]);
		System.out.println("Digite a op��o desejada:\n1 - Iniciante\n2 - Em desenvolvimento\n3 - Proficiente\n4 - Avan�ado");
		op = leia.nextInt();
		
		if (op == 1) {
			pontuacao = pontuacao+1;
		}
		else if(op == 2) {
			pontuacao = pontuacao+2;
		}
		else if(op == 3) {
			pontuacao = pontuacao+3;
		}
		else if (op == 4) {
			pontuacao = pontuacao+4;
		}
		else {
			System.out.println("Op��o inv�lida");
		}
		System.out.println(pontuacao);
		}
		
		return avaliar();
	}	
	
	public void ImprimirInfo() {
		System.out.println("Dados do funcion�rio\nNome: "+getNome()+"\nCargo: "+getCargo()
		+"\nData de admiss�o: "+getAdmissao()+"\nSal�rio: "+getSalario()+"\nPontua��o total: "+avaliar());
		
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
