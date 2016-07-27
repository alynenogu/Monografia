package br.com.projeto.testes;

import java.sql.SQLException;

import br.com.projeto.DAO.LoginDAO;
import br.com.projeto.modelo.Login;

public class TestaAdicionaLogin extends SQLException {

	public static void main(String[] args) {
		Login lg = new Login();
		lg.setLogin("sei");
		lg.setSenha("sei");
		lg.setEmail("alyne_gois@hotmail.com");
		LoginDAO dao = new LoginDAO();
		dao.inserirLogin(lg);
		System.out.println("Concluido");
		
		
		
		

	}

}
