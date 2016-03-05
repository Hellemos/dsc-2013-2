package aplicacao.exemplo;

public class LoginBean {
	private String login;
	private String senha;
	private boolean autenticado = false;
	
	public LoginBean() {
		super();
	}

	public boolean isAutenticado() {
		return autenticado;
	}

	public void setAutenticado(boolean autenticado) {
		this.autenticado = autenticado;
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
	
	public String autenticar() {
		if (login.equals("admin") && senha.equals("123")) {
			autenticado = true;
			return "ok";
		}
		return "falha";
	}
	
}
