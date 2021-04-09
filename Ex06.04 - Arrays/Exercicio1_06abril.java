package PacoteJava;

public class Exercicio1_06abril {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma,i;
		int A[] = {1,0,5,-2,-5,7};
		
		soma = A[0] + A[1] + A[5];
		
		System.out.println("A soma nas posições 0, 1 e 5 é: "+soma);
		
			A[4] = 100;
		
		System.out.println("Matriz A:");
		
				for(i=0;i<6;i++) {
				System.out.println("\n"+A[i]);
		}
		
	}

}
