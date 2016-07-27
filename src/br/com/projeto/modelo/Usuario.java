package br.com.projeto.modelo;

public class Usuario {
	
	int idUsuario;
	String nome;
	String email;
	String login;
	String senha;
	String telefone;
	Endereco endereco;
	

public Usuario(){
	
}
	public  Usuario(int idUsuario, String nome, String email,String login,String senha,String telefone){
		
			this.idUsuario = idUsuario;
			this.nome =nome;
			this.email = email;
			this.login = login;
			this.senha= senha;
			this.telefone= telefone;
		
	}
	
	 public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	
	

}
