package PacoteJava;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Jeruza");
		f1.setIdade(30);
		f1.setSetor("Equipe de Devesenvolvimento");
		
		f1.imprimirInfo();
		 
		System.out.println("Funcionário do mês\n"+f1.getNome());
		

	}

}
