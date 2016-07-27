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
		TipoDAO dao = new TipoDAO();
		List<Tipo> tipos = dao.getLista();
		for (Tipo tipo:tipos){

		%>
			<tr>
		<th>Id Tipo:</th>
		<th>Nome do Tipo:</th>
		<th>Descrição do Tipo: </th>
		</tr>
		
		
		
		<tr>
			
				<td><%=tipo.getIdTipo() %></td>
			
				<td><a href="RemoveTipo.jsp?idTipo=<%=tipo.getIdTipo()%>&nometipo=<%=tipo.getNometipo()%>"><%=tipo.getNometipo() %></a> </td>
				
			
				<td> <%=tipo.getDescricaotipo() %></td>
	

		</tr>
				<%
				}
					%>

	</table>

</body>
</html>