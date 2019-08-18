import javax.swing.*;

public class Executa {

	public static void main(String[] args) {  
					 
		int numeroDePersonagens = Integer.parseInt(JOptionPane.showInputDialog("Escolha quantos personagens existem: "));
		
		Personagem personagem = new Personagem();
		personagem.cadastraPersonagens(numeroDePersonagens);
		
	}

}
