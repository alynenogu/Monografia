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
				List<Usuario> usuarios = dao.getLista();
				for(Usuario usuario:usuarios){
				%>
				<tr>
				<th> Id Usuário</th>
				<th>Nome</th>
				</tr>
				
					<tr>
				
					<td><a href="listaUsuarioComentarioEsp.jsp?idUsuario=<%=usuario.getIdUsuario()%>"><%=usuario.getIdUsuario() %></a></td>
					<td><%=usuario.getNome() %></td>
					
					</tr>
					<%
				}
					%>
			
			</table>




</body>
</html>