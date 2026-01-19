package Test;

import Dominio.Arquivo;
import Dominio.Editavel;
import Dominio.ArquivoTexto;
import Dominio.ArquivoVideo;
import Dominio.Compactavel;
import Servico.RepoArquivo;

public class GerenciarArquivoTest {

	public static void main(String[] args) {
	
		
		// 1. Instanciando o serviço (Ajustado para RepoArquivo)
        RepoArquivo repositorio = new RepoArquivo();

        // 2. Criando instâncias (Certifique-se que as classes têm construtores)
        Arquivo doc = new ArquivoTexto("Relatorio_Projeto", 1.5, ".docx");
        Arquivo video = new ArquivoVideo("Aula_Git_Comandos", 500.0, "1080p");

        // 3. Adicionando ao repositório
        repositorio.salvar(doc);
        repositorio.salvar(video);

        // 4. Listando
        System.out.println("--- Listando Arquivos ---");
        repositorio.listarArquivos();
        
        // 5. Correção do Cast:
        // O Java precisa que você trate 'doc' como Editavel para chamar o método
        if (doc instanceof Editavel) {
            ((Editavel) doc).editar("Novo conteúdo do relatório");
        }
    }
		
		
		
		
		
	}


