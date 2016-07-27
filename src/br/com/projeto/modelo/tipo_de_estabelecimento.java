package br.com.projeto.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class tipo_de_estabelecimento {
	int idEstabelecimento;
	String nomeEstabelecimento;
	String descricaoEstabelecimento;
	String nomeFantasia;
	String nomeTipo;
	Endereco endereco;
	Tipo tipo;
	
	public tipo_de_estabelecimento(){
		
	}
	public tipo_de_estabelecimento(int idEstabelecimento ,String nomeEstabelecimento,String descricaoEstabelecimento ,String nomeFantasia,String nomeTipo){
		this.idEstabelecimento = idEstabelecimento;
		this.nomeEstabelecimento = nomeEstabelecimento;
		this.descricaoEstabelecimento = descricaoEstabelecimento;
		this.nomeFantasia  = nomeFantasia;
		this.nomeTipo = nomeTipo;
		
		
	}
	
	
	public int getIdEstabelecimento() {
		return idEstabelecimento;
	}
	public void setIdEstabelecimento(int idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}
	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}
	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}
	public String getDescricaoEstabelecimento() {
		return descricaoEstabelecimento;
	}
	public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
		this.descricaoEstabelecimento = descricaoEstabelecimento;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getNomeTipo() {
		return nomeTipo;
	}
	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "tipo_de_estabelecimento [idEstabelecimento="
				+ idEstabelecimento + ", nomeEstabelecimento="
				+ nomeEstabelecimento + ", descricaoEstabelecimento="
				+ descricaoEstabelecimento + ", nomeFantasia=" + nomeFantasia
				+ ", nomeTipo=" + nomeTipo + ", endereco=" + endereco
				+ ", tipo=" + tipo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((descricaoEstabelecimento == null) ? 0
						: descricaoEstabelecimento.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + idEstabelecimento;
		result = prime
				* result
				+ ((nomeEstabelecimento == null) ? 0 : nomeEstabelecimento
						.hashCode());
		result = prime * result
				+ ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
		result = prime * result
				+ ((nomeTipo == null) ? 0 : nomeTipo.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		tipo_de_estabelecimento other = (tipo_de_estabelecimento) obj;
		if (descricaoEstabelecimento == null) {
			if (other.descricaoEstabelecimento != null)
				return false;
		} else if (!descricaoEstabelecimento
				.equals(other.descricaoEstabelecimento))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (idEstabelecimento != other.idEstabelecimento)
			return false;
		if (nomeEstabelecimento == null) {
			if (other.nomeEstabelecimento != null)
				return false;
		} else if (!nomeEstabelecimento.equals(other.nomeEstabelecimento))
			return false;
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null)
				return false;
		} else if (!nomeFantasia.equals(other.nomeFantasia))
			return false;
		if (nomeTipo == null) {
			if (other.nomeTipo != null)
				return false;
		} else if (!nomeTipo.equals(other.nomeTipo))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
						
}
