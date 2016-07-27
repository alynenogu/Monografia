<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page import = "java.util.*,br.com.projeto.Servlet.*,br.com.projeto.DAO.*,br.com.projeto.modelo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logins</title>
<link rel="stylesheet" href="css/styletable.css">
</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
<table>
		

	<%
				LoginDAO dao = new LoginDAO();
				String logintexto = request.getParameter("login");
				String senha = request.getParameter("senha");
				List<Login> lgs= dao.getLista(logintexto,senha);
				for(Login login:lgs){
				%>
			<tr>
			<th>id:</th>
			<th>Login:</th>
			<th>Senha:</th>
			<th>E-mail:</th>
			</tr>
			<tr>
			<td><a href="AlteraLogin.jsp?idlogin=<%=login.getIdLogin()%> &login=<%=login.getLogin()%> &senha=<%=login.getSenha()%> &email=<%=login.getEmail()%>"><%=login.getIdLogin() %></a></td>	
			<td><%=login.getLogin() %></td>	
			<td><%=login.getSenha() %></td>	
			<td><%=login.getEmail() %></td>
			
			<%} %>
</table>
</body>
</html>