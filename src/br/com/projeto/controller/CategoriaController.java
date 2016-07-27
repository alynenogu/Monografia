package br.com.projeto.controller;

import java.util.List;

import br.com.projeto.DAO.CategoriaDAO;
import br.com.projeto.modelo.Categoria;

public class CategoriaController {
	
	public List<Categoria> getLista(){
		return CategoriaDAO.getInstance().getLista();
	}

}
