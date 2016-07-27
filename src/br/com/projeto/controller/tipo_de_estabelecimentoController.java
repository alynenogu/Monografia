package br.com.projeto.controller;

import java.util.List;

import br.com.projeto.DAO.tipo_de_estabelecimentoDAO;
import br.com.projeto.modelo.tipo_de_estabelecimento;

public class tipo_de_estabelecimentoController {
	public List<tipo_de_estabelecimento> getLista(){
	return tipo_de_estabelecimentoDAO.getInstance().getLista();
	
	
	}

}
