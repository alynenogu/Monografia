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
		<form action="excluirTipo" >
		<fieldset class="grupo">
		<div class="campo">
		<label for="idTipo">Id Tipo  </label>
		<input type="text" name="idTipo" value="<%=request.getParameter("idTipo") %>" readonly="true" />
		</div>
		
		<div class="campo">
		<label for="nometipo">Nome Tipo:</label> 
		<input type="text" name="nometipo" value="<%=request.getParameter("nometipo") %>" readonly="true" /> 	
		</div>
		</fieldset>
		
		Excluir?
		<input type="submit" Value="sim" class="botao submit" />		
	
	
	</form>
	

</body>
</html>