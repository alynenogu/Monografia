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

@WebServlet("/alteraTipo")
public class AlteraTipoServlet extends HttpServlet {
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		PrintWriter out = response.getWriter();
		int idTipo =Integer.parseInt(request.getParameter("idTipo").trim());
		String nometipo = request.getParameter("nometipo");
		String descricaotipo = request.getParameter("descricaotipo");
	
		Tipo tipo = new Tipo();
		tipo.setIdTipo(idTipo);
		tipo.setNometipo(nometipo);
		tipo.setDescricaotipo(descricaotipo);
		
		TipoDAO dao = new TipoDAO();
		dao.alteraTipo(tipo);
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("Alteração Feita Com sucesso!");
		out.println("</body>");
		out.println("</html>");
		
		


}

}
