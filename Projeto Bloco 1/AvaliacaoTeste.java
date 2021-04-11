package programadeincentivo;

import java.util.Scanner;

public class AvaliacaoTeste {

	public static void main(String[] args) {
		
		String[] habilidades={"Responsabilidade Pessoal","Mentalidade de Crescimento","Orientação ao futuro","Persistencia",
				"Comunicação","Trabalho em equipe", "Atenção aos Detalhes", "Proatividade","Profissionalismo", "Precisão Técnica"};
		int op;
		int pontuacao=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Avaliaçao ");
		
		for (String x : habilidades) {
		System.out.println("Para a Habilidade "+x);
		System.out.println("Digite a opção desejada:\n1 - Iniciante\n2 - Em desenvolvimento\n3 - Proficiente\n4 - Avançado");
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
			System.out.println("Opção inválida");
		}
		System.out.println(pontuacao);
		}
		
	}
		

}
