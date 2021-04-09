package PacoteJava;

import java.util.Scanner;

public class Exercicio4_25mar {

	public static void main(String[] args) {
		int numero;
		double raizq, pot;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		numero = leia.nextInt();
		
		if ((numero%2)!= 0)
		{
			pot = Math.pow(numero,2);
			System.out.printf("Numero impar, elevado a segunda potencia: ",pot);
		}
		else
		{			
			raizq = Math.sqrt(numero);
			System.out.printf("Numero par, a raiz quadrada é: %2.2f",raizq);
		}		
	}

}
