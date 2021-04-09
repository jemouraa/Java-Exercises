package PacoteJava;

import java.util.Scanner;

public class Exercicio2_25mar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner leianum = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		a = leianum.nextInt();
		System.out.println("Entre com outro número");
		b = leianum.nextInt();
		System.out.println("Entre com mais um número");
		c = leianum.nextInt();
		
		if (a<=b && b<=c)
		{
			System.out.println("A ordem é:"+a+"-"+b+"-"+c);
		}
		else if (b<=c && c<=a)
		{
			System.out.println("A ordem é:"+b+"-"+c+"-"+a);
		}
		else if (c<=b && b<=a)
		{
			System.out.println("A ordem é:"+c+"-"+b+"-"+a);
		}
		else if (b<=a && a<=c)
		{
			System.out.println("A ordem é:"+b+"-"+a+"-"+c);
		}
		else if (c<=a && a<=b)
		{
			System.out.println("A ordem é:"+c+"-"+a+"-"+b);
		}
		else
		{
			System.out.println("A ordem é:"+a+"-"+c+"-"+b);
		}
	}

}
