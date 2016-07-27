package br.com.projeto.resource;

import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import br.com.projeto.controller.CategoriaController;
import br.com.projeto.modelo.Categoria;

@Path("/categoria")
public class CategoriaResource {
	
	@GET
	@Path("/listarcategorias")
	@Produces("application/json")
	public List<Categoria> getLista(){
		return new CategoriaController().getLista();
		
	}
	

}
