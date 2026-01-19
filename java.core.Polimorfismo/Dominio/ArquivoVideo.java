package Dominio;

public class ArquivoVideo implements Arquivo,Compactavel {
	

	
	private String nome;
    private double tamanho;
    private String qualidade;
	
	
    
	
	

	public ArquivoVideo(String nome, double tamanho, String qualidade) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
		this.qualidade = qualidade;
	}

	@Override
	public void compactar() {
	
		System.out.println("COMPACTANDO UM ARQUIVO DO TIPO VIDEO" + this.nome + "EM" +this.qualidade);
		
	}

	@Override
	public void abrir() {
	
		System.out.println("EXTRAINDO... ABRINDO ARQUIVO..." + this.tamanho + "MB");
		
	}
	
	

}
