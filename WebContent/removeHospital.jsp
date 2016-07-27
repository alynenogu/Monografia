<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Remove Hospital</title>
<link rel="stylesheet" href="css/styleadiciona.css">
</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
	<form action="excluirhospital" >
		<fieldset class="grupo">
		<div class="campo">
		<label for="idhospital">Id Estabelecimento:</label> 
		<input type="text" name="idEstabelecimento" value="<%=request.getParameter("idEstabelecimento") %>" readonly="true" /> 
		</div>
		<div class="campo">
		<label for="nome">Nome:</label> 
		<input type="text" name="nomeEstabelecimento" value="<%=request.getParameter("nomeEstabelecimento") %>" readonly="true"/> 		
		</div>
		</fieldset>
		Excluir?
		<input type="submit" Value="sim" class="botao submit"/>		<br />
	
	
	</form>

</body>
</html>