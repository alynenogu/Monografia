<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*,br.com.projeto.Servlet.*,br.com.projeto.DAO.*,br.com.projeto.modelo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/styletable.css">
</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
<table>
				<%
				ComentarioDAO dao = new ComentarioDAO();
				int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
				 List<Comentario> comentarios = dao.getlistaComentarioEsp(idUsuario);
				for(Comentario comentario:comentarios){
				%>
				<tr>
				<th>id Comentario</th>
				<th> Nome Hospital </th>
				<th> Nome categoria </th>
				<th> Comentario </th>
				<th> id Usuário </th>
				<th> Id categoria </th>
				<th>Id Hospital</th>
				<th> Data </th>
				
				<tr>
				<td><a href="RemoveComentario.jsp?idComentario=<%=comentario.getIdComentario() %> &nomeEstabelecimento=<%=comentario.getNomeEstabelecimento()%> &nomecategoria=<%=comentario.getNomecategoria()%> &textoComentario=<%=comentario.getTextoComentario()%> &idUsuario=<%=comentario.getUsuario().getIdUsuario()%> &idEstabelecimento=<%=comentario.getHospital().getIdEstabelecimento()%> &idcategoria=<%=comentario.getCategoria().getIdcategoria()%>"><%=comentario.getIdComentario() %></a></td>
				<td><%=comentario.getNomeEstabelecimento() %></td>
				<td><%=comentario.getNomecategoria() %></td>
				<td><%=comentario.getTextoComentario() %></td>
				<td> <%=comentario.getUsuario().getIdUsuario() %></td>
				<td><%=comentario.getCategoria().getIdcategoria() %></td>
				<td><%=comentario.getHospital().getIdEstabelecimento() %></td>
				<td><%=comentario.getDataComentario().getTime() %></td>
				</tr>

				<%} %>

</table>


</body>
</html>