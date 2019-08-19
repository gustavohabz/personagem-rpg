package br.com.personagem.config;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import br.com.personagem.classes.Guerreiro;
import br.com.personagem.classes.Mago;
import br.com.personagem.classes.Piromante;
import br.com.personagem.classes.Vampiro;

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
	
	//---------numero de personagens--------
	private static int numeroDePersonagensTotal;
	
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
		
		Personagem.numeroDePersonagensTotal++;
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
	
	/***
	 * cadastrar todos os personagens
	 * @param numeroPersonagens
	 */
	public void cadastraPersonagens(int numeroPersonagens) {
		Personagem[] personagens = new Personagem[numeroPersonagens];
		
		Classe mago = new Mago();
		Classe vampiro = new Vampiro();
		Classe guerreiro = new Guerreiro();
		Classe piromante = new Piromante();
		
		Classe[] classes = {mago, vampiro, guerreiro, piromante};
		
	   
		for(int i = 0; i<numeroPersonagens; i++) {
			Classe classeAtual;
			String nomeAtual;
			int idadeAtual = 0;
			double alturaAtual = 0;
			
			classeAtual = (Classe) JOptionPane.showInputDialog(null, "Escolha uma classe",
				        "Classes", JOptionPane.QUESTION_MESSAGE, null, classes, null);
			
			nomeAtual = JOptionPane.showInputDialog("Nome: ");
			try {
				idadeAtual = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
			}catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Idade invalida");
			}
			alturaAtual = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
			
			classeAtual.criaClasse();
			
			personagens[i] = new Personagem();
			personagens[i].addPersonagem(nomeAtual, idadeAtual, alturaAtual, classeAtual);
			
			System.out.println(nomeAtual+" foi cadastrado.");
		}
	}
	/***
	 * listar todos os personagens
	 * @return
	 */
	public String getPersonagens() {
		if(Personagem.numeroDePersonagensTotal>0) {
			String texto = "";
			Personagem[] personagens = new Personagem[numeroDePersonagensTotal];
			personagens[0] = new Personagem();
			personagens[0].getNome();
			for(int i=0; i<Personagem.numeroDePersonagensTotal; i++) {
				texto += personagens[i].getNome();
			}
			return texto;
		}
		return "Sem personagens até o momento";
	}
	
}
