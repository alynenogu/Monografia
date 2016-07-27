<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Login</title>
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="css/style.css">

</head>
<body>
		<div id="login" class="bradius">
		<div class="logo"><img src ="css/imagens/logotiponovo.png" alt="" title="" /></div>
			<div class="acomodar">
			<form action="ValidaLogin" method="post"  >
				Login:<input type="text" name="login" class="txt bradius" required="true" />  <br/>
				<br />
				Senha: <input type="password" name="senha" class="txt bradius " required = "true "/> <br />
				<br />
				<input type="submit" name="Entrar" class="sb"/>		<br />
				<a href="adicionaLOGIN.jsp">Cadastre-se</a>
 			
			
			
			</form>
			</div>
			</div>

</body>
</html>