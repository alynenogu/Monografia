package br.com.projeto.testes;

import br.com.projeto.DAO.EnderecoDAO;
import br.com.projeto.DAO.UsuarioDAO;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.Usuario;

public class testaAdicionaUsuarioEnd {
	
	public static void main(String[] args) {
		
		Endereco end = new Endereco();
		Usuario usr = new Usuario();
		
		usr.setNome("Eu");
		usr.setEmail("alyne_gois");
		usr.setLogin("neeu");
		usr.setSenha("ne12");
		usr.setTelefone("a33e");
		
		
		end.setRua("Rua Dinaelza");
		end.setCidade("Rio de Janeiro");
		end.setBairro("Campo Grande");
		end.setEstado("Rio de Janeiro");
		end.setComplemento("lote29 quadra36");
		
		usr.setEndereco(end);
	
	
	
	

	
		EnderecoDAO dao1 = new EnderecoDAO();
		dao1.inserirEndereco(end);
		UsuarioDAO dao = new UsuarioDAO();
		dao.insereUsuario(usr);
		
		
		
		
	
		System.out.println("Concluido");
		System.out.println("Concluido");

	}


}
