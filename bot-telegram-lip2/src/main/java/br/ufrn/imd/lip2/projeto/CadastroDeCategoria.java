package br.ufrn.imd.lip2.projeto;

import java.util.HashSet;

public class CadastroDeCategoria implements Cadastravel {

	private HashSet<Categoria> cadastro;

	public CadastroDeCategoria() {
		cadastro = new HashSet<Categoria>();
	}

	public void cadastrar(Object object) {
		Categoria categoria = (Categoria) object;
		cadastro.add(categoria);
	}

}
