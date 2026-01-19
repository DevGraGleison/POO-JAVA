package Test;

import Servico.RepositorioArquivo;
import Servico.RepositorioBancoDeDados;
import Servico.RepositorioMemoria;
import Repositorio.Repositorio;
public class RepositorioTest02 {

	public static void main(String[]args) {
		
		Repositorio repo1 = new RepositorioMemoria();
		repo1.salvar(); 
		System.out.println("");
		
		Repositorio repo2 = new RepositorioArquivo();
		repo2.salvar();
		System.out.println("");
		
		Repositorio repo3 = new RepositorioBancoDeDados();
		repo3.salvar();
		System.out.println("");
		
		
		
		
		
		
	}
	
	
}
