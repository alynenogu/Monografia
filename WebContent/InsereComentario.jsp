<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.*,br.com.projeto.Servlet.*,br.com.projeto.DAO.*,br.com.projeto.modelo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar Comentario</title>
<link rel="stylesheet" href="css/styleadiciona.css">
</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />

	<form action="adicionaComentarioUsuario" name="teste">
			
	<label for="inserirComentario">	Inserir Comentario:</label>

		
		
		<!-- Combo box do NOME Hospital --> 
		<fieldset class="grupo">
		<div class="campo">
		<label for="NomeEstabelecimento">Nome Estabelecimento: </label><select name="nomeEstabelecimento" id="nomeEstabelecimento" onchange="adiciona()">

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
		<TEXTAREA name="textoComentario" ROWS=6 COLS=40 ></TEXTAREA>
		</div>
		</fieldset>
			

		<!-- ----------------------------------------------------------------------- -->
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
		<!-- ------------------------ -->
		
			<fieldset class="grupo">
			<div class="campo">
			<label for="idUsuario">Id Usuario:</label>
			<input type="text" name="idUsuario"
			value="<%=request.getParameter("idUsuario")%>" /> 
			</div>
			</fieldset>
			
			<!-- IdHospital que vai ser preenchido au -->
			<fieldset class="grupo">
			<div class="campo">
			<label for="idEstabelecimento">Id Hospital:</label>
			<input type="text" name="idEstabelecimento" id="idEstabelecimento"  />
			</div>
			</fieldset>
			
			<fieldset class="grupo">
			<div class="campo">
			<label for="idCategoria">Id Categoria: </label>
			<input type="text" name="idcategoria" id="idcategoria"  /> 
			</div>
			</fieldset>
		<input type="submit" name="Adicionar" class="botao submit"/> <br />

	</form>
	<script type="text/javascript" src="jquery.js">
		
	</script>
</body>
</html>