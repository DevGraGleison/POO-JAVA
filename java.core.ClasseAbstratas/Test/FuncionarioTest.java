package Test;

import Dominio.Funcionario;
import Dominio.Gerente;
import Dominio.Desenvolvedor;



public class FuncionarioTest {

	public static void main(String[] args) {
		

		
		Gerente g = new Gerente("Gleison",7000);
		g.imprime();
		System.out.println(g);
		
		System.out.println("|>|>|>|>|>|>|>|>|>|>|>|>|>|>|>||>|>|>");
		
		Desenvolvedor d = new Desenvolvedor("Ribeiro",5000);
		d.imprime();
		System.out.println(d);

		
		
		
		
	}
	
	
	

}
