package PacoteJava;

import java.util.Scanner;

public class Exercicio4_06abril {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=0,c=0,cte;
		
		char op;
		float [][]matriz1 = new float[2][2];
		float [][]matriz2 = new float[2][2];
		Scanner leia = new Scanner(System.in);
		
		for (l=0;l<2;l++) {
			for (c=0;c<2;c++) {
				System.out.print("Digite um número para matriz 1: ");
				matriz1[l][c] = leia.nextInt();
			}
		}
		for (l=0;l<2;l++) {
			for (c=0;c<2;c++) {
				System.out.print("Digite um número para matriz 2: ");
				matriz2[l][c] = leia.nextInt();
			}
		}
		System.out.println("\nEscolha uma opção: \n1- Soma\n2- Subtração\n"
				+ "3- Adicionar uma constante\n4- Imprimir matrizes");
		op = leia.next().charAt(0);
		
		switch (op) {
		
		case '1':
			float [][]matrizsoma = new float[2][2];
			for (l=0;l<2;l++) {
				for (c=0;c<2;c++) {
					matrizsoma[l][c] = matriz1[l][c] + matriz2[l][c];
					System.out.print(matrizsoma[l][c]+" ");
				}
				System.out.println();
				}
		break;
			
		case '2':
			float [][]matrizsub = new float[2][2];
			for (l=0;l<2;l++) {
				for (c=0;c<2;c++) {
					matrizsub[l][c] = matriz1[l][c] - matriz2[l][c];
					System.out.print(matrizsub[l][c]+" ");
				}
				System.out.println();
			}
		break;
			
		case '3':
			System.out.println("Entre com a constante para somar: ");
			cte = leia.nextInt();
			
			float [][]matrizcte1 = new float[2][2];
			float [][]matrizcte2 = new float[2][2];
			
			System.out.print("Matriz 1:\n");
			for (l=0;l<2;l++) {
				for (c=0;c<2;c++) {
					matrizcte1[l][c] = cte + matriz1[l][c];
					System.out.print(matrizcte1[l][c]+" ");
				}
				System.out.println();
			}	
			
			System.out.print("\nMatriz 2:\n");
			for (l=0;l<2;l++) {
				for (c=0;c<2;c++) {
					matrizcte2[l][c] = cte + matriz2[l][c];
					System.out.print(matrizcte2[l][c]+" ");
				}
				System.out.println();
			}
		break;
		
		case '4':
			System.out.print("Matriz 1:\n");
			for (l=0;l<2;l++) {
				for (c=0;c<2;c++) {
					System.out.print(matriz1[l][c]+" ");
				}
				System.out.println();
			}	
			
			System.out.print("\nMatriz 2:\n");
			for (l=0;l<2;l++) {
				for (c=0;c<2;c++) {
					System.out.print(matriz2[l][c]+" ");
				}
				System.out.println();
			}
		break;
		
		default:
			System.out.println("\nOpção inválida");
			}
		}			
	}	


