<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*,br.com.projeto.Servlet.*,br.com.projeto.DAO.*,br.com.projeto.modelo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Altera Hospital</title>
<link rel="stylesheet" href="css/styleadiciona.css">
</head>
<script>
<!--CEPPPPPP-->
function getEndereco(cep) {
    if($.trim(cep) != ""){
        $("#loadingCep").html('Pesquisando...');
        $.getScript("http://cep.republicavirtual.com.br/web_cep.php?formato=javascript&cep="+cep, function(){            
            if (resultadoCEP["resultado"] != 0) {
            	 
                $("#cidade").val(unescape(resultadoCEP["cidade"]));
                $("#estado").val(unescape(resultadoCEP["uf"]));
                $("#Rua").val(unescape(resultadoCEP["logradouro"]));
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
	<!-- Script do metodo adiciona -->
		
		
		<script>
		function adicionaTipo() {
			
				var nomeTipo = $("#nomeTipo").find(":selected").text();
				
				$.get("buscaidtipo?nomeTipo="+nomeTipo,function(resultado){
					$("#idTipo").attr("value", resultado);
				});

			
			}
		</script>

<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
	<form action="alteraDadosHospital" >
		<label for="alteradados">Altera dados :</label>
		
		<fieldset class="grupo"> 
		
		<div class="campo">
		<label for="IdEstabelecimento">Id Estabelecimento:</label>
		<input type="text" name="idEstabelecimento" value="<%=request.getParameter("idEstabelecimento") %>" readonly="true" />
		</div>
		
		
		
		</fieldset>
		
		<fieldset class="grupo">
		<div class="campo">
		<label for="nomeEstabelecimento">Nome Estabelecimento:</label> 
		<input type="text" name ="nomeEstabelecimento" value="<%=request.getParameter("nomeEstabelecimento") %>" size="50" /> 
		</div>
		</fieldset>
		
		<fieldset class="grupo">
		<div class="campo">
		<label for="sobre">Sobre:</label> 
		<TEXTAREA  name="descricaoEstabelecimento"   ROWS=6 COLS=40  class="estilotextarea">  <%=request.getParameter("descricaoEstabelecimento") %></TEXTAREA>
		</div>
	</fieldset>
	
	<fieldset class="grupo">
		<div class="campo">
		<label for="nomefantasia">Nome Fantasia:</label> 
		<input type="text" name="nomeFantasia" value="<%=request.getParameter("nomeFantasia") %>" />  
		</div>
	
	
	</fieldset>


	<fieldset class="grupo">
			<div class="campo">
		<label for="nomeTipo">Tipo: </label><select name="nomeTipo" id="nomeTipo" onchange="adicionaTipo()" >

			<%
				
				tipo_de_estabelecimentoDAO dao = new tipo_de_estabelecimentoDAO();
				List<Tipo> tipos = dao.getlistatipo();
				for(Tipo tipo:tipos){
			%>

			<option id="<%=tipo.getNometipo()%>" value="<%=tipo.getNometipo()%>"><%=tipo.getNometipo()%></option>

			<%
				}
			%>
		</select>
		</div>	
	</fieldset>
		<fieldset class="grupo">
			<div class="campo">
			 <label for="idTipo">Id Tipo:</label> 
			<input type="text" name="idTipo" id="idTipo" value="<%=request.getParameter("idTipo") %>"/> 
			</div>
			</fieldset>
		<fieldset class="grupo">
		<div class="campo">
		<label for="cep">Cep: </label>
	<input type="text" name="cep" id="cep"  onblur="getEndereco(this.value);" value="<%=request.getParameter("cep") %>"/>
		
		
		
		</div>
	
	</fieldset>
	
	
	
	
		<fieldset class="grupo">
		<div class="campo">
	  	<label for="Rua">Rua:</label> 
	  	<input type="text" name="Rua" id="Rua" value="<%=request.getParameter("Rua") %>" size="50"/>  
		
		</div>
		<div class="campo">
		<label for="complemento">Complemento:</label> 
		<input type="text" id="complemento" name="complemento" value="<%=request.getParameter("complemento") %>" size="40"/>
		</div>
		
		</fieldset>
		
		<fieldset class="grupo">
		<div class="campo">
		<label for="Bairro">Bairro: </label>
		<input type="text" id="bairro" name="bairro" value="<%=request.getParameter("bairro") %>" />
	</div>
		
		
		<div class="campo">
		<label for="Cidade">Cidade:</label> 
		<input type="text" id="cidade" name="cidade" value="<%=request.getParameter("cidade") %>" />  
	</div>
		
		
		
			<div class="campo">
					<label for="estado">Estado</label>
				<select name="estado" id="estado" value="<%=request.getParameter("estado") %>">
			<option id=estado><%=request.getParameter("estado") %></option>
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
	
	
		<fieldset class="grupo">	
		
		<div class="campo">
		<label for="IdEndereco">Id Endereço:</label>
		<input type="text" name="idEndereco" value="<%=request.getParameter("idEndereco") %>" readonly="true"  /> <br />
		</div>
		</fieldset>
		
			
		<input type="submit" name="Alterar" class="botao submit" />		<br />
</form>
<script type="text/javascript" src="jquery.js">	
	</script>
</body>
</html>