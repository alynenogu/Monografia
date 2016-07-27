package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.CategoriaDAO;
import br.com.projeto.DAO.ComentarioDAO;
import br.com.projeto.modelo.Categoria;
import br.com.projeto.modelo.Comentario;
@WebServlet("/excluirComentario")
public class RemoveComentarioServlet extends HttpServlet {
protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		
		PrintWriter out = response.getWriter();
		
		int idComentario = Integer.parseInt(request.getParameter("idComentario").trim());
		
		Comentario comentario = new Comentario();
		comentario.setIdComentario(idComentario);
		
		ComentarioDAO dao = new ComentarioDAO();
		dao.removeComentario(comentario);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Excluido com sucesso!");
		out.println("</body>");
		out.println("</html>");
		


}
}