package Dominio;

public class FileLoader implements DateLoader,DateRemover {

	@Override
	public void load() {
		System.out.println("Carregando dados de um arquivo");
		
	}

	@Override
	public void remove() {
	System.out.println("Deletando dados de um arquivo");
		
	}
	
	@Override
	public void checkPermission() {
		System.out.println("Checando Permissões no arquivo");
	}
	
	
	

}
