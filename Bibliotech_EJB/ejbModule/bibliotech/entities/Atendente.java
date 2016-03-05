package bibliotech.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Atendente
 *
 */
@Entity

public class Atendente implements Serializable {

	
	private int id;
	private String nome;
	private String cpf;
	private String login;
	private String senha;
	private String email;
	private static final long serialVersionUID = 1L;

	public Atendente() {
		super();
	}   
	
	@Id
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}   
	   
}
