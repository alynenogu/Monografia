<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bem vindo</title>
<link rel="stylesheet" href="css/stylepg.css">
</head>
<body>

<img src="<%=request.getContextPath()%>/html/imagens/logotipocolorido.png" width="600" />
		<ul class="menu">
		<li><a href='#'>Usuario</a>
				<ul>
				<li><a href='adicionaUsuario.jsp'>Insere Usuario</a></li>
				<li><a href='listarUsuarioAltera.jsp'>Altera Usuário</a></li>
				<li><a href='listaUsuarioExclui.jsp'>Exclui Usuário</a></li>
				<li><a href='listarUsuario.jsp'>Listar Usuarios</a></li>
				</ul>
		
		</li>
		
			<li><a href='#'>Hospital</a>
				<ul>
				<li><a href='adicionaHospital.jsp'>Insere Hospital</a></li>
				<li><a href='listaHospitalAltera.jsp'>Altera Hospital</a></li>
				<li><a href='listahospitalremove.jsp'>Exclui Hospital</a></li>
				<li><a href='listaHospital.jsp'>Listar Hospital</a></li>
				</ul>
		
		</li>
		
			<li><a href='#'>Comentario</a>
				<ul>
				<li><a href='listaComentarioUsuario.jsp'>Insere Comentario</a></li>
				<li><a href='ListaComentarioUsuarioAltera.jsp'>Altera Comentario</a></li>
				<li><a href='listaUsComentarioExcluir.jsp'>Exclui Comentario</a></li>
				<li><a href='listaUsuarioComentario.jsp'>Listar Comentarios</a></li>
				</ul>
		
		</li>
		
			<li><a href='#'>Categoria Comentario</a>
				<ul>
				<li><a href='adicionarCategoria.jsp'>Insere Categoria</a></li>
				<li><a href='ListaCategoriaAltera.jsp'>Altera Categoria</a></li>
				<li><a href='ListaCategoriaRemove.jsp'>Exclui Categoria</a></li>
				<li><a href='listaCategoria.jsp'>Listar Categoria</a></li>
				</ul>
		
		</li>
		
			<li><a href='#'>Tipo Hospital</a>
				<ul>
				<li><a href='AdicionaTipo.jsp'>Insere Tipo</a></li>
				<li><a href='listaTipoAltera.jsp'>Altera Tipo</a></li>
				<li><a href='listaTipoRemove.jsp'>Exclui Tipo</a></li>
				<li><a href='listaTipo.jsp'>Listar Tipo</a></li>
				</ul>
		
		</li>
		
		
			<li><a href='#'>Login Sistema</a>
				<ul>
				<li><a href='adicionaLOGIN.jsp'>Insere Login</a></li>
				<li><a href='listaLogins.jsp?login=<%=request.getParameter("login")%>&senha=<%=request.getParameter("senha")%> '>Altera Login</a></li>
				<li><a href='#'>Exclui Login</a></li>
			
				</ul>
				
		</li>
		<li ><a href="index.jsp"> sair</a></li>
		
		
		
		</ul>
		
		<div class="footer">
		<img src="<%=request.getContextPath()%>/html/imagens/unnamed.png" width="200" height="200" align="right"/>
		
		</div>
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
		<script type="text/javascript" src="jquery.blueberry.js">
		
		</script>

</body>
</html>