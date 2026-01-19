package Test;

import Dominio.DatabaseLoader;
import Dominio.FileLoader;

public class DataLoaderTest01 {
	
	
	public static void main (String [] args) {
		
		
		
		DatabaseLoader D = new DatabaseLoader();
			D.load();
			D.remove();
			D.checkPermission();
		
			System.out.println("|>|>|>|>|>|>|>|>|>|>|>|>|>|>");
			
			FileLoader F = new FileLoader();
			F.load();
			F.remove();
			F.checkPermission();
		
	}

}
