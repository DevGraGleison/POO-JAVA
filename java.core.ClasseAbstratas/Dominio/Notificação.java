package Dominio;

public abstract class Notificação {
	
	private String destinatario;
	public String nome;
	
	
	
	

	
	
	
	
	public Notificação(String nome) {
		super();
		this.nome = nome;
	}


	public void definirDestinatario(String destinatario){ // (METODO CONCRETO) NÃO HA A PALAVRA RESERVADA ABSTRACT
		
		this.destinatario = destinatario;
		
	}
	
	
	public abstract void enviar(); // (METODO ABSTRACT) NÃO HA UM CORPO { }


	public String getDestinatario() {return destinatario;}


	public String getNome() {return nome;}



	
		
	

}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Exatamente! Essa é uma regra fundamental da sintaxe do Java. Se você tentar
 * colocar um método abstract dentro de uma classe comum (concreta), o
 * compilador gerará um erro.
 * Aqui estão os pontos cruciais sobre essa regra:
 * 
 * 1. A Classe precisa ser AbstrataPara que uma classe possa conter a "promessa" de
 * um comportamento (o método abstrato), a classe em si deve ser marcada como
 * incompleta.Por que? Se o Java permitisse um método abstrato em uma classe
 * comum, você poderia instanciar essa classe (new MinhaClasse()) e tentar
 * chamar o método que não existe, o que causaria um erro fatal no sistema.
 * 
 * 2. E as Interfaces?Embora sua afirmação esteja correta para classes, vale lembrar
 * que Interfaces também permitem métodos abstratos. Na verdade, em interfaces,
 * os métodos são public abstract por padrão, mesmo que você não escreva as
 * palavras-chave.Resumo Visual das RegrasTipo de ClassePode ter método
 * Concreto?Pode ter método Abstrato?Pode ser instanciada (new)?Classe
 * ComumSimNãoSimClasse AbstrataSimSimNãoInterfaceApenas default ou
 * staticSimNãoExemplo de Erro de CompilaçãoSe você tentar fazer isto:Javapublic
 * 
 * class Animal { // Classe comum public abstract void emitirSom(); // ERRO! } O
 * compilador dirá algo como:
 * "The abstract method emitirSom in type Animal can only be defined by an abstract class"
 * .Para corrigir, você deve obrigatoriamente adicionar abstract ao nome da
 * 
 * classe:Java public abstract class Animal { // Agora sim! 
 * public abstract void emitirSom(); }
 */







