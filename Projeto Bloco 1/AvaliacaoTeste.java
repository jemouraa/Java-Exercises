package programadeincentivo;

import java.util.Scanner;

public class AvaliacaoTeste {

	public static void main(String[] args) {
		
		String[] habilidades={"Responsabilidade Pessoal","Mentalidade de Crescimento","Orienta��o ao futuro","Persistencia",
				"Comunica��o","Trabalho em equipe", "Aten��o aos Detalhes", "Proatividade","Profissionalismo", "Precis�o T�cnica"};
		int op;
		int pontuacao=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Avalia�ao ");
		
		for (String x : habilidades) {
		System.out.println("Para a Habilidade "+x);
		System.out.println("Digite a op��o desejada:\n1 - Iniciante\n2 - Em desenvolvimento\n3 - Proficiente\n4 - Avan�ado");
		op = leia.nextInt();
		
		if (op == 1) {
			pontuacao = pontuacao+1;
		}
		else if(op == 2) {
			pontuacao = pontuacao+2;
		}
		else if(op == 1) {
			pontuacao = pontuacao+3;
		}
		else if (op == 1) {
			pontuacao = pontuacao+4;
		}
		else {
			System.out.println("Op��o inv�lida");
		}
		System.out.println(pontuacao);
		}
		
	}
		

}
