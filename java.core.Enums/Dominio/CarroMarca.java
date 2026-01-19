package Dominio;

public enum CarroMarca {
	
	
	
	    MARCA_A1(1,"MARCA <-> (FIAT): "),
	    MARCA_A2(2,"MARCA <-> (FIAT): "),
	    
	   
	    MARCA_B1(3,"MARCA <-> (VOLKSWAGEN): "),
	    MARCA_B2(4,"MARCA <-> (VOLKSWAGEN): "),
	    MARCA_B3(5,"MARCA <-> (VOLKSWAGEN): "),
	    
	 
	    MARCA_C1(6,"MARCA <-> (FORD): "),
	    MARCA_C2(7,"MARCA <-> (FORD): "),
	    
	  
	    MARCA_D1(8,"MARCA <-> (NISSAN)"),
	    MARCA_D2(9,"MARCA <-> (NISSAN)"),
	    MARCA_D3(10,"MARCA <-> (NISSAN)"),
	    MARCA_D4(11,"MARCA <-> (NISSAN)"),
	    MARCA_D5(12,"MARCA <-> (NISSAN)"),
	    
	  
	    MARCA_E1(13,"MARCA <-> (HONDA) "),
	    MARCA_E2(14,"MARCA <-> (HONDA) " ),
	    MARCA_E3(15,"MARCA <-> (HONDA) "),
	    MARCA_E4(16,"MARCA <-> (HONDA) ");

	    private final String marca;
	    private final int id;
	 

	    private CarroMarca(int id, String marca) {
	        
	        this.id = id;
	        this.marca = marca;
	       
	    }
	    
	  

	    public int getId() {return id;	}

		public String getMarca() { return marca; }


		
		
		// MÉTODO ESTÁTICO: O "Cérebro" que substitui o Switch Case
	    public static CarroMarca buscarPorId(int idDigitado) {
	        for (CarroMarca m : values()) {
	            if (m.id == idDigitado) {
	                return m;
	            }
	        }
	        return null; // Retorna null se o número não existir
	    }
		

		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			sb.append(this.getMarca()).append("\n");
		
			return sb.toString();
		}
	    
	    
	    
	    
	    
	    
	    
	    
	}
