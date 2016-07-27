package br.com.projeto.Servlet;

import javax.servlet.http.HttpServlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.LoginDAO;
import br.com.projeto.modelo.Login;

@WebServlet("/alteralogin")
public class AlteraLoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		int idlogin =Integer.parseInt(request.getParameter("idlogin").trim());
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		
		Login lg = new Login();
		lg.setIdLogin(idlogin);
		lg.setLogin(login);
		lg.setSenha(senha);
		lg.setEmail(email);
		
		LoginDAO dao = new LoginDAO();
		dao.alteraLogin(lg);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Alteração Feita Com sucesso!");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}

}

