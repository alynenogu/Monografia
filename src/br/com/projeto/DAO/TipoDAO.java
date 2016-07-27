package br.com.projeto.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.modelo.Categoria;
import br.com.projeto.modelo.Tipo;

public class TipoDAO {
	private Connection connection;
	private DAOException exception;
	
	
	public TipoDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
	//Insere Tipo
	
	public boolean insereTipo(Tipo tipo){
		String sql = "insert into tipo(nometipo,descricaotipo) VALUES (?,?)";
		
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1,tipo.getNometipo());
			stmt.setString(2,tipo.getDescricaotipo());
			stmt.execute();
			stmt.close();
			return true;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		}
	//Altera Tipo
	public void alteraTipo(Tipo tipo){
		String sql ="update tipo set nometipo = ?, descricaotipo = ? where idTipo = ?";
	
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			
			stmt.setString(1,tipo.getNometipo());
			stmt.setString(2,tipo.getDescricaotipo());
			stmt.setInt(3,tipo.getIdTipo());
			
			stmt.executeUpdate();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
//Excluir tipo
	//Remove um Categoria
	public void removeTipo(Tipo tipo){
		try{
			PreparedStatement stmt = connection.prepareStatement("delete from tipo where idTipo = ?");
			stmt.setInt(1,tipo.getIdTipo());
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			this.exception.getException(e);
		}
	}
	

	
	//lista Tipo
	//Listar todos os usuarios da tabela
		public List<Tipo> getLista(){
			List <Tipo> tipos = new ArrayList<Tipo>();
			
			try{
				PreparedStatement stmt = this.connection.prepareStatement("select * from tipo");
				ResultSet rs = stmt.executeQuery();
				while(rs.next()){
					
					Tipo tip = new Tipo();
					tip.setIdTipo(rs.getInt("idTipo"));
					tip.setNometipo(rs.getString("nometipo"));
					tip.setDescricaotipo(rs.getString("descricaotipo"));
					
					
					tipos.add(tip);
						
				}
				rs.close();
				stmt.close();
			}catch(SQLException e){
				throw new RuntimeException(e);
			}
			return tipos;
		}
		
	//Busca id Categoria
	public int buscarIdTipo(String nometipo){
			int idTipo=0;
			String sql = "select idTipo from tipo where nometipo=?";
			
			try{
				PreparedStatement stmt = this.connection.prepareStatement(sql);
				stmt.setString(1,nometipo);
				ResultSet rs = stmt.executeQuery();
				if(rs.next()){
					idTipo = (rs.getInt("idTipo"));
					
				}
			}catch(SQLException e){
				throw new RuntimeException (e);
			}
			return idTipo;
			
		
}
		
	

}
