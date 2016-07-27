package br.com.projeto.modelo;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Categoria {
	private int idcategoria;
 private String nomecategoria;
 private String descricaoCategoria;
	
	public Categoria(){
		
	}
	
	public Categoria(int idcategoria, String nomecategoria, String descricaoCategoria ){
		this.idcategoria=idcategoria;
		this.nomecategoria=nomecategoria;
		this.descricaoCategoria=descricaoCategoria;
		
	}
	
	
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getNomecategoria() {
		return nomecategoria;
	}
	public void setNomecategoria(String nomecategoria) {
		this.nomecategoria = nomecategoria;
	}
	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}
	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	@Override
	public String toString() {
		return "Categoria [idcategoria=" + idcategoria + ", nomecategoria="
				+ nomecategoria + ", descricaoCategoria=" + descricaoCategoria
				+ "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((descricaoCategoria == null) ? 0 : descricaoCategoria
						.hashCode());
		result = prime * result + idcategoria;
		result = prime * result
				+ ((nomecategoria == null) ? 0 : nomecategoria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (descricaoCategoria == null) {
			if (other.descricaoCategoria != null)
				return false;
		} else if (!descricaoCategoria.equals(other.descricaoCategoria))
			return false;
		if (idcategoria != other.idcategoria)
			return false;
		if (nomecategoria == null) {
			if (other.nomecategoria != null)
				return false;
		} else if (!nomecategoria.equals(other.nomecategoria))
			return false;
		return true;
	}
	

	
}
