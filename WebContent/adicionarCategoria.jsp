<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar Categoria</title>
<link rel="stylesheet" href="css/styleadiciona.css">
</head>
<body>
	<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
	
	<form action="adicionaCategoria" method="post">
			<label for ="AdicionaCategoria">Adicione uma categoria:</label>
			
			<fieldset class="grupo">
			<div class="campo">
			<label for="nomeCategoria">Nome Categoria:</label> 
			<input type="text" name="nomecategoria" />
			</div>
			</fieldset>
			
			<fieldset class="grupo">
			<div class="campo">
			<label for="descricao">Descrição :</label> 
			 <TEXTAREA name="descricaoCategoria" ROWS=6 COLS=40 class="estilotextarea"></TEXTAREA><br /> 
			 </div>
			 </fieldset>
			 <input type="submit" name="Cadastrar" class="botao submit" /> <br />
	
	
	
	</form>

</body>
</html>