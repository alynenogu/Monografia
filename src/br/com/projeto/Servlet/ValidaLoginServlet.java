package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.StringUtils;

import br.com.projeto.DAO.LoginDAO;


@WebServlet("/ValidaLogin")
public class ValidaLoginServlet extends HttpServlet {
	protected void service (HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		
		PrintWriter out = response.getWriter();
		
		String login=request.getParameter("login");
		String senha=request.getParameter("senha");
		
		
		
		LoginDAO dao = new LoginDAO();
		dao.Validalogin(login,senha);
		
		if(dao.Validalogin(login,senha)==true){
			//out.println("Encontrado");
			RequestDispatcher rd = request.getRequestDispatcher("/PaginaInicial.jsp");
			rd.forward(request,response);
			
		}else{
			out.println("Não Encontrado");
		}
		
		
		
		
	}

}
