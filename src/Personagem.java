import javax.swing.JDialog;
import javax.swing.JOptionPane;

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
	
	public void cadastraPersonagens(int numeroPersonagens) {
		Personagem[] personagens = new Personagem[numeroPersonagens];
		
		Classe mago = new Mago();
		Classe vampiro = new Vampiro();
		Classe guerreiro = new Guerreiro();
		Classe piromante = new Piromante();
		
		Classe[] classes = {mago, vampiro, guerreiro, piromante};
		
		JDialog.setDefaultLookAndFeelDecorated(true);
	   
		for(int i = 0; i<numeroPersonagens; i++) {
			
			 Classe classeAtual = (Classe) JOptionPane.showInputDialog(null, "Escolha uma classe",
				        "Classes", JOptionPane.QUESTION_MESSAGE, null, classes, null);
			
			String nomeAtual = JOptionPane.showInputDialog("Nome: ");
			int idadeAtual = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
			double alturaAtual = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
			
			classeAtual.criaClasse();
			
			personagens[i] = new Personagem();
			personagens[i].addPersonagem(nomeAtual, idadeAtual, alturaAtual, classeAtual);
			
			System.out.println(personagens[i].mostraPersonagem());
		}
	}
	
}
