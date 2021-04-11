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
		String[] habilidades={"Responsabilidade Pessoal","Mentalidade de Crescimento","Orientação ao futuro","Persistencia",
				"Comunicação","Trabalho em equipe", "Atenção aos Detalhes", "Proatividade","Profissionalismo", "Precisão Técnica"};
		int op;
		int pontuacao=0;
		int x;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Avaliaçao do Funcionário"+getNome());
		
		for (x=0;x<10;x++) {
		System.out.println("Para a Habilidade "+habilidades[x]);
		System.out.println("Digite a opção desejada:\n1 - Iniciante\n2 - Em desenvolvimento\n3 - Proficiente\n4 - Avançado");
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
			System.out.println("Opção inválida");
		}
		System.out.println(pontuacao);
		}
		
		return avaliar();
	}	
	
	public void ImprimirInfo() {
		System.out.println("Dados do funcionário\nNome: "+getNome()+"\nCargo: "+getCargo()
		+"\nData de admissão: "+getAdmissao()+"\nSalário: "+getSalario()+"\nPontuação total: "+avaliar());
		
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
