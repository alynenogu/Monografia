package br.com.projeto.modelo;

public class Tipo {
	private int idTipo;
	private String nometipo;
	private String descricaotipo;

	public Tipo(){
		
	}
	public Tipo(int idTipo, String nometipo, String descricaotipo ){
		this.idTipo=idTipo;
		this.nometipo=nometipo;
		this.descricaotipo=descricaotipo;
		
	}
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public String getNometipo() {
		return nometipo;
	}
	public void setNometipo(String nometipo) {
		this.nometipo = nometipo;
	}
	public String getDescricaotipo() {
		return descricaotipo;
	}
	public void setDescricaotipo(String descricaotipo) {
		this.descricaotipo = descricaotipo;
	}

}
