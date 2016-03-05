package exemplo.ex01;

import javax.ejb.EJB;

import exemplo1.negocio.Autenticador;

public class Usuario {
	
	private String login;
	private String senha;
	
	@EJB
	Autenticador auth;
	
	public Usuario() {
		super();
	}
	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String valida() {
		if (auth.autenticar(login, senha)) return "ok";
		return "falha";
	}
}
