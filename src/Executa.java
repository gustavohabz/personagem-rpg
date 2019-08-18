import javax.swing.*;

public class Executa {

	public static void main(String[] args) {  
					 
		int numeroDePersonagens = Integer.parseInt(JOptionPane.showInputDialog("Escolha quantos personagens existem: "));
		
		Personagem[] personagens = new Personagem[numeroDePersonagens];
		
		Classe mago = new Mago();
		Classe vampiro = new Vampiro();
		Classe guerreiro = new Guerreiro();
		
		Classe[] classes = {mago, vampiro, guerreiro};
		
		JDialog.setDefaultLookAndFeelDecorated(true);
	   
		for(int i = 0; i<numeroDePersonagens; i++) {
			
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
		/*
		Classe classeAlucard = new Piromante();
		classeAlucard.criaClasse();
		Personagem alucard = new Personagem("Alucard Tepec", 150, 1.90, classeAlucard);
		
		Classe classeRichter = new Guerreiro();
		classeRichter.criaClasse();
		Personagem belmont = new Personagem("Richter Belmont", 26, 1.86, classeRichter);
		
		String armaEscolhida = JOptionPane.showInputDialog("Trocar arma de "+belmont.getNome());
		belmont.escolheArma(armaEscolhida);
		
		
		System.out.println("DADOS DO PERSONAGEM: ");
		System.out.println(alucard.mostraPersonagem());
		System.out.println("CLASSE DO PERSONAGEM: ");
		System.out.println(alucard.classe.getClasse());
		
		System.out.println("------------");
		
		System.out.println("DADOS DO PERSONAGEM: ");
		System.out.println(belmont.mostraPersonagem());
		System.out.println("CLASSE DO PERSONAGEM: ");
		System.out.println(belmont.classe.getClasse());
		
		nome = JOptionPane.showInputDialog("Nome do personagem: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("altura: "));			
		
		
		JOptionPane.showMessageDialog(null, alucard.mostraPersonagem());
		*/
	}

}
