package bibliotech.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Emprestimo
 *
 */
@Entity

public class Emprestimo implements Serializable {

	
	private int id;
	private Date dataEmprestimo;
	private String atendente;
	private Usuario usuario;
	private List<Livro> livros;
	private static final long serialVersionUID = 1L;

	public Emprestimo() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Date getDataEmprestimo() {
		return this.dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}   
	public String getAtendente() {
		return this.atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	} 
	
	@ManyToOne
	public Usuario getUsuario() {
		return this.usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}   
	
	
	@OneToMany
	public List<Livro> getLivros() {
		return this.livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
   
}
