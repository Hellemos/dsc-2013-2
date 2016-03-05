package bibliotech.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {

	
	private int id;
	private String matricula;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private List<Emprestimo> emprestimos;
	private static final long serialVersionUID = 1L;

	public Usuario() {
		super();
		this.emprestimos = new ArrayList<Emprestimo>();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	@OneToMany(mappedBy="usuario")
	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	public void addEmprestimo(Emprestimo emprestimo) {
		emprestimo.setUsuario(this);
	}
}
