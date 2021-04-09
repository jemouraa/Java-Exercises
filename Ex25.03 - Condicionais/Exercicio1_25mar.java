package PacoteJava;

import java.util.Scanner;

public class Exercicio1_25mar {

	public static void main(String[] args) {
		int a,b,c,maior;
		
		Scanner leianum = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		a = leianum.nextInt();
		System.out.println("Entre com outro número");
		b = leianum.nextInt();
		System.out.println("Entre com mais um número");
		c = leianum.nextInt();
		
		if (a>b && a>c)
		{
			maior = a;
		}
		else if (b>a && b>c)
		{
			maior = b;
		}
		else 
		{
			maior = c;
		}
		
		System.out.println("O maior número é: "+maior);
		
	}

}
