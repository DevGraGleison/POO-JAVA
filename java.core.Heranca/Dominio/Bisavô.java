package Dominio;


import java.util.InputMismatchException;

public class Bisavô extends Genealogia{
	
	
    public Bisavô() {
    }

    // --- MÉTODO PRINCIPAL (FLUXO DE DADOS) ---
    public void exibirInfoBisavô() {
        // Cada linha abaixo substitui um bloco "while" inteiro que você tinha
        this.setAnoNascimento(lerInteiro("EM QUE ANO SEU BISAVÔ NASCEU?\nEXEMPLO: 1885, 1900 ETC.."));
        
        this.setNome(lerTexto("NOME COMPLETO DO SEU BISAVÔ?\nEXEMPLO: NOME / SOBRENOME"));
        
        this.setNacionalidade(lerTexto("NACIONALIDADE DO SEU BISAVÔ?"));
        
        this.setAnoCasamento(lerInteiro("ANO DE CASAMENTO?"));
        
        this.setFilhos(lerInteiro("QUANTOS FILHOS?"));
        
        this.setAnoFalecimento(lerInteiro("O ANO EM QUE FALECEU?"));

        // Finalização
        System.out.println("\n=== RESUMO FINAL REGISTRADO ===");
        imprimirResumo();
        exibirIdadeDescendentes();
    }

    // --- MÉTODOS AUXILIARES (A MÁGICA DO DRY) ---

    /**
     * Centraliza a validação de números inteiros
     */
    
    // --- MÉTODOS DE EXIBIÇÃO ---

    

  


	
	

} // fim do programa
