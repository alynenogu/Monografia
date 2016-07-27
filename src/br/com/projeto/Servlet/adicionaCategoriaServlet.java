package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.CategoriaDAO;
import br.com.projeto.modelo.Categoria;

@WebServlet("/adicionaCategoria")
public class adicionaCategoriaServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		
	PrintWriter out = response.getWriter();
	
	String nomecategoria = request.getParameter("nomecategoria");
	String descricaoCategoria=request.getParameter("descricaoCategoria");
	
	Categoria ctg = new Categoria();
	ctg.setNomecategoria(nomecategoria);
	ctg.setDescricaoCategoria(descricaoCategoria);
	
	CategoriaDAO dao = new CategoriaDAO();
	dao.insereCategoria(ctg);
	
	out.println("<html>");
	out.println("<body>");
	out.println("Cadastro Feito Com sucesso!");
	out.println("</body>");
	out.println("</html>");
	
	
	
	
	
	
	}

}
