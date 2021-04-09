package PacoteJava;

import java.util.Scanner;

public class Exercicio7lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float haula,qtdade,calc,inss;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira o valor da hora aula:  ");
		haula = leia.nextFloat();
		System.out.println("Insira a quantidade de aulas:  ");
		qtdade = leia.nextFloat();
		System.out.println("Insira a porcentagem do inss:  ");
		inss = leia.nextFloat();
		
		calc = (haula*qtdade)*((100-inss)/100);
		
		System.out.printf("O salário do professor será:  %.2f",calc);
		
	}

}
