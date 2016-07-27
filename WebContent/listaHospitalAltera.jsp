<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import = "java.util.*,br.com.projeto.Servlet.*,br.com.projeto.DAO.*,br.com.projeto.modelo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista Hospitais</title>
<link rel="stylesheet" href="css/styletable.css">
</head>
<body>
<img src="<%=request.getContextPath()%>/html/imagens/logotiponovo.png" />
<table>
				
			<%
		tipo_de_estabelecimentoDAO dao = new tipo_de_estabelecimentoDAO();
		List<tipo_de_estabelecimento> estabelecimentos = dao.getLista();
		for (tipo_de_estabelecimento tipo_de_estabelecimento:estabelecimentos){

		%>
			<tr>
				<th>Id Estabelecimento:</th>
				<th>Nome :</th>
				<th>Descricao:</th>
				<th>Nome Tipo:</th>
				<th>Nome Fantasia:</th>
				<th>Rua:</th>
				<th>Cidade:</th>
				<th>Bairro:</th>
				<th>Estado:</th>
				<th>Complemento:</th>
				<th>Cep:</th>
				</tr>
	
				<tr>
			
				<td><%=tipo_de_estabelecimento.getIdEstabelecimento()%></td>
			
				<td> <a href ="AlteraHospital.jsp?idEstabelecimento=<%=tipo_de_estabelecimento.getIdEstabelecimento()%> &nomeEstabelecimento=<%=tipo_de_estabelecimento.getNomeEstabelecimento()%>&descricaoEstabelecimento=<%=tipo_de_estabelecimento.getDescricaoEstabelecimento() %>&nomeTipo=<%=tipo_de_estabelecimento.getNomeTipo() %>
				&nomeFantasia=<%=tipo_de_estabelecimento.getNomeFantasia() %>&Rua=<%=tipo_de_estabelecimento.getEndereco().getRua() %>&cidade=<%=tipo_de_estabelecimento.getEndereco().getCidade() %>
				&bairro=<%=tipo_de_estabelecimento.getEndereco().getBairro()%>&estado=<%=tipo_de_estabelecimento.getEndereco().getEstado() %>&complemento=<%=tipo_de_estabelecimento.getEndereco().getComplemento()%>
				 &idEndereco=<%=tipo_de_estabelecimento.getEndereco().getIdEndereco() %>&idTipo=<%=tipo_de_estabelecimento.getTipo().getIdTipo() %>&cep=<%=tipo_de_estabelecimento.getEndereco().getCep()%>"> <%=tipo_de_estabelecimento.getNomeEstabelecimento()%> </a></td>
			
					
					
					<td><%=tipo_de_estabelecimento.getDescricaoEstabelecimento() %></td>
					
					<td><%=tipo_de_estabelecimento.getNomeTipo() %></td>
					<td><%=tipo_de_estabelecimento.getNomeFantasia() %></td>
					
					<td><%=tipo_de_estabelecimento.getEndereco().getRua() %></td>
					
					<td><%=tipo_de_estabelecimento.getEndereco().getCidade() %></td>
					
					<td><%=tipo_de_estabelecimento.getEndereco().getBairro() %></td>
					
					<td><%=tipo_de_estabelecimento.getEndereco().getEstado() %></td>
					
					<td><%=tipo_de_estabelecimento.getEndereco().getComplemento() %></td>
					<td><%=tipo_de_estabelecimento.getEndereco().getCep() %></td>
					</tr>
								<%
				}
					%>
		
		
		
		
		
</table>
</body>
</html>