<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Altera Login:</title>
<link rel="stylesheet" href="css/styleadiciona.css">
<script>
function validarSenha(){
	senha1 = document.alteralogin.senha.value
	senha2 = document.alteralogin.confirmarsenha.value
 
	if (senha1 == senha2)
		alert("Senhas Iguais")
	else
		alert("Senhas diferentes")
}
function validacaoEmail(){
	if(document.alteralogin.email.value==""	|| document.alteralogin.email.value.indexOf('@')==-1 || document.alteralogin.email.value.indexOf('.')==-1 ) { 
		alert( "Preencha campo E-MAIL corretamente!" ); 
		document.alteralogin.email.focus(); return false; }


	
}
</script>
</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
	<form action="alteralogin" name="alteralogin">
	Insira seus Dados:	<br />
	

	
	<fieldset class="grupo">
	<div class="campo">
	<label for="idlogin">Id Login:</label> 
	<input type="text" name="idlogin" value="<%=request.getParameter("idlogin") %>"  readonly="true"/>
	</div>
	<div class="campo">
	<label for="login">Login:</label> 
	<input type="text" name="login" value="<%=request.getParameter("login") %>" />
	</div> 
	</fieldset>
	
	<fieldset class="grupo"> 
	<div class="campo">
	<label for="senha">Senha:</label> 
	<input type="text" name="senha" value="<%=request.getParameter("senha") %>" />	
	</div>
		<div class="campo">
	<label for="confirmarsenha">Confirmar senha:</label> 
	<input type="password" name="confirmarsenha" onchange="validarSenha()" />	
	</div>
	</fieldset>
	
	<fieldset class="grupo">
	<div class="campo">
	<label for="email">E-mail:</label> 
	<input type="text" name="email"  onchange="validacaoEmail()" value="<%=request.getParameter("email") %>"/>
	</div>		
	</fieldset>
	
	<input type="submit" name="Cadastrar" class="botao submit"/>		<br />
	
	
	</form>

</body>
</html>