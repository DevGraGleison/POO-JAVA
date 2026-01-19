package Dominio;

public enum CarroModelo {
	
	
	 MODELO_A1(1," MODELOS: -> Uno-Vivace 1.4 "),
	 MODELO_A2(2," MODELOS: ->  Siena- 1.8 "),
	 
	 
	 
	 MODELO_B1(3," MODELOS: ->  Gol-GT 1.8"),
	 MODELO_B2(4," MODELOS: ->  Gol 1.4 "),
	 MODELO_B3(5," MODELOS: ->  Gol-Voyage 1.9"),

	 MODELO_C1(6, "MODELOS PICAPES : ->  Ranger 2.0 "),
	 MODELO_C2(7,"MODELOS PICAPES : ->  Maverick 2.0"),
	    
	MODELO_D1(8," MODELOS : -> Nissan March 1.5"),
	MODELO_D2(9," MODELOS : -> Nissan Versa 1.4"),
	MODELO_D3(10," MODELOS : -> Nissan Kicks 1.3"),
	MODELO_D4(11," MODELOS : -> Nissan Sentra 1.7"),
	MODELO_D5(12," MODELOS : -> Nissan Frontier 1.9"),
	    
	MODELO_E1(13, " MODELOS : -> Civic 1.8"),
	MODELO_E2(14, " MODELOS : ->  Honda Fit 1.7 "),
	MODELO_E3(15," MODELOS : ->  HR-V  2.0"),
	MODELO_E4(16," MODELOS : ->  WR-V 1.8");
	 
	 
	 
	 private final String modelo;
	 private final int idModel;
	 
	 

	 private CarroModelo(int idModel,String modelo) {
		this.idModel =idModel; 
		this.modelo = modelo;
	}


	 
	// MÉTODO ESTÁTICO: O "Cérebro" que substitui o Switch Case
	    public static CarroModelo buscarPorId(int idDigitado) {
	        for (CarroModelo m : values()) {
	            if (m.idModel == idDigitado) {
	                return m;
	            }
	        }
	        return null; // Retorna null se o número não existir
	    }
	 
	 
	 


	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append(this.modelo); 
	        return sb.toString();
	    }









	 public int getIdModel() {return idModel;}


	 public String getModelo() {return modelo;}
	    
	 
	 



















}
