package Dominio;

public class Avô extends Genealogia{

	public Avô() {
		super();
		

	}
	
	
	public void exibirInfoAvô() {
        System.out.println("\n--- COLETANDO DADOS DO AVÔ ---");
        
        // Chamando os métodos herdados de Genealogia
        this.setNome(lerTexto("NOME COMPLETO DO AVÔ?"));
        this.setAnoNascimento(lerInteiro("ANO DE NASCIMENTO?"));
        this.setNacionalidade(lerTexto("NACIONALIDADE?"));
        this.setAnoCasamento(lerInteiro("ANO DE CASAMENTO?"));
        this.setFilhos(lerInteiro("QUANTOS FILHOS?"));
        this.setAnoFalecimento(lerInteiro("ANO DE FALECIMENTO? (0 SE VIVO)"));
        
        if(this.getAnoFalecimento() == 0) {
        	
        	System.out.println("O AVÔ AINDA É VIVO!");
        	
        }

        System.out.println("\n=== CADASTRO DO AVÔ CONCLUÍDO ===");
        imprimirResumo(); // Se o imprimirResumo estiver na Genealogia, funciona aqui também!
    }
	
	
	
	
}
