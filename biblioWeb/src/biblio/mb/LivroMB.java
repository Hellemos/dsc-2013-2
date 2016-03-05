package biblio.mb;

import javax.ejb.EJB;

import biblio.dao.LivroDAO;
import biblio.model.Livro;

public class LivroMB {

	@EJB
	private LivroDAO dao;
	
	private String isbn;
	private String titulo;
	private String autor;
	private String editora;
	private int ano;
	
	public LivroMB() {
		super();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String cadastrarLivro() {
		Livro liv = new Livro();
		liv.setAno(ano);
		liv.setAutor(autor);
		liv.setEditora(editora);
		liv.setIsbn(isbn);
		liv.setTitulo(titulo);
		
		System.err.println("Inserindo: "+liv.getTitulo()+", "+liv.getIsbn());
		dao.insereLivro(liv);
		
		return "ok";
	}
}
