package br.com.projeto.testes;

import br.com.projeto.DAO.UsuarioDAO;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.Usuario;



public class TestaalteraUsuarioeEnd {

	public static void main(String[] args) {
		Usuario usr = new Usuario();
		Endereco end = new Endereco();
		usr.setEndereco(new Endereco());
		
		usr.setIdUsuario(1);
		usr.getEndereco().setIdEndereco(1);
		usr.setNome("Testedehoj22e");
		usr.setEmail("Testedehoje");
		usr.setLogin("Testedehoje");
		usr.setSenha("1");
		usr.setTelefone("Testedehoje");
	
		usr.getEndereco().setRua("oiks");
		usr.getEndereco().setCidade("Testedehoje");
		usr.getEndereco().setBairro("Testedehoje");
		usr.getEndereco().setEstado("Testedehoje");
		usr.getEndereco().setComplemento("Testedehoje");
		
	
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.altera(usr);
		
	
	}

}
