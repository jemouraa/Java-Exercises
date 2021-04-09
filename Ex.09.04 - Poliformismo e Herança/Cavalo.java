package pacotejava;

public class Cavalo extends Animal{
	
	public Cavalo(){
		super("Cavalo");
		
	}

	
	@Override
	public String som() {	
		return "Himm him him ";
	}
	
	@Override
	public String locomocao() {
		return "correr";
		
	}
}
	

