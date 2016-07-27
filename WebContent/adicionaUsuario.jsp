<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adiciona Usuario</title>

<link rel="stylesheet" href="css/styleadiciona.css">

</head>
<script>
function validacaoEmail(){
	if(document.adicionauser.email.value==""	|| document.adicionauser.email.value.indexOf('@')==-1 || document.adicionauser.email.value.indexOf('.')==-1 ) { 
		alert( "Preencha campo E-MAIL corretamente!" ); 
		document.adicionauser.email.focus(); return false; }


	
}
function emails(){
	var email1 = document.adicionauser.email.value;
	var email2 = document.adicionauser.confirmaremail.value;
	
	if(email1==email2)
		alert("E-mail batem");
	else
		alert("E-mail não batem");
}
		
function validarSenha(){
	var senha1 = document.adicionauser.senha.value
	var senha2 = document.adicionauser.confirmarsenha.value
 
	if (senha1 == senha2)
		alert("Senhas Iguais")
	else
		alert("Senhas diferentes")
}
<!--CEPPPPPP-->
function getEndereco(cep) {
    if($.trim(cep) != ""){
        $("#loadingCep").html('Pesquisando...');
        $.getScript("http://cep.republicavirtual.com.br/web_cep.php?formato=javascript&cep="+cep, function(){            
            if (resultadoCEP["resultado"] != 0) {
            	 
                $("#cidade").val(unescape(resultadoCEP["cidade"]));
                $("#estado").val(unescape(resultadoCEP["uf"]));
                $("#rua").val(unescape(resultadoCEP["logradouro"]));
                $("#bairro").val(unescape(resultadoCEP["bairro"]));
            }else{
                $("#loadingCep").html(unescape(resultadoCEP["resultado_txt"]));                
            }            
        });
    }
    else{
        $("#loadingCep").html('Informe o CEP');
    }
}


		
	
	</script>
	

<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotipocolorido.png" width="600" />
<form action="adicionaUsuario" name="adicionauser" >
<label for="InsiraDados">Insira os Dados:	</label>
	<fieldset class="grupo">
			<div class="campo">
		
		<label for ="nome">Nome: </label> 
		<input type="text" name="nome" id="nome" size="50" /> 
	</div>
	</fieldset>
	<fieldset class="grupo">
	<div class="campo">
	<label for="email">E-mail:</label> 
	<input type="text" name="email" id="email" onchange="validacaoEmail()" size="50"/>	
	
	</div>
	
	<div class="campo">
	<label for="confirmaremail">Confirmar E-mail:</label> 
	<input type="text" name="confirmaremail" id="confirmaremail"  size="50" onchange = "emails()"/>	
	
	</div>
	</fieldset>
	
	<fieldset class="grupo">
	<div class="campo">
	<label for="login">login:</label>
	 <input type="text" name="login" id="login" />
	</div>
	
	<div class="campo">
	<label for="senha">senha:</label>
	<input type="password" name="senha" id="senha" />
	</div>
	
		<div class="campo">
	<label for="confirmarsenha">Confirmar senha:</label>
	<input type="password" name="confirmarsenha" id="confirmarsenha" onchange="validarSenha()" />
	</div>
	
	
	</fieldset>
	
	<fieldset class="grupo">
	<div class="campo">
	<label for="telefone">telefone: </label> 
	<input type="text" name="telefone" id="telefone"/>  (xx) xxxx-xxxx

	</div>
	
	</fieldset>
	<fieldset class="grupo">
		<div class="campo">
		<label for="cep">Cep: </label>
	<input type="text" name="cep" id="cep"  onblur="getEndereco(this.value);"/>
		
		
		
		</div>
	
	</fieldset>
	
	
	
	<fieldset class="grupo">
		<div class="campo">
	<label for="Endereco">Endereco: </label>
	<input type="text" name="rua" id="rua" size="60" />
		</div>
		
		
	<div class="campo">
	<label for="complemento">Complemento: </label>
	<input type="text" name="complemento" id="complemento" size="40"/>
	</div>	
	</fieldset>
	
	
	<fieldset class="grupo">
	
		<div class="campo">
	<label for="cidade">Cidade:</label> 
	<input type="text" name="cidade" id="cidade"/><br />
		</div>
		<div class="campo">
	<label for="bairro">Bairro:</label> 
	<input type="text" name="bairro" id="bairro" />
		</div>
		
		<div class="campo">
		<label for="estado">Estado</label>
	<select name="estado" id="estado">
	
	<option id=estado value="AC"> AC</option>
	<option id=estado value="AL"> AL</option>
	<option id=estado value="AM"> AM</option>
	<option id=estado value="AP"> AP</option>
	<option id=estado value="BA"> BA</option>
	<option id=estado value="CE"> CE</option>
	<option id=estado value="DF"> DF</option>
	<option id=estado value="ES"> ES</option>
	<option id=estado value="GO"> GO</option>
	<option id=estado value="MA"> MA</option>
	<option id=estado value="MG"> MG</option>
	<option id=estado value="MS"> MS</option>
	<option id=estado value="MT"> MT</option>
	<option id=estado value="PA"> PA</option>
	<option id=estado value="PB"> PB</option>
	<option id=estado value="PE"> PE</option>
	<option id=estado value="PI"> PI</option>
	<option id=estado value="PR"> PR</option>
	<option id=estado value="RJ"> RJ</option>
	<option id=estado value="RN"> RN</option>
	<option id=estado value="RS"> RS</option>
	<option id=estado value="RO"> RO</option>
	<option id=estado value="RR"> RR</option>
	<option id=estado value="SC"> SC</option>
	<option id=estado value="SE"> SE</option>
	<option id=estado value="SP"> SP</option>
	<option id=estado value="TO"> TO </option>
	
	</select>
	</div>
	
	</fieldset>
	<input type="submit" name="Cadastrar" class="botao submit" />		<br />
	
	
	</form>
		<script type="text/javascript" src="jquery.js">	
	</script>
</body>
</html>