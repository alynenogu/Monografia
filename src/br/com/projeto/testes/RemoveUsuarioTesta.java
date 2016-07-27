package br.com.projeto.testes;

import br.com.projeto.DAO.UsuarioDAO;
import br.com.projeto.modelo.Usuario;



public class RemoveUsuarioTesta {

	public static void main(String[] args) {
		Usuario usr = new Usuario();
		usr.setIdUsuario(12);
		UsuarioDAO dao = new UsuarioDAO();
		dao.remove(usr);
		System.out.println("Dado Removido");

	}

}
