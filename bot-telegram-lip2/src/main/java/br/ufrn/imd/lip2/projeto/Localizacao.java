package br.ufrn.imd.lip2.projeto;

public class Localizacao {

	private String nome;
	private String descricao;

	public Localizacao(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "[" + this.nome + "; " + this.descricao + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Localizacao localizacao = (Localizacao) obj;
		return (this.nome.equals(localizacao.getNome())) && (this.descricao.equals(localizacao.getDescricao()));
	}

}
