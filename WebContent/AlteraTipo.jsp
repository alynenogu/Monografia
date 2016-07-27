<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/styleadiciona.css">
</head>
<body>
	<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
		<form action="alteraTipo">
		<fieldset class="grupo">
		<div class="campo">
		<label for="idTipo">Id Tipo:</label> 
		<input type="text" name="idTipo" value="<%=request.getParameter("idTipo") %>" readonly="true"/> 
		</div>
		
		<div class="campo">
		<label for="nomeTipo">Nome Tipo:</label> 
		<input type="text" name="nometipo" value="<%=request.getParameter("nometipo") %>" /> 
		</div>
		</fieldset>
		
		<div class="campo">
		<label for="descricaotipo">Descrição tipo </label> 
		</div>
		<fieldset class="grupo">
		
		<TEXTAREA  name="descricaotipo"   ROWS=6 COLS=40 class="estilotextarea" >  <%=request.getParameter("descricaotipo") %></TEXTAREA><br />
		
		</fieldset>
			<input type="submit" name="Alterar" class="botao submit" />		<br />
		
		</form>
	

</body>
</html>