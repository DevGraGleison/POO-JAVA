package Dominio;

public class Avó extends Genealogia{

	public Avó() {
		super();
		
	}
	
	
	
	public void exibirInfoAvó() {
        System.out.println("\n--- COLETANDO DADOS DA AVÓ ---");
        
        // Chamando os métodos herdados de Genealogia
        this.setNome(lerTexto("NOME COMPLETO DA AVÓ?"));
        this.setAnoNascimento(lerInteiro("ANO DE NASCIMENTO?"));
        this.setNacionalidade(lerTexto("NACIONALIDADE?"));
        this.setAnoCasamento(lerInteiro("ANO DE CASAMENTO?"));
        this.setFilhos(lerInteiro("QUANTOS FILHOS?"));
        this.setAnoFalecimento(lerInteiro("ANO DE FALECIMENTO? (0 SE VIVO)"));
        
        if(this.getAnoFalecimento() == 0) {
        	
        	System.out.println("A AVÓ AINDA É VIVA!");
        	
        }

        System.out.println("\n=== CADASTRO DA AVÓ CONCLUÍDO ===");
        imprimirResumo(); // Se o imprimirResumo estiver na Genealogia, funciona aqui também!
    }
	

}
