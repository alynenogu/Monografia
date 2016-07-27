package br.com.projeto.testes;

import br.com.projeto.DAO.EnderecoDAO;
import br.com.projeto.DAO.LoginDAO;

import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.Login;
import br.com.projeto.modelo.Usuario;

public class TestaadicionaEndereco {

	public static void main(String[] args) {
		Endereco end = new Endereco();
		end.setRua("Alyne");
		end.setCidade("alyne");
		end.setBairro("alyne");
		end.setEstado("alyne");
		end.setComplemento("alyne");

	
		
		EnderecoDAO dao = new EnderecoDAO();
		dao.inserirEndereco(end);
		System.out.println("Concluido");
		

	}

}
