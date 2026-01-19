package Dominio;

public class InformacoesDoCarro {
	
	public int anoCarro;
	public String placaCarro;
	
	
	
	
	
	
	
	
	
	public InformacoesDoCarro() {
		
	}









	@Override
	public String toString() {
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Ano Do carro -> ").append(this.getAnoCarro()).append("\n");
		sb.append("Placa do Carro -> ").append(this.getPlacaCarro()).append("\n");
		
		
		return sb.toString();
	}



	public int getAnoCarro() {return anoCarro;}


	public void setAnoCarro(int anoCarro) {this.anoCarro = anoCarro;}


	public String getPlacaCarro() {return placaCarro;}


	public void setPlacaCarro(String placaCarro) {this.placaCarro = placaCarro;}
	
	
	
	
	
	
	
	

}
