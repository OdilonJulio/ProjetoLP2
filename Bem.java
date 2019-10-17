
public class Bem {

	private long codigo;
	private String nome;
	private String descricao;
	private Localizacao localizacao;
	private Categoria categoria;

	public Bem(long codigo, String nome, String descricao) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
	}

	public long getCodigo() {
		return this.codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public String getDescricao() {
		return this.descricao;
	}
	
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	
	public void setLocalizacao(String nome, String descricao) {
		this.localizacao = new Localizacao(nome, descricao);
	}

	@Override
	public String toString() {
		return "[" + this.codigo + "; " + this.nome + "; " + this.descricao + "; " + this.localizacao + "; " + this.categoria + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return (this.codigo == ((Bem) obj).getCodigo());
	}
}
