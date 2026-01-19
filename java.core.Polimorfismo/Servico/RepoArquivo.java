package Servico;

import java.util.ArrayList;
import java.util.List;
import Dominio.Arquivo;
public class RepoArquivo {

	
	private List<Arquivo> lista = new ArrayList<>();

    public void salvar(Arquivo arq) {
        lista.add(arq);
        System.out.println("Arquivo " + arq.getClass().getSimpleName() + " salvo no repositório.");
    }

    public void listarArquivos() {
        for (Arquivo a : lista) {
            a.abrir(); // Polimorfismo puro
        }
    }

}
