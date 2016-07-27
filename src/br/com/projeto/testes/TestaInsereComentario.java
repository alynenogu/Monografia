package br.com.projeto.testes;

import java.util.Calendar;

import br.com.projeto.DAO.ComentarioDAO;
import br.com.projeto.modelo.Categoria;
import br.com.projeto.modelo.Comentario;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.tipo_de_estabelecimento;
import br.com.projeto.modelo.Usuario;

public class TestaInsereComentario {

	public static void main(String[] args) {
		Comentario comentario =new Comentario();
		comentario.setNomeEstabelecimento("HOSPITAL");
		comentario.setNomecategoria("Sugestao");
		comentario.setTextoComentario("TextoComentario");
		
		comentario.setUsuario(new Usuario());
		comentario.getUsuario().setIdUsuario(8);
		comentario.setCategoria(new Categoria());
		comentario.getCategoria().setIdcategoria(3);
		comentario.setHospital(new tipo_de_estabelecimento());
		comentario.getHospital().setIdEstabelecimento(4);
		comentario.setDataComentario(Calendar.getInstance());
		
		ComentarioDAO dao = new ComentarioDAO();
		dao.insereComentario(comentario);
		System.out.println("Insere comentario");
		
		
		
		

	}

}
