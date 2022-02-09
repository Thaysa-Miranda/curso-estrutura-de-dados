package modelo;

public class Livro {

	private String nome;
	private String isbn;
	private String autor;
	private int ano_lancamento;

	public Livro() {

	}

	public Livro(String nome, String isbn, String autor, int ano_lancamento) {
		this.nome = nome;
		this.isbn = isbn;
		this.autor = autor;
		this.ano_lancamento = ano_lancamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno_lancamento() {
		return ano_lancamento;
	}

	public void setAno_lancamento(int ano_lancamento) {
		this.ano_lancamento = ano_lancamento;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", isbn=" + isbn + ", autor=" + autor + ", ano_lancamento=" + ano_lancamento
				+ "]";
	}

}
