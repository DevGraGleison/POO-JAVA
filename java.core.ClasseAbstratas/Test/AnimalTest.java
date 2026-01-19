package Test;

import Dominio.Animal;
import Dominio.Cachorro;
import Dominio.Gato;

public class AnimalTest {

	public static void main(String[] args) {

		Cachorro c = new Cachorro();
		c.setNome("Cachorro");
		System.out.println(c);
		c.fazerSom();
		c.ação();

		System.out.println("-----------------");
		
		Gato g = new Gato();
		g.setNome("Gato");
		System.out.println(g);
		g.fazerSom();
		g.ação();

	}

}
