package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.ComentarioDAO;
@WebServlet("/buscaidHospital")
public class BuscaHospitalServlet extends HttpServlet {
		
	protected void service(HttpServletRequest request, HttpServletResponse response) {
		
		String nomeEstabelecimento = request.getParameter("nomeEstabelecimento");
		int idEstabelecimento=0;
		
		ComentarioDAO dao = new ComentarioDAO();
		idEstabelecimento = dao.buscarIdHospital(nomeEstabelecimento);
		
		
		try {
			PrintWriter out = response.getWriter();
			out.println(idEstabelecimento);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
