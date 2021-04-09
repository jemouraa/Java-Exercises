package PacoteJava;

import java.util.Scanner;

public class Exercicio3_25mar {

	public static void main(String[] args) {
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		idade = leia.nextInt();
			
		if (idade>=10 && idade<=14)
		{
			System.out.print("Categoria Infantil");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.print("Categoria Juvenil");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.print("Categoria Adulto");
		}
		else
		{			
			System.out.print("Categoria Indisponível");
		}
	}

}
