<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page
	import="java.util.*,br.com.projeto.Servlet.*,br.com.projeto.DAO.*,br.com.projeto.modelo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Comentario</title>
<link rel="stylesheet" href="css/styleadiciona.css">
</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />

<form action="alteracomentarioUsuario" name="teste">

	<fieldset class="grupo">
			<div class="campo">
			<label for="idComentario">Id Comentário:</label>
			<input type="text" name="idComentario"
			value="<%=request.getParameter("idComentario")%>" readonly="true" /> 
			</div>
			</fieldset>
			

	<!-- Combo box do NOME Hospital --> 
		<fieldset class="grupo">
		<div class="campo">
		<label for="NomeHospital">Nome Estabelecimento: </label><select name="nomeEstabelecimento" id="nomeEstabelecimento" onchange="adiciona()">

		<%
				
				ComentarioDAO dao = new ComentarioDAO();
				List<tipo_de_estabelecimento> estabelecimentos = dao.getListaEstabelecimento();
				for(tipo_de_estabelecimento tipo_de_estabelecimento:estabelecimentos){
			%>
			
			<option id="<%=tipo_de_estabelecimento.getNomeEstabelecimento()%>" value="<%=tipo_de_estabelecimento.getNomeEstabelecimento()%>"><%=tipo_de_estabelecimento.getNomeEstabelecimento()%></option>

			<%
				}
			%>
		</select>
		</div>
		</fieldset>
		
		<!-- ----Combo Box referente ao nome da categoria-->
				<fieldset class="grupo">
		<div class="campo">
		<!-- Combo box do NOME  Categoria  --> 
	<label for="NomeCategoria">	Nome Categoria: </label> <select name="nomecategoria" id="nomecategoria"  onchange ="adicionaCategoria()">

			<%
				
				List<Categoria> categorias = dao.getlistacategoria();
							
						for(Categoria categoria:categorias){
			%>

			<option id="<%=categoria.getNomecategoria()%>" value="<%=categoria.getNomecategoria()%>"><%=categoria.getNomecategoria()%></option>

			<%
				}
			%>
		</select>
		</div>
		</fieldset>
		
			<!-- Texto Comentario -->
		<fieldset class="grupo">
		<div class="campo">
		<label for ="texto">Texto:</label>
		<TEXTAREA name="textoComentario" ROWS=6 COLS=40 ><%=request.getParameter("textoComentario") %></TEXTAREA>
		</div>
		</fieldset>
		<!-- ------- -->
				<!-- ----------------------------------------------------------------------- -->
		<!-- Script do metodo adiciona -->
			<!-- Script do metodo adiciona -->
		<script>
			function adiciona() {
				var nomeEstabelecimento = $("#nomeEstabelecimento").find(":selected").text();
				
				$.get("buscaidHospital?nomeEstabelecimento="+nomeEstabelecimento,function(resultado){
					$("#idEstabelecimento").attr("value", resultado);
				});

			}
			</script>
		
		<script>
		function adicionaCategoria() {
			
				var nomecategoria = $("#nomecategoria").find(":selected").text();
				
				$.get("buscaidcategoria?nomecategoria="+nomecategoria,function(resultado){
					$("#idcategoria").attr("value", resultado);
				});

			
			}
		</script>
		<!-- ----------------------------------- -->
		<fieldset class="grupo">
			<div class="campo">
			<!-- <label for="idUsuario">Id Usuario:</label> -->
			<input type="text" name="idUsuario"
			value="<%=request.getParameter("idUsuario")%>"  style="display:none"/> 
			</div>
			</fieldset>
			
		
		<fieldset class="grupo">
			<div class="campo">
			<!-- <label for="idEstabelecimento">Id Hospital:</label> -->
			<input type="text" name="idEstabelecimento" id="idEstabelecimento"  value="<%=request.getParameter("idHospital") %>" style="display:none"  />
			</div>
			</fieldset>
			
			<fieldset class="grupo">
			<div class="campo">
			<!-- <label for="idCategoria">Id Categoria: </label> -->
			<input type="text" name="idcategoria" id="idcategoria" value="<%=request.getParameter("idcategoria") %>" style="display:none" /> 
			</div>
			</fieldset>
			<input type="submit" name="Adicionar" class="botao submit"/> <br />

</form>
<script type="text/javascript" src="jquery.js">
		
	</script>
</body>
</html>