<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Categoria</title>
<link rel="stylesheet" href="css/styleadiciona.css">
</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
		<form action="alteraCategoria">
		<fieldset class="grupo">
		<div class="campo">
		<label for="idCategoria">Id Categoria:</label> 
		<input type="text" name="idcategoria" value="<%=request.getParameter("idcategoria") %>" readonly="true"/> 
		</div>
		
		<div class="campo">
		<label for="nomeCategoria">Nome Categoria:</label> 
		<input type="text" name="nomecategoria" value="<%=request.getParameter("nomecategoria") %>" /> 
		</div>
		</fieldset>
		
		<div class="campo">
		<label for="descricaoCategoria">Descrição Categoria </label> 
		</div>
		<fieldset class="grupo">
		
		<TEXTAREA  name="descricaoCategoria"   ROWS=6 COLS=40 class="estilotextarea" >  <%=request.getParameter("descricaoCategoria") %></TEXTAREA><br />
		
		</fieldset>
			<input type="submit" name="Alterar" class="botao submit" />		<br />
		
		</form>

</body>
</html>