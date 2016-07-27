package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.tipo_de_estabelecimentoDAO;
import br.com.projeto.modelo.tipo_de_estabelecimento;



@WebServlet("/excluirhospital")
public class removeHospitalServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
	
		PrintWriter out = response.getWriter();
		
		int idEstabelecimento = Integer.parseInt(request.getParameter("idEstabelecimento").trim());
		
		tipo_de_estabelecimento hsp = new tipo_de_estabelecimento();
		hsp.setIdEstabelecimento(idEstabelecimento);
		
		tipo_de_estabelecimentoDAO dao = new tipo_de_estabelecimentoDAO();
		dao.removeEstabelecimento(hsp);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Excluido com sucesso!");
		out.println("</body>");
		out.println("</html>");
		
	
		
		
		
		
		
	}

}
