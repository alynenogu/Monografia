package br.com.projeto.modelo;

public class Login {
	private int idLogin;
	private String login;
	private String senha;
	private String email;
	
	public Login(){
		
	}
	public Login(int idLogin, String login, String senha, String email) {
		this.idLogin = idLogin;
		this.login = login;
		this.senha = senha;
		this.email = email;
	
	}
	
	public int getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
		
}
