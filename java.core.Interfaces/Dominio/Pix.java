package Dominio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pix implements Pagamento {

	






	



	private String tipoP;

	
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void pagar (double valor) {
	    double taxaJuros = 0.01; // 1% de juros por parcela, por exemplo

	    while (true) {
	        try {
	            System.out.println("QUANTAS VEZES GOSTARIA DE PARCELAR NO PIX?");
	            System.out.println("PODE SER ATÉ EM 10(X) VEZES!");
	            System.out.print("DIGITE O NUMERO DE PARCELAS: ");

	            int p = sc.nextInt();
	            sc.nextLine(); 

	            if (p >= 1 && p <= 10) {
	                double valorFinal = valor;
	                
	                // Exemplo: Se parcelar acima de 3x, aplica juros
	                if (p > 5) {
	                    valorFinal = valor * Math.pow((1 + taxaJuros), p); // Juros Compostos
	                    // Ou juros simples: valorFinal = valor + (valor * taxaJuros * p);
	                    System.out.println("--- COMPRA COM JUROS APLICADA PARA PARCELAS ACIMA DE 5X ---");
	                }

	                double valorParcela = valorFinal / p;
	                
	                System.out.println("----------------------------------------------");
	                System.out.printf("VALOR TOTAL: R$%.2f%n", valorFinal);
	                System.out.printf("PARCELADO EM %dx de R$%.2f%n", p, valorParcela);
	                System.out.println("----------------------------------------------");
	                break; 
	            } else {
	                System.out.println("XXX ERROR XXX: O NÚMERO DE PARCELAS DEVE SER ENTRE 1 e 10.");
	            }

	        } catch (InputMismatchException e) {
	            System.out.println("XXX ERROR XXX: DIGITE APENAS NÚMEROS INTEIROS.");
	            sc.nextLine(); 
	        }
	    }
	}
	
	
	@Override
	public void opçõesPagamento() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("TIPO DE PAGAMENTO: ->  Pix").append(this.getTIPOP());
		
		
		return sb.toString();
	}

	

	public String getTIPOP() {
		return tipoP;
	}

	
	
	

}
