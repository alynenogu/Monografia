<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import = "java.util.*,br.com.projeto.Servlet.*,br.com.projeto.DAO.*,br.com.projeto.modelo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista Categoria Altera</title>
<link rel="stylesheet" href="css/styletable.css">
</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
	<table>
			<%
		CategoriaDAO dao = new CategoriaDAO();
		List<Categoria> categorias = dao.getLista();
		for (Categoria categoria:categorias){

		%>
				<tr>
				<th>Id Categoria:</th>
				<th>Nome categoria:</th>
				<th>Descrição Categoria:</th>
		
				</tr>
				
				
		
		
		
		<tr>
			
				<td><%=categoria.getIdcategoria() %></td>
			
				<td><a href="AlteraCategoria.jsp?idcategoria=<%=categoria.getIdcategoria()%> &nomecategoria=<%=categoria.getNomecategoria()%> &descricaoCategoria=<%=categoria.getDescricaoCategoria()%>"><%=categoria.getNomecategoria() %> </a> </td>
				
			
				<td> <%=categoria.getDescricaoCategoria() %></td>
	

		</tr>
				<%
				}
					%>

	</table>

</body>
</html>