package Dominio;



public enum Armazem {
  
    GRÃOS(1), 
    BEBIDAS(2), 
    MASSAS(3), 
    CARNES(4), 
    ROUPAS(5), 
    CALÇADOS(6), 
    FERRAMENTAS(7), 
    CONSTRUCAO(8),
	PRODUTOS_DE_LIMPEZA(9);
    
    private final int id;

  

    private Armazem(int id) {
        this.id = id;
    }

    
    
   
    public static Armazem buscarPorId(int id) {
        for (Armazem categoria : values()) {
            if (categoria.getId() == id) {
                return categoria;
            }
        }
        return null;
    }
    
    
    
    

    public int getId() {  return id;  }
    
    
    
    
    
    
    
    
    
}