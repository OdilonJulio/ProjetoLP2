package br.ufrn.imd.lip2.projeto;

public class Categoria {

	private long codigo;
	private String nome;
	private String descricao;

	public Categoria(long codigo, String nome, String descricao) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
	}

	public long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "[" + this.codigo + "; " + this.nome + "; " + this.descricao + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return (this.codigo == ((Categoria) obj).getCodigo());
	}

}
