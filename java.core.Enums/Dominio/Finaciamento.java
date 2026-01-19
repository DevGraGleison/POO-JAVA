package Dominio;

public enum Finaciamento {
	
	
	ENTRADA (8000);
	
	
	
	
	
	
	
	
	private final int valor; 
	
	
	

	private Finaciamento(int valor) {
		
		this.valor = valor;
	}







	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		
		sb.append("Entrada: -->").append("\n");
		
		
		return sb.toString();
	}


	public int getValor() {return valor;}






	

	
	
	
	
	
	
	

}
