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
import br.com.projeto.modelo.Login;
import br.com.projeto.modelo.Usuario;



public class LoginDAO {
	
	private Connection connection;
	private DAOException exception;
	
	public LoginDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public boolean inserirLogin(Login login){
		String sql = "insert into login(idlogin,login,senha,email) VALUES (null,?,?,?)";
		try{
			PreparedStatement stmt =this.connection.prepareStatement(sql);
			stmt.setString(1,login.getLogin());
			stmt.setString(2,login.getSenha());
			stmt.setString(3,login.getEmail());
			stmt.execute();
			stmt.close();
			return true;
		}catch(SQLException e){
			this.exception.getException(e);
			return false;
		}
		
	
		
	}
	
	
	public Boolean Validalogin(String login,String senha){
		Login lg = null;
		String sql = "select * from login where login = ? and senha =?";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
	        stmt.setString(1,login);
	        stmt.setString(2,senha);
	        
			ResultSet rs = stmt.executeQuery();
	        
	       if(rs.next()){
	    	   	lg = new Login();
	        	lg.setIdLogin(rs.getInt("idLogin"));
	        	lg.setLogin(rs.getString("login"));
	        	lg.setSenha(rs.getString("senha"));
	        	lg.setEmail(rs.getString("email"));
	        }else{
	           return false;	
	        }
			
			stmt.close();
		}catch(SQLException e){
			this.exception.getException(e);
		
		}
		return true;	
	}
//ALTERAR LOGIN
	
	public void alteraLogin(Login login){
		String sql ="update login set login = ?, senha = ?, email=? where login = ? and senha=?";
	
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			
			stmt.setString(1,login.getLogin());
			stmt.setString(2,login.getSenha());
			stmt.setString(3,login.getEmail());
			stmt.setInt(4,login.getIdLogin());
			stmt.setString(5,login.getSenha());
			stmt.executeUpdate();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	//ID especifico 
	//Listar todos os usuarios da tabela
	public List<Login> getLista(String login,String senha){
		List <Login> logins = new ArrayList<Login>();
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement("select * from login where login = ? and senha = ?");
			 stmt.setString(1,login);
		     stmt.setString(2,senha);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				
				Login lg = new Login();
				lg.setIdLogin(rs.getInt("idlogin"));
				lg.setLogin(rs.getString("login"));
				lg.setSenha(rs.getString("senha"));
				lg.setEmail(rs.getString("email"));
					
				logins.add(lg);
					
			}
			rs.close();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		return logins;
	}
	
	

}
