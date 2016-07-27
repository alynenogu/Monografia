package br.com.projeto.testes;

import br.com.projeto.DAO.EnderecoDAO;
import br.com.projeto.DAO.UsuarioDAO;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.Usuario;

public class TestaAdicionaUsuario {

	public static void main(String[] args) {
		Usuario usr = new Usuario();
		usr.setNome("Alyne");
		usr.setEmail("alyne");
		usr.setLogin("alyne");
		usr.setSenha("alyne");
		usr.setTelefone("alyne");
	
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.insereUsuario(usr);
		System.out.println("Concluido");

	}

}
