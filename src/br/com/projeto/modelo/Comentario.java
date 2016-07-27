package br.com.projeto.modelo;

import java.util.Calendar;
import java.util.Date;

public class Comentario {
	
	int idComentario;
	String nomeEstabelecimento;
	String nomecategoria;
	String textoComentario;
	Usuario usuario;
	Categoria categoria;
	tipo_de_estabelecimento hospital;
	Calendar dataComentario;
	

	public Comentario(){
		
	}
	public Comentario(int idComentario, String nomeEstabelecido, String nomecategoria,String textoComentario){
		this.idComentario = idComentario;
		this.nomeEstabelecimento = nomeEstabelecido;
		this.nomecategoria = nomecategoria;
		this.textoComentario = textoComentario;
		
	}
	
	public int getIdComentario() {
		return idComentario;
	}
	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}
	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}
	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}
	public String getNomecategoria() {
		return nomecategoria;
	}
	public void setNomecategoria(String nomecategoria) {
		this.nomecategoria = nomecategoria;
	}
	public String getTextoComentario() {
		return textoComentario;
	}
	public void setTextoComentario(String textoComentario) {
		this.textoComentario = textoComentario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Calendar getDataComentario() {
		return dataComentario;
	}
	public void setDataComentario(Calendar dataComentario) {
		this.dataComentario = dataComentario;
	}
	public tipo_de_estabelecimento getHospital() {
		return hospital;
	}
	public void setHospital(tipo_de_estabelecimento hospital) {
		this.hospital = hospital;
	}
	
	
	
	
}
