package Servico;

import Dominio.Computador;
import Dominio.Produto;
import Dominio.Taxavel;
import Dominio.Tomate;

public class CalculadoraImposto {
	
	
	
	
	public static void calcularImposto(Produto produto) {
		
		System.out.println("RELATORIO DE IMPOSTO");
		double imposto = produto.calcularImposto();
		System.out.println("PRODUTO : " + produto.getNome());
		System.out.println("VALOR: " + produto.getValor());
		System.out.println("IMPOSTO: " + imposto);
		
		if(produto instanceof Tomate) {
			
			Tomate tomate = (Tomate) produto;
			
			System.out.println(tomate.getDataValidade());
			
			
		}
		
	}
	
	
	
}
