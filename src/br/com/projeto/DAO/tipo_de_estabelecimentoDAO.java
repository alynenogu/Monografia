package br.com.projeto.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.modelo.Categoria;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.Tipo;
import br.com.projeto.modelo.tipo_de_estabelecimento;
import br.com.projeto.modelo.Usuario;

public class tipo_de_estabelecimentoDAO {
	private Connection connection;
	private DAOException exception;
	private static tipo_de_estabelecimentoDAO instance;
	
	public static tipo_de_estabelecimentoDAO getInstance(){
		if(instance==null)
			instance = new tipo_de_estabelecimentoDAO();
		return instance;
	}
	
	public tipo_de_estabelecimentoDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
	public boolean insereEstabelecimento(tipo_de_estabelecimento tipoestabelecimento){
		String sql ="insert into tipo_de_estabelecimento(nomeEstabelecimento,descricaoEstabelecimento,nomeFantasia,idEndereco,idTipo,nomeTipo) values (?,?,?,?,?,?)";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1,tipoestabelecimento.getNomeEstabelecimento());
			stmt.setString(2,tipoestabelecimento.getDescricaoEstabelecimento());
			stmt.setString(3,tipoestabelecimento.getNomeFantasia());
			stmt.setInt(4,tipoestabelecimento.getEndereco().getIdEndereco());
			stmt.setInt(5,tipoestabelecimento.getTipo().getIdTipo());
			stmt.setString(6,tipoestabelecimento.getNomeTipo());
		
			
			
			stmt.execute();
			stmt.close();
			
			return true;
		}catch(SQLException e){
			throw new RuntimeException(e);
		
		
	}
	
}
	//Buscar os tipos de Estabelecimentos
	
	public List<Tipo> getlistatipo(){
		List<Tipo> tipos = new ArrayList<Tipo>();
		try{
			PreparedStatement stmt =this.connection.prepareStatement("select * from tipo");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				Tipo tipo = new Tipo();
				tipo.setIdTipo(rs.getInt("idTipo"));
				tipo.setNometipo(rs.getString("nometipo"));
				tipo.setDescricaotipo(rs.getString("descricaotipo"));
				tipos.add(tipo);
			}
			rs.close();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException (e);
		}
		
		return tipos;
	}
	
	
	//alterar um determinado usuario de uma classe
	
			public void alteraEstabelecimento(tipo_de_estabelecimento estabelecimento){
				String sql ="update tipo_de_estabelecimento  a join endereco b on (a.idEstabelecimento = ? and b.idEndereco = ?) set a.nomeEstabelecimento = ? ,a.descricaoEstabelecimento=?,a.nomeFantasia =?,a.nomeTipo=?,a.idTipo=?,b.Rua=?,b.cidade=?,b.bairro=?,b.estado=?,b.complemento=?,b.cep=?";
				Endereco end = new Endereco ();
				try{
					PreparedStatement stmt = this.connection.prepareStatement(sql);
					
					stmt.setInt(1,estabelecimento.getIdEstabelecimento());
				//	usuario.setEndereco(new Endereco());
					stmt.setInt(2,estabelecimento.getEndereco().getIdEndereco());
					stmt.setString(3,estabelecimento.getNomeEstabelecimento());
					stmt.setString(4,estabelecimento.getDescricaoEstabelecimento());
					stmt.setString(5,estabelecimento.getNomeFantasia());
					stmt.setString(6,estabelecimento.getNomeTipo());
					stmt.setInt(7,estabelecimento.getTipo().getIdTipo());
					stmt.setString(8,estabelecimento.getEndereco().getRua());
					stmt.setString(9,estabelecimento.getEndereco().getCidade());
					stmt.setString(10,estabelecimento.getEndereco().getBairro());
					stmt.setString(11,estabelecimento.getEndereco().getEstado());
					stmt.setString(12,estabelecimento.getEndereco().getComplemento());
					stmt.setInt(13,estabelecimento.getEndereco().getCep());
					
					
					stmt.executeUpdate();
					stmt.close();
				}catch(SQLException e){
					throw new RuntimeException(e);
				}
			}
		
	

	//Listar todos os usuarios da tabela
			public List<tipo_de_estabelecimento> getLista(){
				List <tipo_de_estabelecimento> hospitais = new ArrayList<tipo_de_estabelecimento>();
				Endereco endereco = new Endereco();
				try{
					PreparedStatement stmt = this.connection.prepareStatement("select * from tipo_de_estabelecimento a join endereco b on a.idEndereco = b.idEndereco");
					ResultSet rs = stmt.executeQuery();
					while(rs.next()){
						
						tipo_de_estabelecimento hsp = new tipo_de_estabelecimento();
						hsp.setIdEstabelecimento(rs.getInt("idEstabelecimento"));
						hsp.setNomeEstabelecimento(rs.getString("nomeEstabelecimento"));
						hsp.setDescricaoEstabelecimento(rs.getString("descricaoEstabelecimento"));
						hsp.setNomeTipo(rs.getString("nomeTipo"));
						hsp.setNomeFantasia(rs.getString("nomeFantasia"));
						hsp.setEndereco(new Endereco());
						hsp.getEndereco().setRua(rs.getString("Rua"));
						hsp.getEndereco().setCidade(rs.getString("cidade"));
						hsp.getEndereco().setBairro(rs.getString("bairro"));
						hsp.getEndereco().setEstado(rs.getString("estado"));
						hsp.getEndereco().setComplemento(rs.getString("complemento"));
						hsp.getEndereco().setCep(rs.getInt("cep"));
						hsp.getEndereco().setIdEndereco(rs.getInt("idEndereco"));
						hsp.setTipo(new Tipo());
						hsp.getTipo().setIdTipo(rs.getInt("idTipo"));
						hsp.getTipo().setNometipo(rs.getString("nometipo"));
						hospitais.add(hsp);
							
					}
					rs.close();
					stmt.close();
				}catch(SQLException e){
					throw new RuntimeException(e);
				}
				return hospitais;
			}

			
			//Remove um hospital
			public void removeEstabelecimento(tipo_de_estabelecimento estabelecimento){
				try{
					PreparedStatement stmt = connection.prepareStatement("delete tipo_de_estabelecimento,endereco from tipo_de_estabelecimento join endereco on tipo_de_estabelecimento.idEndereco=endereco.idEndereco where tipo_de_estabelecimento.idEstabelecimento=?");
					stmt.setInt(1,estabelecimento.getIdEstabelecimento());
					stmt.execute();
					stmt.close();
					
				}catch(SQLException e){
					this.exception.getException(e);
				}
			}


			

	
	
}
