package Test;

import  Dominio.Email;
import  Dominio.SMS;
import  Dominio.Notificação;


public class MensagemTest {

	public static void main(String[] args) {
	
		SMS s = new SMS ("Maria");
		s.definirDestinatario("Maria das Graças");
		s.enviar();
		System.out.println(s);
		
		System.out.println("|||||||||||||||||||||||||||||||||");
		
		Email e = new Email("Gleison");
		e.definirDestinatario("Gleison Ribeiro");
		e.enviar();
		System.out.println(e);

	}

}
