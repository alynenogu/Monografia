package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.EnderecoDAO;
import br.com.projeto.DAO.tipo_de_estabelecimentoDAO;
import br.com.projeto.DAO.UsuarioDAO;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.Tipo;
import br.com.projeto.modelo.Usuario;
import br.com.projeto.modelo.tipo_de_estabelecimento;


@WebServlet("/adicionaHospital")
public class adicionaHospitalServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException{
		
		PrintWriter out = response.getWriter();
		String nomeEstabelecimento = request.getParameter("nomeEstabelecimento");
		String descricaoEstabelecimento = request.getParameter("descricaoEstabelecimento");
		String nomeFantasia = request.getParameter("nomeFantasia");
		String nomeTipo = request.getParameter("nomeTipo");
		
		String rua = request.getParameter("rua");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String estado = request.getParameter("estado");
		String complemento=request.getParameter("complemento");
		int cep = Integer.parseInt(request.getParameter("cep").trim());
		int idTipo = Integer.parseInt(request.getParameter("idTipo").trim());
		
		
		Endereco end = new Endereco();
		tipo_de_estabelecimento hsp = new tipo_de_estabelecimento();
		
		hsp.setNomeEstabelecimento(nomeEstabelecimento);
		hsp.setDescricaoEstabelecimento(descricaoEstabelecimento);
		hsp.setNomeFantasia(nomeFantasia);
		hsp.setNomeTipo(nomeTipo);
		end.setRua(rua);
		end.setCidade(cidade);
		end.setBairro(bairro);
		end.setEstado(estado);
		end.setComplemento(complemento);
		end.setCep(cep);
		hsp.setTipo(new Tipo());
		hsp.getTipo().setIdTipo(idTipo);
		
		hsp.setEndereco(end);
	
		EnderecoDAO dao1 = new EnderecoDAO();
		dao1.inserirEndereco(end);
		tipo_de_estabelecimentoDAO dao = new tipo_de_estabelecimentoDAO();
		dao.insereEstabelecimento(hsp);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Cadastro Feito Com sucesso!");
		out.println("</body>");
		out.println("</html>");
	
		
		
		
	}
	

}
