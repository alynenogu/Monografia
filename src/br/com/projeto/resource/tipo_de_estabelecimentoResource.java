package br.com.projeto.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.projeto.controller.tipo_de_estabelecimentoController;
import br.com.projeto.modelo.tipo_de_estabelecimento;

@Path("/estabelecimento")
public class tipo_de_estabelecimentoResource {
	
	@GET
	@Path("/listartodosEstabelecimento")
	@Produces("application/json")
	public List<tipo_de_estabelecimento> getLista(){
		return new tipo_de_estabelecimentoController().getLista();
	}

}
