package Dominio;

public class Mãe extends Genealogia {
	
	public Mãe() {
        super();
    }

    public void exibirInfoMãe() {
        System.out.println("\n--- COLETANDO DADOS DA MÃE ---");
        
        this.setNome(lerTexto("QUAL O NOME COMPLETO DA SUA MÃE?"));
        this.setAnoNascimento(lerInteiro("ANO DE NASCIMENTO DA MÃE?"));
        this.setNacionalidade(lerTexto("NACIONALIDADE DA MÃE?"));
        this.setFilhos(lerInteiro("QUANTOS FILHOS ELA TEVE?"));
        this.setAnoFalecimento(lerInteiro("ANO DE FALECIMENTO? (DIGITE 0 SE VIVA)"));

        if (this.getAnoFalecimento() == 0) {
            System.out.println("A MÃE AINDA É VIVA!");
        }

        System.out.println("\n=== CADASTRO DA MÃE CONCLUÍDO ===");
        imprimirResumo();
        
        
    }
    
    
    
    
    
    }


