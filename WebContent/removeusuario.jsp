<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Excluir Usuário</title>
<link rel="stylesheet" href="css/styleadiciona.css">
</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
      
		<form action="excluiUsuario" method="post">
		 <label for="Excluir Usuario"> Excluir Usuário?</label>
		 
		<fieldset class="grupo">
		<div class="campo">
		<label for="idUsuario">Id Usuario</label> 
		<input type="text" name="idUsuario" value="<%=request.getParameter("idUsuario") %>" readonly="true"/>
		</div>
		<div class="campo">
		<label for="Nome:">Nome:</label> 
		<input type="text" name="nome" value="<%=request.getParameter("nome") %>" readonly="true"/> <br />		
		</div>
		</fieldset>
		Excluir?
		<input type="submit" Value="sim" class="botao submit"/>		<br />
		
		
		</form>

</body>
</html>