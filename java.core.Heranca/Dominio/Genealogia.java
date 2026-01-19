package Dominio;


import java.util.Scanner;
import java.util.InputMismatchException;

public class Genealogia  {
	

	
	private String nome;
	private int idade;
	private int anoNascimento;
	private String nacionalidade;
	private String origemAntepassado;
	private int anoCasamento;
	private int anoFalecimento;
	private int filhos;
	private Origem origem;
	
	
	
	
	// CORREÇÃO: O Scanner deve ficar aqui fora para ser herdado!
    protected Scanner sc = new Scanner(System.in);

    public void infoGenealogia() {
        System.out.println("Bem-vindo(a) AO SYS Your Genealogy!");
        System.out.println("PRECISAMOS DOS SEGUINTES DADOS --->");
        System.out.println("NOME / NASCIMENTO / NACIONALIDADE / CASAMENTO / FILHOS / OBITO\n");

        // Loop para Origem
        while (true) {
            try {
                System.out.println("<-> ME INFORME A ORIGEM DO SOBRENOME <->");
                System.out.println("(1)ITALIANA | (2)PORTUGUESA | (3)BRASILEIRA | (4)INDIGENA");
                System.out.println("(5)VENEZUELANO | (6)ARGENTINO | (7)BOLIVIANO | (8)ALEMÃ");
                
                String opcao = sc.nextLine();

                switch (opcao) {
                    case "1" -> { this.origemAntepassado = "ITALIANA"; this.origem = Origem.ITALIANA; }
                    case "2" -> { this.origemAntepassado = "PORTUGUESA"; this.origem = Origem.PORTUGUESA; }
                    case "3" -> { this.origemAntepassado = "BRASILEIRA"; this.origem = Origem.BRASILEIRA; }
                    case "4" -> { this.origemAntepassado = "INDIGENA"; this.origem = Origem.INDIGENA; }
                    case "5" -> { this.origemAntepassado = "VENEZUELANO"; this.origem = Origem.VENEZUELANO; }
                    case "6" -> { this.origemAntepassado = "ARGENTINA"; this.origem = Origem.ARGENTINA; }
                    case "7" -> { this.origemAntepassado = "BOLIVIANA"; this.origem = Origem.BOLIVIANA; }
                    case "8" -> { this.origemAntepassado = "ALEMÃ"; this.origem = Origem.ALEMÃ; }
                    default -> throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERRO!! DIGITE APENAS O NÚMERO DE 1 A 8.");
            }
        }

        // Loop para Sobrenome
        while (true) {
            System.out.println("\nAGORA QUE A ORIGEM FOI DEFINIDA (" + this.origemAntepassado + ")");
            System.out.print("SUGESTÕES: ");
            
            switch (this.origem) {
                case ITALIANA -> System.out.println("ROSSI, FERRARI, BIANCHI");
                case PORTUGUESA -> System.out.println("SILVA, SANTOS, FERREIRA");
                case BRASILEIRA -> System.out.println("OLIVEIRA, SOUZA, PEREIRA");
                // ... adicione os outros cases conforme necessário
                default -> System.out.println("Consulte o banco de dados local.");
            }

            System.out.println("QUAL O SOBRENOME?");
            String sobrenome = sc.nextLine();
            if (!sobrenome.trim().isEmpty()) {
                this.nome = sobrenome.toUpperCase();
                break;
            }
        }
    }

    
    protected int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                int valor = sc.nextInt();
                sc.nextLine(); // Limpa o buffer
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("-----> ERRO! DIGITE APENAS NÚMEROS! <-------");
                sc.nextLine(); // Limpa o buffer do erro
            }
        }
    }

    /**
     * Centraliza a validação de nomes e nacionalidades (apenas letras)
     */
    protected String lerTexto(String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String entrada = sc.nextLine().trim();

            if (entrada.isEmpty()) {
                System.out.println("-----> ERRO! O CAMPO NÃO PODE SER VAZIO! <-------");
                continue;
            }

            if (entrada.matches("[\\p{L} ]+")) {
                return entrada;
            } else {
                System.out.println("-----> ERRO! USE APENAS LETRAS E ESPAÇOS! <-------");
            }
        }
    }
    
    
    
 
    
    public void imprimirResumo() {
        System.out.println("-------------------------");
        System.out.println("NOME         : " + (this.getNome() != null ? this.getNome().toUpperCase() : "N/D"));
        System.out.println("NASCIMENTO   : " + this.getAnoNascimento());
        System.out.println("NACIONALIDADE: " + (this.getNacionalidade() != null ? this.getNacionalidade().toUpperCase() : "N/D"));
        System.out.println("CASAMENTO    : " + this.getAnoCasamento());
        System.out.println("FILHOS       : " + this.getFilhos());
        System.out.println("FALECIMENTO  : " + this.getAnoFalecimento());
        System.out.println("-------------------------");
    }
    
    
 // Na classe Genealogia.java
    public void exibirIdadeDescendentes() {
        if (this.getAnoFalecimento() == 0 || this.getAnoNascimento() == 0) {
            System.out.println("REGISTRO: " + this.getNome().toUpperCase() + " ESTÁ VIVO(A)!");
        } else {
            int idade = this.getAnoFalecimento() - this.getAnoNascimento();
            System.out.println("REGISTRO: " + this.getNome().toUpperCase() + " FALECEU COM " + idade + " ANOS.");
        }
    }

    
    
    
    // Getters e Setters (Mantenha os que você já tem abaixo...)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getAnoNascimento() { return anoNascimento; }
    public void setAnoNascimento(int anoNascimento) { this.anoNascimento = anoNascimento; }
    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }
    public int getAnoCasamento() { return anoCasamento; }
    public void setAnoCasamento(int anoCasamento) { this.anoCasamento = anoCasamento; }
    public int getAnoFalecimento() { return anoFalecimento; }
    public void setAnoFalecimento(int anoFalecimento) { this.anoFalecimento = anoFalecimento; }
    public int getFilhos() { return filhos; }
    public void setFilhos(int filhos) { this.filhos = filhos; }
    public void setIdade(int idade) { this.idade = idade; }
	
	
	

}
