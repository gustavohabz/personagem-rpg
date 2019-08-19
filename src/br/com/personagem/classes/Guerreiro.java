package br.com.personagem.classes;

import br.com.personagem.config.Classe;

public class Guerreiro extends Classe{

	@Override
	public void criaClasse() {
		 super.nome = "Guerreiro";
		 super.arma = "Zweihander";
		 super.armadura = "Armadura de Prata";
		 super.nivel = 8;
	}

}
