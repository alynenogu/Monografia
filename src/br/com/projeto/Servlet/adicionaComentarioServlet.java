package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.ComentarioDAO;
import br.com.projeto.modelo.Categoria;
import br.com.projeto.modelo.Comentario;
import br.com.projeto.modelo.tipo_de_estabelecimento;
import br.com.projeto.modelo.Usuario;



@WebServlet("/adicionaComentarioUsuario")
public class adicionaComentarioServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{

		PrintWriter out = response.getWriter();
		String nomeEstabelecimento = request.getParameter("nomeEstabelecimento");
		String nomecategoria=request.getParameter("nomecategoria");
		String textoComentario = request.getParameter("textoComentario");
		int idUsuario = Integer.parseInt(request.getParameter("idUsuario").trim());
		int idcategoria = Integer.parseInt(request.getParameter("idcategoria").trim());
		int idEstabelecimento = Integer.parseInt(request.getParameter("idEstabelecimento").trim());
		
		
		Comentario com = new Comentario();
		com.setNomeEstabelecimento(nomeEstabelecimento);
		com.setNomecategoria(nomecategoria);
		com.setTextoComentario(textoComentario);
		com.setUsuario(new Usuario());
		com.getUsuario().setIdUsuario(idUsuario);
		com.setCategoria(new Categoria());
		com.getCategoria().setIdcategoria(idcategoria);
		com.setHospital(new tipo_de_estabelecimento());
		com.getHospital().setIdEstabelecimento(idEstabelecimento);
		com.setDataComentario(Calendar.getInstance());
		
		
		ComentarioDAO dao = new ComentarioDAO();
		dao.insereComentario(com);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Inserido");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
		
	}
	
}
