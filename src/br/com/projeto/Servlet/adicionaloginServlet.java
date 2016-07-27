package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.LoginDAO;
import br.com.projeto.modelo.Login;

import com.sun.net.httpserver.HttpServer;

@WebServlet("/adicionalogin")
public class adicionaloginServlet extends HttpServlet{
	protected void service (HttpServletRequest request, HttpServletResponse response)
			throws IOException,ServletException{
		
			PrintWriter out = response.getWriter();
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			String email = request.getParameter("email");
			
			
			
			Login lg = new Login();
			lg.setLogin(login);
			lg.setSenha(senha);
			lg.setEmail(email);
			
			LoginDAO dao = new LoginDAO();
			dao.inserirLogin(lg);
			
			out.println("<html>");
			out.println("<body>");
			out.println("Cadastro Feito Com sucesso!");
			out.println("</body>");
			out.println("</html>");
			
			
			
			
		
		
	}

}
