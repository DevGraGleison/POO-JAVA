package Dominio;

public class SMS extends Notificação {
	
	
	

	

	public SMS(String nome) {
		super(nome);
	}

	@Override
	public void definirDestinatario(String email) {
		
		super.definirDestinatario(email);
	}

	@Override
	public void enviar() {
		
		System.out.println("Enviando para: " + getDestinatario());
		
		
		
		
	}

	@Override
	public String toString() {
	
		StringBuilder sb = new StringBuilder();
		
		
		sb.append("SMS | PARA : Numero : (85)9 97965341 " );
		sb.append("Você foi selecionada para o plano de 30 GB por mês da Tim por apenas 49,99 por mês :)"); 
			
		
		return sb.toString();
		
		
		
	}

	
	
	

}
