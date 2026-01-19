package Dominio;

import Dominio.Taxavel;

public abstract  class  Produto implements Taxavel {
	
	
	
	protected String nome;
	protected double valor;
	
	
	

	
	
	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	
	
	
	
	public double getValor() {return valor;}

	public String getNome() {return nome;}

	
	
}
