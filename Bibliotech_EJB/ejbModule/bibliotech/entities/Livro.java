package bibliotech.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Livro
 *
 */
@Entity

public class Livro implements Serializable {

	
	private int id;
	private String titulo;
	private int ano;
	private String editora;
	private String autores;
	private boolean disponivel;
	private static final long serialVersionUID = 1L;

	public Livro() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}   
	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}   
	public String getEditora() {
		return this.editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}   
	public String getAutores() {
		return this.autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}   
	public boolean getDisponivel() {
		return this.disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
   
}
