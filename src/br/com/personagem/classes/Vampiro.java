package br.com.personagem.classes;

import br.com.personagem.config.Classe;

public class Vampiro extends Classe {


	@Override
	public void criaClasse() {
		super.nome = "Vampiro";
		super.arma = "Espada Longa";
		super.armadura = "Capa da Meia-Noite";
		super.nivel = 30;
	}

}
