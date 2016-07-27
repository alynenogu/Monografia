package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.CategoriaDAO;
import br.com.projeto.DAO.ComentarioDAO;
import br.com.projeto.modelo.Categoria;
import br.com.projeto.modelo.Comentario;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.tipo_de_estabelecimento;
import br.com.projeto.modelo.Usuario;
@WebServlet("/alteracomentarioUsuario")
public class AlteraComentarioUsuarioServlet extends HttpServlet {
		protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
			PrintWriter out = response.getWriter();
			int idComentario =Integer.parseInt(request.getParameter("idComentario").trim());
			String nomeEstabelecimento = request.getParameter("nomeEstabelecimento");
			String nomecategoria = request.getParameter("nomecategoria");
			String textoComentario = request.getParameter("textoComentario");
			int idUsuario = Integer.parseInt(request.getParameter("idUsuario").trim());
			int idCategoria = Integer.parseInt(request.getParameter("idcategoria").trim());
			int idEstabelecimento = Integer.parseInt(request.getParameter("idEstabelecimento").trim());
		
			Comentario comentario = new Comentario();
			comentario.setIdComentario(idComentario);
			comentario.setNomeEstabelecimento(nomeEstabelecimento);
			comentario.setNomecategoria(nomecategoria);
			comentario.setTextoComentario(textoComentario);
			comentario.setUsuario(new Usuario());
			comentario.getUsuario().setIdUsuario(idUsuario);
			comentario.setCategoria(new Categoria());
			comentario.getCategoria().setIdcategoria(idCategoria);
			comentario.setHospital(new tipo_de_estabelecimento());
			comentario.getHospital().setIdEstabelecimento(idEstabelecimento);
			comentario.setDataComentario(Calendar.getInstance());
			
			
			ComentarioDAO dao = new ComentarioDAO();
			dao.alteraComentario(comentario);
			
			
			out.println("<html>");
			out.println("<body>");
			out.println("Alteração Feita Com sucesso!");
			out.println("</body>");
			out.println("</html>");
			
			
			
		}
}
