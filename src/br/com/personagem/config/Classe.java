package br.com.personagem.config;
public abstract class Classe {
	protected String nome;
	protected String arma;
	protected String armadura;
	protected int nivel;
	
	public abstract void criaClasse();
	
	public String getClasse() {
		return "Nome da classe: "+this.nome+"\n Arma da classe: "+this.arma+"\n Armadura da classe: "+this.armadura+"\n Nivel inicial da classe: "+this.nivel;
	}
		
	public String getNomeClasse() {
		return this.nome;
	}
	
}
