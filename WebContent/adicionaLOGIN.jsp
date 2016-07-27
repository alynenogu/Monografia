<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Adiciona Conta </title>
	<link rel="stylesheet" href="css/styleadiciona.css">
<style type ="text/css">
@import url(https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,800italic,800,700,700italic,600italic,600);

</style>

<script>
function validarSenha(){
	senha1 = document.adicionalogin.senha.value
	senha2 = document.adicionalogin.confirmarsenha.value
 
	if (senha1 == senha2)
		alert("Senhas Iguais")
	else
		alert("Senhas diferentes")
}
function validacaoEmail(){
	if(document.adicionalogin.email.value==""	|| document.adicionalogin.email.value.indexOf('@')==-1 || document.adicionalogin.email.value.indexOf('.')==-1 ) { 
		alert( "Preencha campo E-MAIL corretamente!" ); 
		document.adicionalogin.email.focus(); return false; }


	
}
</script>

</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
	<form action="adicionalogin" name="adicionalogin">
	Insira seus Dados:	<br />
	
	<fieldset class="grupo">
	<div class="campo">
	<label for="login">Login:</label> 
	<input type="text" name="login" />
	</div> 
	</fieldset>
	
	<fieldset class="grupo"> 
	<div class="campo">
	<label for="senha">Senha:</label> 
	<input type="password" name="senha" />	
	</div>
		<div class="campo">
	<label for="confirmarsenha">Confirmar senha:</label> 
	<input type="password" name="confirmarsenha" onchange="validarSenha()" />	
	</div>
	</fieldset>
	
	<fieldset class="grupo">
	<div class="campo">
	<label for="email">E-mail:</label> 
	<input type="text" name="email" onchange="validacaoEmail()" />
	</div>		
	</fieldset>
	
	<input type="submit" name="Cadastrar" class="botao submit"/>		<br />
	
	
	</form>

</body>
</html>