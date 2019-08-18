
public class Personagem {
	//------dados do personagem---------
	private String nome;//nome do personagem
	private int healthPoints;//pontos de vida
	private int magicPoints;//pontos de magia
	private double altura;//altura do personagem
	private int idade;//idade do personagem

	//-----dados da classe--------
	private String nomeDaClasse;
	private String arma;
	private String armadura;
	private int nivel;
	Classe classe;
	
	public void addPersonagem(String nome, int idade, double altura, Classe classe) {
		//DADOS DO PERSONAGEM
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		
		//OBJETO DA CLASSE
		this.classe = classe;
		
		//DADOS DA CLASSE DO PERSONAGEM
		this.nomeDaClasse = this.classe.nome;
		this.arma = this.classe.arma;
		this.armadura = this.classe.armadura;
		this.nivel = this.classe.nivel;
	}
	
	public String mostraPersonagem() {
		return this.nome+"\n Idade: "+this.idade+"\n Altura: "+this.altura+"\n HP: "+this.healthPoints+"\n MP: "+this.magicPoints
				+"\n Nível: "+this.nivel+"\n Classe: "+this.nomeDaClasse+"\n Armadura: "+this.armadura+"\n Arma: "+this.arma;
	}
	
	public void escolheArma(String arma) {
		this.arma = arma;
	}
	
	public String getNome() {
		return this.nome;
	}
	
}
