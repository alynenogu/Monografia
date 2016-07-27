<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import = "java.util.*,br.com.projeto.Servlet.*,br.com.projeto.DAO.*,br.com.projeto.modelo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listar Usuarios</title>
<link rel="stylesheet" href="css/styletable.css">
</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
			<table>
				<%
				UsuarioDAO dao = new UsuarioDAO();
				List<Usuario> usuarios = dao.getLista();
				for(Usuario usuario:usuarios){
				%>
				<tr>
				<th>Nome:</th>
				<th>E-mail:</th>
				<th>Login:</th>
				<th>Senha:</th>
				<th>Telefone:</th>
				<th>Rua:</th>
				<th>Cidade:</th>
				<th>Bairro:</th>
				<th>Estado:</th>
				<th>Complemento:</th>
				<th>Cep:</th>
				</tr>
					<tr>
					
				<td><%=usuario.getNome() %></td>
					
					<td><%=usuario.getEmail() %></td>
					
					<td><%=usuario.getLogin() %></td>
				
					<td><%=usuario.getSenha() %></td>
				
					<td><%=usuario.getTelefone() %></td>
				
					<td><%=usuario.getEndereco().getRua() %></td>
					
					<td><%=usuario.getEndereco().getCidade() %></td>
					
					<td><%=usuario.getEndereco().getBairro() %></td>
					
					<td><%=usuario.getEndereco().getEstado() %></td>
					
					<td><%=usuario.getEndereco().getComplemento() %></td>
					
					<td><%=usuario.getEndereco().getCep() %></td>
					</tr>
					<%
				}
					%>
			
			</table>

</body>
</html>