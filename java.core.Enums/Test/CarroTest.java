package Test;

import Dominio.CarroMarca;
import Dominio.CarroModelo;
import Dominio.InformacoesDoCliente;
import Dominio.InformacoesDoCarro;
import Dominio.Finaciamento;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CarroTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuarSistema = true;

        System.out.println("Bem vindo ao Sistema de vendas da Loja Car-Dreamers!");
        
        while (continuarSistema) { // LOOP PRINCIPAL PARA NOVOS CADASTROS
            System.out.println("\n-- NOVO CADASTRO --");
            
            // OBJETOS E VARIÁVEIS DE ESCOPO
            InformacoesDoCliente cliente = new InformacoesDoCliente();
            InformacoesDoCarro carro = new InformacoesDoCarro();
            CarroMarca selecionado = null;
            CarroModelo mod = null;
            String corNome = "";
            int entrada = 0;

            // 1. CADASTRO DO CLIENTE
            while (true) {
                System.out.println("Qual o nome do Cliente?");
                String nome = sc.nextLine().toUpperCase();
                cliente.setNome(nome);
                if (nome != null && !nome.trim().isEmpty()) break;
                System.out.println("Erro! Digite um nome valido");
            }

            // 2. CADASTRO DO DOCUMENTO
            while (true) {
                System.out.println("Qual o documento do Cliente (RG-CPF)?");
                String doc = sc.nextLine().toUpperCase();
                cliente.setIdentidade(doc);
                if (doc != null && !doc.trim().isEmpty()) break;
                System.out.println("Erro! Digite um documento valido");
            }

            // 3. ENTRADA FINANCEIRA
            while (true) {
                try {
                    System.out.println("Entrada mínima: R$ " + Finaciamento.ENTRADA.getValor());
                    System.out.print("Digite o valor da entrada -> ");
                    entrada = sc.nextInt();
                    sc.nextLine(); 
                    if (entrada >= Finaciamento.ENTRADA.getValor()) {
                        System.out.println("Entrada aprovada!");
                        break;
                    }
                    System.out.println("Sinto muito, valor insuficiente.");
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Digite apenas números.");
                    sc.nextLine();
                }
            }

            // 4. ANO E PLACA
            while (true) {
                try {
                    System.out.println("Digite o ano do carro:");
                    carro.setAnoCarro(sc.nextInt());
                    sc.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ação Invalida! Digite apenas numeros");
                    sc.nextLine();
                }
            }

            while (true) {
                System.out.println("Placa do carro? (Ex: AAA-1234)");
                String placa = sc.nextLine().toUpperCase();
                if (placa.matches("[A-Z]{3}-\\d{4}")) {
                    carro.setPlacaCarro(placa);
                    break;
                }
                System.out.println("Erro! Formato inválido.");
            }

            // 5. MARCA DO CARRO
            while (true) {
                try {
                    System.out.println("Marca (1-2 FIAT | 3-5 VW | 6-7 FORD | 8-12 NISSAN | 13-16 HONDA)");
                    int idMarca = sc.nextInt();
                    sc.nextLine();
                    selecionado = CarroMarca.buscarPorId(idMarca);
                    if (selecionado != null) {
                        System.out.println("Selecionado: " + selecionado.getMarca());
                        break;
                    }
                    System.out.println("MARCA INEXISTENTE!");
                } catch (InputMismatchException e) {
                    System.out.println("Erro! Digite apenas números.");
                    sc.nextLine();
                }
            }

            // 6. COR DO CARRO
            while (true) {
                try {
                    System.out.println("Cor? (1)VERDE | (2)PRETO | (3)AZUL | (4)CINZA | (5)BRANCO");
                    int cor = sc.nextInt();
                    sc.nextLine();
                    if (cor >= 1 && cor <= 5) {
                        corNome = switch (cor) {
                            case 1 -> "VERDE";
                            case 2 -> "PRETO";
                            case 3 -> "AZUL";
                            case 4 -> "CINZA";
                            case 5 -> "BRANCO";
                            default -> "";
                        };
                        break;
                    }
                    System.out.println("COR INEXISTENTE!");
                } catch (InputMismatchException e) {
                    System.out.println("Erro! Digite apenas números.");
                    sc.nextLine();
                }
            }

            // 7. MODELO DO CARRO
            while (true) {
                try {
                    System.out.println("Modelo? (1-2 FIAT | 3-5 VW | 6-7 FORD | 8-12 NISSAN | 13-16 HONDA)");
                    int idModelo = sc.nextInt();
                    sc.nextLine();
                    mod = CarroModelo.buscarPorId(idModelo);
                    if (mod != null) {
                        System.out.println("Selecionado: " + mod.getModelo());
                        break;
                    }
                    System.out.println("MODELO INEXISTENTE!");
                } catch (InputMismatchException e) {
                    sc.nextLine();
                }
            }

            // 8. RESUMO DA VENDA ATUAL
            System.out.println("\n<-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|->");
            System.out.println("<-> RESUMO FINAL DA VENDA <->");
            System.out.println("CLIENTE      : " + cliente.getNome());
            System.out.println("DOCUMENTO    : " + cliente.getIdentidade());
            System.out.println("ENTRADA      : R$ " + entrada);
            System.out.println("ANO DO CARRO : " + carro.getAnoCarro());
            System.out.println("PLACA        : " + carro.getPlacaCarro());
            System.out.println("MARCA        : " + selecionado.getMarca()); 
            System.out.println("MODELO       : " + mod.getModelo());
            System.out.println("COR          : " + corNome);
            System.out.println("VENDA REALIAZADA!!!!!");
            System.out.println("<-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|->\n");

            // 9. PERGUNTA SE QUER OUTRO CADASTRO
            while (true) {
                System.out.println("Deseja fazer outro cadastro? (S/N)");
                String resposta = sc.nextLine().trim().toLowerCase();
                if (resposta.equals("s") || resposta.equals("sim")) {
                    break; // Sai do loop da pergunta e continua o loop principal
                } else if (resposta.equals("n") || resposta.equals("nao") || resposta.equals("não")) {
                    continuarSistema = false; // Para o loop principal
                    System.out.println("Encerrando sistema... Obrigado!");
                    break;
                } else {
                    System.out.println("Opção inválida! Digite (sim) ou (não).");
                }
            }
        }
        sc.close();
    }
}