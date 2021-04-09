package PacoteJava;

import java.util.Scanner;

public class Exercicio2lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,suc,ant;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro: ");
		num = leia.nextInt();
		
		suc = num+1;
		ant = num-1;
		
		System.out.println("O antecessor do número é: "+ant);
		System.out.println("O sucessor do número é: "+suc);
		
	}

}
