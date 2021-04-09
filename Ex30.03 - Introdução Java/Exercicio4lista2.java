package PacoteJava;

import java.util.Scanner;

public class Exercicio4lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		num1 = leia.nextInt();
		System.out.println("Insira outro número: ");
		num2 = leia.nextInt();
		System.out.println("Insira mais um número: ");
		num3 = leia.nextInt();
		
		media = (num1+num2+num3)/3;
		
		System.out.println("A média é: "+media);
	}

}
