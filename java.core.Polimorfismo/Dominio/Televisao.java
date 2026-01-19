package Dominio;

public class Televisao extends Produto {
	
	
	
	public static final double IMPOSTO_POR_CENTO = 0.15;
	

	public Televisao(String nome, double valor) {
		super(nome, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularImposto() {
	
		System.out.println("CALCULANDO O IMPOSTO DA TELEVISÃO");
		
		return this.valor * IMPOSTO_POR_CENTO;
	}

}
