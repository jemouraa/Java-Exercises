package PacoteJava;

import java.util.Scanner;

public class Exercicio3_06abril {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,c,cont10=0;
		int[][]matriz = new int[3][3];
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.println("Insira um número inteiro: ");
				matriz[l][c]= leia.nextInt();
				
					if(matriz[l][c]>10) {
						cont10++;
					}
				}
			}
		System.out.println("\n"+cont10+" números são maiores que 10");
	
	}

}
