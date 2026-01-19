package Dominio;

public class DatabaseLoader implements DateLoader,DateRemover{

	@Override
	public void load() {
		System.out.println("Carregando dados no banco de dados");
		
	}

	@Override
	public void remove() {
		
		System.out.println("Removendo dados do banco de dados");
		
	}

	@Override
	public void checkPermission() {
		System.out.println("Checando Permissões no banco de dados");
	}

	
	
	
	
	

}

