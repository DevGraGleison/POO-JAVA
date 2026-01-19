package Dominio;

public class ArquivoTexto implements Arquivo, Editavel {

    private String descricao;
    private double version;
    private String formate;

    public ArquivoTexto(String descricao, double version, String formate) {
        this.descricao = descricao;
        this.version = version;
        this.formate = formate;
    }

   
    @Override
    public void editar() {
        System.out.println("EDITANDO ARQUIVO DE TEXTO: " + this.descricao + " (" + this.formate + ")");
    }

   
    @Override
    public void editar(String mensagem) {
        System.out.println("EDITANDO " + this.descricao + " COM A MENSAGEM: " + mensagem);
    }

    @Override
    public void abrir() {
        System.out.println("ABRINDO... ARQUIVO TEXTO: " + this.descricao);
    }
}