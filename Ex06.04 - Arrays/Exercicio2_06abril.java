package PacoteJava;

import java.util.Scanner;

public class Exercicio2_06abril {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int somap=0,qtdi=0,i;
		int []vetor = new int[6];
		String imp = "Os n�meros impares foram: ",par = "Os n�meros pares foram: ";
		Scanner leia = new Scanner(System.in);
		
		for(i=0;i<6;i++) {
			System.out.println("Insira um n�mero inteiro: ");
			vetor[i]= leia.nextInt();
			
				if(vetor[i]%2==0) {
					par = par + vetor[i] + " ";
					somap = somap + vetor[i];
				}
					else {
						imp = imp + vetor[i] + " ";
						qtdi++;
					}
		}
		System.out.println(par);
		System.out.println("A soma dos n�meros pares �: "+somap);
		System.out.println(imp);
		System.out.println("A quantidade de n�meros impares �: "+qtdi);
		
	}

}
