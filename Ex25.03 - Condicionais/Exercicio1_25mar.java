package PacoteJava;

import java.util.Scanner;

public class Exercicio1_25mar {

	public static void main(String[] args) {
		int a,b,c,maior;
		
		Scanner leianum = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		a = leianum.nextInt();
		System.out.println("Entre com outro n�mero");
		b = leianum.nextInt();
		System.out.println("Entre com mais um n�mero");
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
		
		System.out.println("O maior n�mero �: "+maior);
		
	}

}
