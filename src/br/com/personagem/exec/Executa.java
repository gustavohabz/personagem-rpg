package br.com.personagem.exec;

import javax.swing.*;

import br.com.personagem.config.Personagem;

public class Executa {

	public static void main(String[] args) {  
		boolean ativo = true;
		do {
			
			Personagem personagem = new Personagem();
			
			String[] buttons = {"Cadastrar", "Listar", "Fechar"};
			
			
			int returnValue = JOptionPane.showOptionDialog(null, "O que deseja fazer", "Inicio", JOptionPane.WARNING_MESSAGE, 0, null, buttons, 0);
			
			
			if(returnValue == 0) {
				int numeroDePersonagens;
				try {
					numeroDePersonagens = Integer.parseInt(JOptionPane.showInputDialog("Escolha quantos personagens existem: "));
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Insira um número válido!");
					continue;
				}
			
				personagem.cadastraPersonagens(numeroDePersonagens);
				
				if(numeroDePersonagens == 0){
					ativo = false;
				}
			}else if(returnValue == 1){
				JOptionPane.showMessageDialog(null, personagem.getPersonagens());
			}else {
				ativo = false;
			}
			
			
		}while(ativo);
		
	}

}
