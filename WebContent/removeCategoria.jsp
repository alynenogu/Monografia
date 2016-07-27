<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Remove Categoria:</title>
<link rel="stylesheet" href="css/styleadiciona.css">
</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
		<form action="excluirCategoria" >
		<fieldset class="grupo">
		<div class="campo">
		<label for="idcategoria">Id Categoria  </label>
		<input type="text" name="idcategoria" value="<%=request.getParameter("idcategoria") %>" readonly="true" />
		</div>
		
		<div class="campo">
		<label for="nomeCategoria">Nome Categoria:</label> 
		<input type="text" name="nomecategoria" value="<%=request.getParameter("nomecategoria") %>" readonly="true" /> 	
		</div>
		</fieldset>
		
		Excluir?
		<input type="submit" Value="sim" class="botao submit" />		
	
	
	</form>
	
</body>
</html>