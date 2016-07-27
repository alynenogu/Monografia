package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.DAO.CategoriaDAO;
import br.com.projeto.DAO.tipo_de_estabelecimentoDAO;
import br.com.projeto.modelo.Categoria;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.tipo_de_estabelecimento;

@WebServlet("/alteraCategoria")

public class AlteraDadosCategoria extends HttpServlet {
	
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		PrintWriter out = response.getWriter();
		int idcategoria =Integer.parseInt(request.getParameter("idcategoria").trim());
		String nomecategoria = request.getParameter("nomecategoria");
		String descricaoCategoria = request.getParameter("descricaoCategoria");
	
		Categoria ctg = new Categoria();
		ctg.setIdcategoria(idcategoria);
		ctg.setNomecategoria(nomecategoria);
		ctg.setDescricaoCategoria(descricaoCategoria);
		
		CategoriaDAO dao = new CategoriaDAO();
		dao.alteraCategoria(ctg);
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("Alteração Feita Com sucesso!");
		out.println("</body>");
		out.println("</html>");
		
		


}
}