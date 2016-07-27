package br.com.projeto.testes;

import br.com.projeto.DAO.UsuarioDAO;
import br.com.projeto.modelo.Usuario;



public class TestaAlteraUsuario {
	public static void main(String[] args){
		Usuario usr = new Usuario();
		usr.setIdUsuario(1);
		usr.setNome("K");
		usr.setEmail("Ka");
		usr.setLogin("123");
		usr.setSenha("455");
		usr.setTelefone("2020");
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.altera(usr);
		System.out.println("Dados Alterados");
		
		
	}

}
