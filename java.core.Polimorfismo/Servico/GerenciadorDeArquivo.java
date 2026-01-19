package Servico;

import Dominio.Arquivo;
import Dominio.Editavel;     // Import necessário
import Dominio.Compactavel;  // Import necessário

public class GerenciadorDeArquivo {
	
    public static void gerenciar(Arquivo arquivo) {
		
        if (arquivo == null) {
            System.out.println("Erro: O arquivo não pode ser nulo.");
            return;
        } // A chave do IF fecha aqui!

        // 2. Comportamento Comum
        System.out.print("[Processando] ");
        arquivo.abrir();
        
        // 3. Comportamentos Específicos
        if (arquivo instanceof Editavel) {
            ((Editavel) arquivo).editar();
        }
        
        if (arquivo instanceof Compactavel) {
            ((Compactavel) arquivo).compactar();
        }
        
        System.out.println("Gerenciamento concluído.\n");
    } // A chave do MÉTODO fecha aqui!
}