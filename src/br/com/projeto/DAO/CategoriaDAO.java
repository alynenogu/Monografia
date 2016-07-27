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
import br.com.projeto.modelo.tipo_de_estabelecimento;
import br.com.projeto.modelo.Usuario;

public class CategoriaDAO {
	
	private Connection connection;
	private DAOException exception;
	private static CategoriaDAO instance;
	
	
	public CategoriaDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
	public static CategoriaDAO getInstance() {
		if(instance==null)
			instance = new CategoriaDAO();
		return instance;
		
	}
	//inserir uma categoria
	
	public boolean insereCategoria(Categoria categoria){
		String sql = "insert into categoria(nomecategoria,descricaoCategoria) VALUES (?,?)";
		
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1,categoria.getNomecategoria());
			stmt.setString(2,categoria.getDescricaoCategoria());
			stmt.execute();
			stmt.close();
			return true;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		}
	
	//alterar um determinado usuario de uma classe
	
	public void alteraCategoria(Categoria categoria){
		String sql ="update categoria set nomecategoria = ?, descricaoCategoria = ? where idcategoria = ?";
	
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			
			stmt.setString(1,categoria.getNomecategoria());
			stmt.setString(2,categoria.getDescricaoCategoria());
			stmt.setInt(3,categoria.getIdcategoria());
			
			stmt.executeUpdate();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}



	
	
	
	//Listar todos os usuarios da tabela
	public List<Categoria> getLista(){
		List <Categoria> categorias = new ArrayList<Categoria>();
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement("select * from categoria");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				
				Categoria ctg = new Categoria();
				ctg.setIdcategoria(rs.getInt("idcategoria"));
				ctg.setNomecategoria(rs.getString("nomecategoria"));
				ctg.setDescricaoCategoria(rs.getString("descricaoCategoria"));
				
				
				categorias.add(ctg);
					
			}
			rs.close();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		return categorias;
	}
	
	
	//Remove um Categoria
	public void removeCategoria(Categoria categoria){
		try{
			PreparedStatement stmt = connection.prepareStatement("delete from categoria where idcategoria = ?");
			stmt.setInt(1,categoria.getIdcategoria());
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			this.exception.getException(e);
		}
	}
	
	//Busca id Categoria
			public int buscarIdCategoria(String nomecategoria){
				int idcategoria=0;
				String sql = "select idcategoria from categoria where nomecategoria=?";
				
				try{
					PreparedStatement stmt = this.connection.prepareStatement(sql);
					stmt.setString(1,nomecategoria);
					ResultSet rs = stmt.executeQuery();
					if(rs.next()){
						idcategoria = (rs.getInt("idcategoria"));
						
					}
				}catch(SQLException e){
					throw new RuntimeException (e);
				}
				return idcategoria;
				
			
}

			
}