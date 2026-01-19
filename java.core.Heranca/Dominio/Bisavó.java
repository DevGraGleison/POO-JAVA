package Dominio;


import java.util.InputMismatchException;


public class Bisavó extends Genealogia{
	
	

	public Bisavó() {
		super();
	
	}
	
	
	// --- MÉTODO PRINCIPAL (FLUXO DE DADOS) ---
    public void exibirInfoBisavó() {
        // Cada linha abaixo substitui um bloco "while" inteiro que você tinha
        this.setAnoNascimento(lerInteiro("EM QUE ANO SUA BISAVÓ NASCEU?\nEXEMPLO: 1885, 1900 ETC.."));
        
        this.setNome(lerTexto("NOME COMPLETO DA SUA BISAVÓ?\nEXEMPLO: NOME / SOBRENOME"));
        
        this.setNacionalidade(lerTexto("NACIONALIDADE DO SEU BISAVÓ?"));
        
        this.setAnoCasamento(lerInteiro("ANO DE CASAMENTO?"));
        
        this.setFilhos(lerInteiro("QUANTOS FILHOS?"));
        
        this.setAnoFalecimento(lerInteiro("O ANO EM QUE FALECEU?"));

        // Finalização
        System.out.println("\n=== RESUMO FINAL REGISTRADO ===");
        imprimirResumo();
        exibirIdadeDescendentes();
    }

    

    
	
	
	

	
	
	
}
