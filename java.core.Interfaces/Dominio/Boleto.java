package Dominio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Boleto  implements Pagamento{
	
	
	
	



	private String tipoB;
	
	


	Scanner sc = new Scanner(System.in);
	
	@Override
	public void pagar (double valor) {
	    double taxaJuros = 0.03; // 3% de juros por parcela, por exemplo

	    while (true) {
	        try {
	            System.out.println("Quantas vezes gostaria de parcelar sua compra no Boleto?");
	            System.out.println("Pode ser até em 10(x) Vezes!");
	            System.out.print("Digite o numero de parcelas: ");

	            int p = sc.nextInt();
	            sc.nextLine(); 

	            if (p >= 1 && p <= 10) {
	                double valorFinal = valor;
	                
	                // Exemplo: Se parcelar acima de 3x, aplica juros
	                if (p > 4) {
	                    valorFinal = valor * Math.pow((1 + taxaJuros), p); // Juros Compostos
	                    // Ou juros simples: valorFinal = valor + (valor * taxaJuros * p);
	                    System.out.println("--- Compra com juros aplicada para parcelas acima de 3x ---");
	                }

	                double valorParcela = valorFinal / p;
	                
	                System.out.println("----------------------------------------------");
	                System.out.printf("Valor Total: R$%.2f%n", valorFinal);
	                System.out.printf("Parcelado em %dx de R$%.2f%n", p, valorParcela);
	                System.out.println("----------------------------------------------");
	                break; 
	            } else {
	                System.out.println("Erro: O número de parcelas deve ser entre 1 e 10.");
	            }

	        } catch (InputMismatchException e) {
	            System.out.println("Erro: Digite apenas números inteiros.");
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
		
		sb.append("Tipo Pagamento: ->  Boleto").append(this.getTIPOB());
		
		
		return sb.toString();
	}

	

	public String getTIPOB() {
		return tipoB;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
