package br.ufrn.imd.lip2.projeto;
import java.util.HashSet;
import java.util.Set;

public class Cadastro {

	private Set<Bem> bens;
	private Set<Localizacao> localizacoes;
	private Set<Categoria> categorias;

	public Cadastro() {
		this.bens = new HashSet<Bem>();
		this.localizacoes = new HashSet<Localizacao>();
		this.categorias = new HashSet<Categoria>();
	}

	public void cadastrarLocalizacao(Localizacao localizacao) {
		localizacoes.add(localizacao);
	}

	public void cadastrarCategoria(Categoria categoria) {
		categorias.add(categoria);
	}

	public void cadastrarBem(Bem bem) {
		bens.add(bem);
	}

	public Bem buscarBem(long codigo) {
		for (Bem bem : bens) {
			if (bem.getCodigo() == codigo) {
				return bem;
			}
		}
		throw new IllegalArgumentException("Código Inválido");
	}

	public Bem buscarBem(String string) {
		for (Bem bem : bens) {
			if (bem.getNome().equals(string)) {
				return bem;
			} else if (bem.getDescricao().equals(string)) {
				return bem;
			}
		}
		throw new IllegalArgumentException("Nenhum nome/descrição correspondentes encontrados.");
	}

	public void movimentarBem(Bem bem, Localizacao novaLocalizacao) {
		for (Bem bem2 : bens) {
			if (bem2.equals(bem)) {
				bem2.setLocalizacao(novaLocalizacao);
			}
		}
	}
	
	public void gerarRelatorio() {
		// falta implementar
	}	
}
