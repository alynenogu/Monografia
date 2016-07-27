package br.com.projeto.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.Usuario;





public class UsuarioDAO {
	private Connection connection;
	private DAOException exception;
	
	public UsuarioDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public boolean insereUsuario(Usuario usuario){
		Endereco endereco = new Endereco();
		
		
		String sql = "insert into usuario(nome,email,login,senha,telefone,idEndereco) VALUES(?,?,?,?,?,?)";
		
		
		try{
		 PreparedStatement stmt = this.connection.prepareStatement(sql);
		 stmt.setString(1,usuario.getNome());
		 stmt.setString(2,usuario.getEmail());
		 stmt.setString(3,usuario.getLogin());
		 stmt.setString(4,usuario.getSenha());
		 stmt.setString(5,usuario.getTelefone());
		 stmt.setInt(6,usuario.getEndereco().getIdEndereco());
		 
		 stmt.execute();
		 
		 
		 
		 stmt.close();
		
		
		return true;
		}catch(SQLException e){
			throw new RuntimeException(e);
			
		}
	}
	
	
	//alterar um determinado usuario de uma classe
	
		public void altera(Usuario usuario){
			String sql ="update usuario  a join endereco b on (a.idUsuario = ? and b.idEndereco = ?) set a.nome = ? ,a.email=?,a.login =?,a.senha=?,a.telefone=?,b.Rua=?,b.cidade=?,b.bairro=?,b.estado=?,b.complemento=?, b.cep=? ";
			Endereco end = new Endereco ();
			try{
				PreparedStatement stmt = this.connection.prepareStatement(sql);
				
				stmt.setInt(1,usuario.getIdUsuario());
			//	usuario.setEndereco(new Endereco());
				stmt.setInt(2,usuario.getEndereco().getIdEndereco());
				stmt.setString(3,usuario.getNome());
				stmt.setString(4,usuario.getEmail());
				stmt.setString(5,usuario.getLogin());
				stmt.setString(6,usuario.getSenha());
				stmt.setString(7,usuario.getTelefone());
				stmt.setString(8,usuario.getEndereco().getRua());
				stmt.setString(9,usuario.getEndereco().getCidade());
				stmt.setString(10,usuario.getEndereco().getBairro());
				stmt.setString(11,usuario.getEndereco().getEstado());
				stmt.setString(12,usuario.getEndereco().getComplemento());
				stmt.setInt(13,usuario.getEndereco().getCep());
				
				
				stmt.executeUpdate();
				stmt.close();
			}catch(SQLException e){
				throw new RuntimeException(e);
			}
		}
	
		
		//Listar todos os usuarios da tabela
		public List<Usuario> getLista(){
			List <Usuario> usuarios = new ArrayList<Usuario>();
			Endereco endereco = new Endereco();
			try{
				PreparedStatement stmt = this.connection.prepareStatement("select * from usuario a join endereco b on a.idEndereco = b.idEndereco");
				ResultSet rs = stmt.executeQuery();
				while(rs.next()){
					
					Usuario usuario = new Usuario();
					usuario.setIdUsuario(rs.getInt("idUsuario"));
					usuario.setNome(rs.getString("nome"));
					usuario.setEmail(rs.getString("email"));
					usuario.setLogin(rs.getString("login"));
					usuario.setSenha(rs.getString("senha"));
					usuario.setTelefone(rs.getString("telefone"));
					usuario.setEndereco(new Endereco());
					usuario.getEndereco().setRua(rs.getString("Rua"));
					usuario.getEndereco().setCidade(rs.getString("cidade"));
					usuario.getEndereco().setBairro(rs.getString("bairro"));
					usuario.getEndereco().setEstado(rs.getString("estado"));
					usuario.getEndereco().setComplemento(rs.getString("complemento"));
					usuario.getEndereco().setCep(rs.getInt("cep"));
					usuario.getEndereco().setIdEndereco(rs.getInt("idEndereco"));
					
					usuarios.add(usuario);
						
				}
				rs.close();
				stmt.close();
			}catch(SQLException e){
				throw new RuntimeException(e);
			}
			return usuarios;
		}

		
		
		//ID especifico 
		public Usuario buscarUsuarioID(int idUsuario,int IdEndereco){
			Usuario usr = new Usuario();
			String sql = "select * from usuario a join endereco b on a.idUsuario =? and b.idEndereco = ?";
			
			try{
				PreparedStatement stmt = this.connection.prepareStatement(sql);
		        stmt.setInt(1,idUsuario);
		        stmt.setInt(2,IdEndereco);
				
		        ResultSet rs = stmt.executeQuery();
		        
		        if(rs.next()){
		        	usr.setIdUsuario(rs.getInt("idUsuario"));
		        	usr.setNome(rs.getString("nome"));
		        	usr.setEmail(rs.getString("email"));
		        	usr.setLogin(rs.getString("login"));
		        	usr.setSenha(rs.getString("senha"));
		        	usr.setEndereco(new Endereco());
		        	usr.getEndereco().setRua(rs.getString("Rua"));
		        	usr.getEndereco().setCidade(rs.getString("cidade"));
		        	usr.getEndereco().setBairro(rs.getString("bairro"));
		        	usr.getEndereco().setEstado(rs.getString("estado"));
		        	usr.getEndereco().setComplemento(rs.getString("complemento"));
		        	usr.getEndereco().setIdEndereco(rs.getInt("idEndereco"));
		        }
			
			
			
			
			
			
			}catch(SQLException e){
				throw new RuntimeException(e);
			}
			return usr;
			
			}
		
		
		//Remove um usuario
		public void remove(Usuario usuario){
			try{
				PreparedStatement stmt = connection.prepareStatement("delete usuario,endereco from usuario join endereco on usuario.idEndereco=endereco.idEndereco where usuario.idUsuario =?");
				stmt.setInt(1,usuario.getIdUsuario());
				stmt.execute();
				stmt.close();
				
			}catch(SQLException e){
				this.exception.getException(e);
			}
		}
		
		
		
}
