package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.CategoriaDAO;
import br.com.projeto.DAO.ComentarioDAO;

@WebServlet("/buscaidcategoria")
public class BuscaCategoriaServlet extends HttpServlet {
protected void service(HttpServletRequest request, HttpServletResponse response) {
		
		String nomecategoria = request.getParameter("nomecategoria");
		
		int idcategoria=0;
		
		CategoriaDAO dao = new CategoriaDAO();
		idcategoria = dao.buscarIdCategoria(nomecategoria);
		
		
		try {
			PrintWriter out = response.getWriter();
			out.println(idcategoria);
			
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}


}
