package Dominio;

public class Gato extends Animal{

	
	
	
	
	
	
	

	@Override
	public void fazerSom() {
	
		System.out.println("Miau! Miau!");
		
	}

	
	
	@Override
	public void ação() {
		System.out.println("O gato está em bricando com a cortina!");
		
	}






	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Animal : ").append(this.getNome());
		
		return sb.toString();
	}
	
	
	
	
	
	
	
	

}
