package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.CategoriaDAO;
import br.com.projeto.DAO.TipoDAO;

@WebServlet("/buscaidtipo")
public class BuscaTipoServlet extends HttpServlet {
protected void service(HttpServletRequest request, HttpServletResponse response) {
		
		String nomeTipo = request.getParameter("nomeTipo");
		
		int idTipo=0;
		
		TipoDAO dao = new TipoDAO();
		idTipo = dao.buscarIdTipo(nomeTipo);
		
		
		try {
			PrintWriter out = response.getWriter();
			out.println(idTipo);
			
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}



}
