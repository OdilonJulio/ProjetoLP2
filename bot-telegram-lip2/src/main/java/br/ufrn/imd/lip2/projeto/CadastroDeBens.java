package br.ufrn.imd.lip2.projeto;

import java.util.HashSet;

public class CadastroDeBens implements Cadastravel {

	private HashSet<Bem> cadastro;

	public CadastroDeBens() {
		cadastro = new HashSet<Bem>();
	}

	public void cadastrar(Object object) {
		Bem bem = (Bem) object;
		cadastro.add(bem);
	}

	public Bem buscarBem(long codigo) {
		for (Bem bem : cadastro) {
			if (bem.getCodigo() == codigo) {
				return bem;
			}
		}
		throw new IllegalArgumentException("Codigo Invalido");
	}

	public Bem buscarBem(String string) {
		for (Bem bem : cadastro) {
			if (bem.getNome().equals(string)) {
				return bem;
			} else if (bem.getDescricao().equals(string)) {
				return bem;
			}
		}
		throw new IllegalArgumentException("Nenhum nome/descricao correspondentes encontrados.");
	}

	public void movimentarBem(Bem bem, Localizacao novaLocalizacao) {
		for (Bem bem2 : cadastro) {
			if (bem2.equals(bem)) {
				bem2.setLocalizacao(novaLocalizacao);
			}
		}
	}

	public void gerarRelatorio() {
		for (Bem bem : cadastro) {
			System.out.println(bem);
		}
	}
}
