package PacoteJava;

import java.util.Scanner;

public class Exercicio2_25mar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner leianum = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		a = leianum.nextInt();
		System.out.println("Entre com outro n�mero");
		b = leianum.nextInt();
		System.out.println("Entre com mais um n�mero");
		c = leianum.nextInt();
		
		if (a<=b && b<=c)
		{
			System.out.println("A ordem �:"+a+"-"+b+"-"+c);
		}
		else if (b<=c && c<=a)
		{
			System.out.println("A ordem �:"+b+"-"+c+"-"+a);
		}
		else if (c<=b && b<=a)
		{
			System.out.println("A ordem �:"+c+"-"+b+"-"+a);
		}
		else if (b<=a && a<=c)
		{
			System.out.println("A ordem �:"+b+"-"+a+"-"+c);
		}
		else if (c<=a && a<=b)
		{
			System.out.println("A ordem �:"+c+"-"+a+"-"+b);
		}
		else
		{
			System.out.println("A ordem �:"+a+"-"+c+"-"+b);
		}
	}

}
