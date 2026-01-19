package Dominio;

import java.util.Arrays;
import java.util.List;

public enum Origem {
	
	
	ITALIANA(1, "ROSSI", "FERRARI", "BIANCHI", "ESPOSITO", "ROMANO"),
    PORTUGUESA(2, "SILVA", "SANTOS", "FERREIRA", "CAMOES","VAZ","ALVAREZ"),
    BRASILEIRA(3, "OLIVEIRA", "SOUZA", "PEREIRA", "RIBEIRO","ALVES"),
	INDIGENA(4,"ARARIPE","CARIJÓ","IPANEMA","GUARÁ","UBAJARA","CAIAPÓ","JANDAÍRA","JUCÁ"),
	VENEZUELANO(6,"GONZÁLEZ","RODRÍGUEZ","PÉREZ","GARCÍA","LÓPEZ","LUIZ"," ALEJANDRO"),
	BOLIVIANA(6,"MARIELA","SOLEDAD","ANTONELLA","GABRIELA","PAOLA","ESTEFANÍA","VERÓNICA"),
	ARGENTINA(7,"TORRES","BIANCA","PERALTA","FERNADEZ","NAVARRO","PALACIOS","MONTENEGRO"),
	ALEMÃ(8,"BECKER","WAGNER","BRAUN","SCHMIDT","WERNER","HAUFFMAN","HERRMANN");
	

    private final int id;
    private final List<String> sobrenomesComuns;

    
    // ... os tres pontinhos é o (Varargs)
    // O uso de "String... sobrenomes" permite passar vários nomes sem precisar de Arrays.asList aqui
    private Origem(int id, String... sobrenomes) {
        this.id = id;
        this.sobrenomesComuns = Arrays.asList(sobrenomes);
    }

    public List<String> getSobrenomesComuns() {
        return sobrenomesComuns;
    }
 
    public int getId() {
        return id;
    }
}
