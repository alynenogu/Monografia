package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.CategoriaDAO;
import br.com.projeto.DAO.TipoDAO;
import br.com.projeto.modelo.Categoria;
import br.com.projeto.modelo.Tipo;
@WebServlet("/excluirTipo")
public class RemoveTipoServlet extends HttpServlet {
protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		
		PrintWriter out = response.getWriter();
		
		int idTipo = Integer.parseInt(request.getParameter("idTipo").trim());
		
		Tipo tipo = new Tipo();
		tipo.setIdTipo(idTipo);
		
		TipoDAO dao = new TipoDAO();
		dao.removeTipo(tipo);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Excluido com sucesso!");
		out.println("</body>");
		out.println("</html>");
		
	
		

	}

}
