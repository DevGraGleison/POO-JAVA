package Dominio;

public class InformacoesDoCliente {
	
	public String nome;
	public String identidade;
	


	public InformacoesDoCliente() {
		
		
	}








	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		
		sb.append("Nome: -> ").append(this.getNome()).append("\n");
		sb.append("Documento: -> ").append(this.getIdentidade()).append("\n");
		
		
		
		
		return sb.toString();
	}








	public String getNome() {return nome;}


	public void setNome(String nome) {this.nome = nome;}


	public String getIdentidade() {return identidade;}


	public void setIdentidade(String identidade) {this.identidade = identidade;}


	


	
	
	
	
	
	
	
	
	

}
