package PacoteJava;

import java.util.Scanner;

public class Exercicio3lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num;
		double por;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira um número qualquer: ");
		num = leia.nextFloat();
		
		por = (num*1.1);
		System.out.printf("Esse número reajustado =  %.2f",por);
		
	}

}
