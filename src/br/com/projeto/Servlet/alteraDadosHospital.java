package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.tipo_de_estabelecimentoDAO;
import br.com.projeto.DAO.UsuarioDAO;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.Tipo;
import br.com.projeto.modelo.tipo_de_estabelecimento;
import br.com.projeto.modelo.Usuario;



@WebServlet("/alteraDadosHospital")
public class alteraDadosHospital extends HttpServlet{
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
	
		PrintWriter out = response.getWriter();
		int idEstabelecimento =Integer.parseInt(request.getParameter("idEstabelecimento").trim());
		int idEndereco = Integer.parseInt(request.getParameter("idEndereco"));
		String nomeEstabelecimento = request.getParameter("nomeEstabelecimento");
		String descricaoEstabelecimento = request.getParameter("descricaoEstabelecimento");
		String nomeFantasia = request.getParameter("nomeFantasia");
		String nomeTipo = request.getParameter("nomeTipo");
		int idTipo = Integer.parseInt(request.getParameter("idTipo").trim());
		String rua = request.getParameter("Rua");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String estado = request.getParameter("estado");
		String complemento=request.getParameter("complemento");
		int cep = Integer.parseInt(request.getParameter("cep").trim());
		
		tipo_de_estabelecimento hsp = new tipo_de_estabelecimento();
		hsp.setIdEstabelecimento(idEstabelecimento);
		hsp.setEndereco(new Endereco());
		hsp.getEndereco().setIdEndereco(idEndereco);
		hsp.setNomeEstabelecimento(nomeEstabelecimento);
		hsp.setDescricaoEstabelecimento(descricaoEstabelecimento);
		hsp.setNomeFantasia(nomeFantasia);
		hsp.setNomeTipo(nomeTipo);
		
		hsp.getEndereco().setRua(rua);
		hsp.getEndereco().setCidade(cidade);
		hsp.getEndereco().setBairro(bairro);
		hsp.getEndereco().setEstado(estado);
		hsp.getEndereco().setComplemento(complemento);
		hsp.getEndereco().setCep(cep);
		
		hsp.setTipo(new Tipo());
		hsp.getTipo().setIdTipo(idTipo);
		
		tipo_de_estabelecimentoDAO dao = new tipo_de_estabelecimentoDAO();
		dao.alteraEstabelecimento(hsp);
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("Alteração Feita Com sucesso!");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
	}

}
