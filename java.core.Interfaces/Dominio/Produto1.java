package Dominio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;

public class Produto1 {

	private String nome;
	private Armazem armazem;
	private double preco;
	
	

    // Construtor para facilitar a criação dos itens na lista
    public Produto1(Armazem armazem, String nome, double preco) {
        this.armazem = armazem;
        this.nome = nome;
        this.preco = preco;
    }

    // Construtor vazio para o MarketPlaceTest conseguir instanciar
    public Produto1() {
    }

    public void mensagem() {
        Scanner sc = new Scanner(System.in);
        List<Produto1> cesta = new ArrayList<>(); // Lista de objetos Produto
        boolean continuar = true;

        System.out.println("BEM VINDO AO ARMAZÉM DE (A) AO (Z) !");

        while (continuar) {
            System.out.println("\n||| CATEGORIAS DISPONÍVEIS |||");
            System.out.println("(1)GRÃOS, (2)BEBIDAS, (3)MASSAS, (4)CARNES, (5)ROUPAS");
            System.out.println("(6)CALÇADOS, (7)FERRAMENTAS, (8)CONSTRUÇÃO, (9)LIMPEZA");

            try {
                // 1. Categoria (Armazem)
                System.out.print("\nDIGITE O ID DA CATEGORIA: ");
                int id = sc.nextInt();
                sc.nextLine(); 

                Armazem catEncontrada = Armazem.buscarPorId(id);
                if (catEncontrada == null) {
                    System.out.println("❌ ID NÃO ENCONTRADO! Tente novamente.");
                    continue;
                }

                // 2. Tipo (nome)
                System.out.print("DIGITE O TIPO (EX: ARROZ, ,FEIJÃO,\n"
                		+ "MARCARRÃO,PÃO, CARNE BOVINA, CAFÉ"
                		+ "TENIS, MARTELO , CIMENTO , DETERGENTE): ");
                String tipoNome = sc.nextLine().toUpperCase();

                // 3. Preço (preco)
                System.out.print("DIGITE O VALOR: R$ ");
                double valorDigitado = sc.nextDouble();
                sc.nextLine(); 

                // Guardamos no objeto Produto e adicionamos na cesta
                cesta.add(new Produto1(catEncontrada, tipoNome, valorDigitado));

                System.out.print("DESEJA ADICIONAR OUTRO ITEM? (S/N): ");
                if (sc.nextLine().equalsIgnoreCase("n")) {
                    continuar = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("XXX ERROR XXX: DIGITE VALORES VÁLIDOS!");
                sc.nextLine();
            }
        }

        // --- RESUMO FINAL DA CESTA ---
        double totalGeral = 0;
        System.out.println("\n--- RESUMO DA SUA CESTA ---");
        for (Produto1 p : cesta) {
            System.out.printf("CATEGORIA: %-12s | TIPO: %-10s | PREÇO: R$ %.2f%n", 
                              p.armazem, p.nome, p.preco);
            totalGeral += p.preco;
        }
        System.out.printf("\nTOTAL ACUMULADO: R$ %.2f%n", totalGeral);
        System.out.println("---------------------------");

        // --- ESCOLHA DO PAGAMENTO ---
        System.out.println("\nESCOLHA A FORMA DE PAGAMENTO:");
        System.out.println("[1] PIX | [2] CARTÃO | [3] BOLETO");
        System.out.print("OPÇÃO: ");
        int opcao = sc.nextInt();

        Pagamento formaPagamento;
        if (opcao == 1) {
            formaPagamento = new Pix();
        } else if (opcao == 2) {
            formaPagamento = new Cartao();
        } else {
            formaPagamento = new Boleto();
        }

        // Chamada polimórfica
        formaPagamento.pagar(totalGeral);
    }
	
	
	


}
