package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.EnderecoDAO;
import br.com.projeto.DAO.UsuarioDAO;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.Usuario;



@WebServlet("/adicionaUsuario")
public class adicionaUsuarioServlet extends HttpServlet{
	protected void service (HttpServletRequest request, HttpServletResponse response)
			throws IOException,ServletException{
		
			PrintWriter out = response.getWriter();
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			String confirmarsenha = request.getParameter("confirmarsenha");
			String telefone = request.getParameter("telefone");
			String rua = request.getParameter("rua");
			String cidade = request.getParameter("cidade");
			String bairro = request.getParameter("bairro");
			String estado = request.getParameter("estado");
			String complemento=request.getParameter("complemento");
			int cep = Integer.parseInt(request.getParameter("cep").trim());
				
		
			if(senha.equals(confirmarsenha)){
			Endereco end = new Endereco();
			Usuario usr = new Usuario();
			
			usr.setNome(nome);
			usr.setEmail(email);
			usr.setLogin(login);
			usr.setSenha(senha);
			usr.setTelefone(telefone);
			
			
			end.setRua(rua);
			end.setCidade(cidade);
			end.setBairro(bairro);
			end.setEstado(estado);
			end.setComplemento(complemento);
			end.setCep(cep);
			
			usr.setEndereco(end);
		
		
		
		

		
			EnderecoDAO dao1 = new EnderecoDAO();
			dao1.inserirEndereco(end);
			UsuarioDAO dao = new UsuarioDAO();
			dao.insereUsuario(usr);
			

			
		
		
		
		
			out.println("<html>");
			out.println("<body>");
			out.println("Cadastro Feito Com sucesso!");
			out.println("</body>");
			out.println("</html>");
			}else{
				out.println("<html>");
				out.println("<body>");
				out.println("Senhas não batem!");
				out.println("</body>");
				out.println("</html>");
				
			}
		
	}
	}


