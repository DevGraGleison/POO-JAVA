package Dominio;

import java.time.Year;

public class Netos extends Genealogia{

	public Netos() {
		super();
		
	}
	
	
	public void exibirInfoNetos() {
        System.out.println("\n--- 🧒 COLETANDO DADOS DO NETO(A) ---");

        this.setNome(lerTexto("QUAL O NOME COMPLETO?"));
        this.setAnoNascimento(lerInteiro("ANO DE NASCIMENTO?"));
        
        // INTERATIVIDADE 1: Cálculo de idade em tempo real
        int anoAtual = Year.now().getValue();
        int idadeCalculada = anoAtual - this.getAnoNascimento();

        this.setNacionalidade(lerTexto("QUAL A NACIONALIDADE?"));

        // INTERATIVIDADE 2: Perguntas baseadas na idade
        if (idadeCalculada < 16) {
            System.out.println("SISTEMA: Identificamos que " + this.getNome() + " é menor de idade (" + idadeCalculada + " anos).");
            this.setAnoCasamento(0);
            this.setFilhos(0);
        } else {
            this.setAnoCasamento(lerInteiro("ANO DE CASAMENTO? (DIGITE 0 SE AINDA NÃO CASOU)"));
            this.setFilhos(lerInteiro("QUANTOS FILHOS?"));
        }

        this.setAnoFalecimento(lerInteiro("ANO DE FALECIMENTO? (0 SE VIVO)"));

        // INTERATIVIDADE 3: Reações personalizadas no console
        System.out.println("\n--- PROCESSANDO DADOS ---");
        if (this.getAnoFalecimento() == 0) {
            System.out.println("✅ " + this.getNome() + " faz parte da geração atual da família!");
        } else {
            System.out.println("⚰️ Registro de memória: " + this.getNome());
        }

        if (this.getFilhos() > 0) {
            System.out.println("👨‍👩‍👧‍👦 " + this.getNome() + " já iniciou uma nova ramificação na árvore com " + this.getFilhos() + " filho(s).");
        }

        System.out.println("\n=== CADASTRO CONCLUÍDO ===");
        imprimirResumo();
    }

}
