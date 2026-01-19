package Test;

import Dominio.Computador;
import Dominio.Televisao;
import Dominio.Tomate;
import Servico.CalculadoraImposto;

public class ProdutoTest01 {

	public static void main(String[] args) {

		
		Computador c = new Computador("RYZEN-07", 1250);
		
		Tomate t = new Tomate("POMODOR", 10);
		
		Televisao v = new Televisao("SAMSUNG TV-40 POLEGADAS", 2000);
		
		CalculadoraImposto.calcularImposto(t);
		System.out.println("");
		CalculadoraImposto.calcularImposto(c);
		System.out.println("");
		CalculadoraImposto.calcularImposto(v);
		
	}

}
