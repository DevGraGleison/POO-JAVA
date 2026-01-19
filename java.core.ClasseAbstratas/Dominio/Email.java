package Dominio;

public class Email extends Notificação{
	
	
	
	
	
	
	
	
	

	public Email(String nome) {
		super(nome);
	}

	@Override
	public void definirDestinatario(String email) {
		// TODO Auto-generated method stub
		super.definirDestinatario(email);
	}

	@Override
	public void enviar() {
		System.out.println("Enviando para: " + getDestinatario());
		
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Email Para : -|-  Assunto : " ).append("Hoje temos Reunião as 7 horas!");
	
		
		
		
		return sb.toString();
		
	}

	
	
	
	
	
	
	

}
