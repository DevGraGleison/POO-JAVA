package Dominio;

public class Pai extends Genealogia {

	public Pai() {
		super();
		
	}
	
	
	public void exibirInfoPai() {
        System.out.println("\n--- COLETANDO DADOS DO PAI ---");
        
        // Chamando os métodos herdados de Genealogia
        this.setNome(lerTexto("NOME COMPLETO DO PAI?"));
        this.setAnoNascimento(lerInteiro("ANO DE NASCIMENTO?"));
        this.setNacionalidade(lerTexto("NACIONALIDADE?"));
        this.setAnoCasamento(lerInteiro("ANO DE CASAMENTO?"));
        this.setFilhos(lerInteiro("QUANTOS FILHOS?"));
        this.setAnoFalecimento(lerInteiro("ANO DE FALECIMENTO? (0 SE VIVO)"));
        
        if(this.getAnoFalecimento() == 0) {
        	
        	System.out.println("O PAI AINDA É VIVO!");
        	
        }

        System.out.println("\n=== CADASTRO DO PAI CONCLUÍDO ===");
        imprimirResumo(); // Se o imprimirResumo estiver na Genealogia, funciona aqui também!
    }
	

}
