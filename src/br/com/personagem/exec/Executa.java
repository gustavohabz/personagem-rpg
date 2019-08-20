package br.com.personagem.exec;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.personagem.config.Personagem;
/**
 * 
 * @author gustavohabz
 *
 */
public class Executa {

	public static void main(String[] args) {  
		boolean ativo = true;
		ArrayList listaRefs = new ArrayList();
		do {
			
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
				for(int i = 0; i<numeroDePersonagens; i++) {
					Personagem personagem = new Personagem();
					
					personagem.cadastraPersonagens(numeroDePersonagens);
				
					listaRefs.add(personagem);
				}
				
				if(numeroDePersonagens == 0){
					ativo = false;
				}
			}else if(returnValue == 1){
				for(int i=0; i<listaRefs.size(); i++){
					JOptionPane.showMessageDialog(null, listaRefs.get(i));					
				}						
			}else {
				ativo = false;
			}
			
		}while(ativo);
		
	}

}
