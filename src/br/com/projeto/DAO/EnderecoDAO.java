package br.com.projeto.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.Login;
import br.com.projeto.modelo.Usuario;

public class EnderecoDAO {
	private Connection connection;
	private DAOException exception;
	
	public EnderecoDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public boolean inserirEndereco(Endereco endereco){
		String sql = "insert into endereco(Rua,cidade,bairro,estado,complemento,cep) VALUES (?,?,?,?,?,?)";
		
		try{
			PreparedStatement stmt =this.connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1,endereco.getRua());
			stmt.setString(2,endereco.getCidade());
			stmt.setString(3,endereco.getBairro());
			stmt.setString(4,endereco.getEstado());
			stmt.setString(5,endereco.getComplemento());
			stmt.setInt(6,endereco.getCep());
			stmt.execute();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			int idGerado =rs.getInt(1);
			endereco.setIdEndereco(idGerado);
			
			
			
			stmt.close();
			return true;
		}catch(SQLException e){
			
			throw new RuntimeException(e);
			
			
			
		}
		
	}
	
	

}
