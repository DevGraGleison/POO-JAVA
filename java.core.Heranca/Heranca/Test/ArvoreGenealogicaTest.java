package Heranca.Test;

import java.util.Scanner;


import Dominio.Bisavô;
import Dominio.Bisavó;
import Dominio.Avô;
import Dominio.Avó;
import Dominio.Pai;
import Dominio.Mãe;
import Dominio.Netos;

public class ArvoreGenealogicaTest {
	
	
	public static void main (String []args) {
		
		
		
		
		Scanner entrada = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n======= MENU SYS YOUR GENEALOGY =======");
            System.out.println("1 - Cadastrar Bisavô/Bisavó");
            System.out.println("2 - Cadastrar Avô/Avó");
            System.out.println("3 - Cadastrar Pai/Mãe");
            System.out.println("4 - Cadastrar Netos");
            System.out.println("0 - Sair do Sistema");
            System.out.print("ESCOLHA UMA OPÇÃO: ");

            try {
                opcao = Integer.parseInt(entrada.nextLine());

                switch (opcao) {
                    case 1 -> {
                        Bisavô b = new Bisavô();
                        b.infoGenealogia();
                        b.exibirInfoBisavô();
                    }
                    case 2 -> {
                        Avô a = new Avô();
                        a.infoGenealogia();
                        a.exibirInfoAvô();
                    }
                    case 3 -> {
                        Pai p = new Pai();
                        p.infoGenealogia();
                        p.exibirInfoPai();
                    }
                    case 4 -> {
                        Netos n = new Netos();
                        n.exibirInfoNetos();
                    }
                    case 0 -> System.out.println("Encerrando o sistema... Até breve!");
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Digite apenas o número da opção!");
            }
        }
        
        entrada.close();
        
        
     
		
        
        
    }
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}


