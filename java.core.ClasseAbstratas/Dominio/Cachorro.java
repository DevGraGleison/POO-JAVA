package Dominio;

public class Cachorro extends Animal{

	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void fazerSom() {
		System.out.println("Au Au");
		
	}

	
	
	
	@Override
	public void ação() {
		System.out.println("O cachorro está correndo pela casa! ");
	}



	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Animal : ").append(this.getNome());
		
		return sb.toString();
	}
	
	
	
	
	
	

}
