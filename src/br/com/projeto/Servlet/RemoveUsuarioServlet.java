package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.UsuarioDAO;
import br.com.projeto.modelo.Usuario;


@WebServlet("/excluiUsuario")
public class RemoveUsuarioServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request,HttpServletResponse response)
			throws IOException,ServletException{
		
		
		PrintWriter out = response.getWriter();
		int idUsuario = Integer.parseInt(request.getParameter("idUsuario").trim());
		
		Usuario usr = new Usuario();
		usr.setIdUsuario(idUsuario);
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.remove(usr);
		out.println("<html>");
		out.println("<body>");
		out.println("Excluido com sucesso!");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}
		
	

}
