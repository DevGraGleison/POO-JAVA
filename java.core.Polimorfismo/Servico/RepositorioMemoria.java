package Servico;

import Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando  na Memoria");
		
	}
	
}

