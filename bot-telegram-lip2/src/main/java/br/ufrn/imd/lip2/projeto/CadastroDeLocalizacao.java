package br.ufrn.imd.lip2.projeto;

import java.util.HashSet;

public class CadastroDeLocalizacao implements Cadastravel {

	private HashSet<Localizacao> cadastro;

	public CadastroDeLocalizacao() {
		cadastro = new HashSet<Localizacao>();
	}

	public void cadastrar(Object object) {

		Localizacao localizacao = (Localizacao) object;
		cadastro.add(localizacao);
	}

}
