package Test;

import Dominio.Computador;
import Dominio.Tomate;
import Servico.CalculadoraImposto;
import Dominio.Produto;

public class ProdutoTest03 {

	public static void main(String[] args) {
	
		

		Produto produto = new Computador("RYZEN-07", 1250);
		
		Tomate tomate = new Tomate("POMODOR", 10);
				tomate.setDataValidade("Validade : 25/01/2026");
		
		CalculadoraImposto.calcularImposto(produto);
		System.out.println("");
		CalculadoraImposto.calcularImposto(tomate);
		

	}

}
