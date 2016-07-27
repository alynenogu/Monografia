package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.EnderecoDAO;
import br.com.projeto.DAO.tipo_de_estabelecimentoDAO;
import br.com.projeto.DAO.UsuarioDAO;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.tipo_de_estabelecimento;
import br.com.projeto.modelo.Usuario;

@WebServlet("/alteraDadosUsuario")
public class AlteraDadosUsuarioServl extends HttpServlet{
	
	protected void service(HttpServletRequest request,HttpServletResponse response)
			throws IOException,ServletException{
				
				PrintWriter out = response.getWriter();
				
				int idUsuario = Integer.parseInt(request.getParameter("idUsuario").trim());
				int idEndereco = Integer.parseInt(request.getParameter("idEndereco"));
				String nome = request.getParameter("nome");
				String email = request.getParameter("email");
				String login = request.getParameter("login");
				String senha = request.getParameter("senha");
				String telefone = request.getParameter("telefone");
				
				String rua = request.getParameter("Rua");
				String cidade = request.getParameter("cidade");
				String bairro = request.getParameter("bairro");
				String estado = request.getParameter("estado");
				String complemento=request.getParameter("complemento");
				int cep = Integer.parseInt(request.getParameter("cep").trim());
				
				Usuario usr = new Usuario();
				usr.setIdUsuario(idUsuario);
				usr.setEndereco(new Endereco());
				usr.getEndereco().setIdEndereco(idEndereco);
				usr.setNome(nome);
				usr.setEmail(email);
				usr.setLogin(login);
				usr.setSenha(senha);
				usr.setTelefone(telefone);
				usr.getEndereco().setRua(rua);
				usr.getEndereco().setCidade(cidade);
				usr.getEndereco().setBairro(bairro);
				usr.getEndereco().setEstado(estado);
				usr.getEndereco().setComplemento(complemento);
				usr.getEndereco().setCep(cep);
				
				UsuarioDAO dao = new UsuarioDAO();
				dao.altera(usr);
				
				
				out.println("<html>");
				out.println("<body>");
				out.println("Alteração Feita Com sucesso!");
				out.println("</body>");
				out.println("</html>");
				
}
}
	