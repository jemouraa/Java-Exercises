package PacoteJava;

import java.util.Scanner;

public class Exercicio5lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float saldo;
		double reaj;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira o saldo: ");
		saldo = leia.nextFloat();
		
		reaj = (saldo*1.01);
		System.out.printf("Esse número reajustado =  %.2f",reaj);
	}

}
