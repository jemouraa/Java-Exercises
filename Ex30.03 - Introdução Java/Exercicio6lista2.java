package PacoteJava;

import java.util.Scanner;

public class Exercicio6lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float prod;
		double desc;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira o valor do produto: ");
		prod = leia.nextFloat();
		
		desc = (prod*0.91);
		System.out.printf("Produto com desconto = R$  %.2f",desc);
	}

}
