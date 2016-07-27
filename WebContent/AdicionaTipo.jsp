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
<img src="<%=request.getContextPath()%>/html/imagens/logotipocolorido.png" width="600" />
<form action="adicionaTipo" method="post">
			<label for ="AdicionaTipo">Adicione um Tipo de Hospital:</label>
			
			<fieldset class="grupo">
			<div class="campo">
			<label for="nometipo">Nome:</label> 
			<input type="text" name="nometipo" />
			</div>
			</fieldset>
			
			<fieldset class="grupo">
			<div class="campo">
			<label for="descricao">Descrição :</label> 
			 <TEXTAREA name="descricaotipo" ROWS=6 COLS=40 class="estilotextarea"></TEXTAREA><br /> 
			 </div>
			 </fieldset>
			 <input type="submit" name="Cadastrar" class="botao submit" /> <br />
	
	
	
	</form>


</body>
</html>