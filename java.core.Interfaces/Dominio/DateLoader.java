package Dominio;

public interface DateLoader {
	
	
	
	
	
	public abstract void load(); // metodo abstract
	
	
	
	
	default void checkPermission(){
		
		System.out.println("Fazendo chegagem de Permissões");
	}
	
	
	
	
	

}


/* POR PADRÃO INTERFACES USAM METODOS ABSTRACTS
 * 
 * E NÃO HÁ NECESSIDADE DE COLOCAR O MODIFICADOR DE ACESSO public interface
 * JA QUE O JAVA INTENDE QUE TODA INTERFACE É UMA CLASSE ABSTRACT POR PADRAO
 * POIS PODERIA SER APENAS void load();
 * 
 */