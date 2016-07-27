package br.com.projeto.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.modelo.Categoria;
import br.com.projeto.modelo.Comentario;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.Tipo;
import br.com.projeto.modelo.tipo_de_estabelecimento;
import br.com.projeto.modelo.Usuario;

public class ComentarioDAO {
	
	
		private Connection connection;
		private DAOException exception;
		
		
		public ComentarioDAO(){
			this.connection = new ConnectionFactory().getConnection();
		}
		
		//Listar os usuarios, com o objetivo de fazer comentario, alterar,excluir ou listar um comentario referente a pessoa
		
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
///////////////////////////////////////////////////
		
		///Insere Comentario referente a um usuario
		
		public boolean insereComentario(Comentario comentario){
			Endereco endereco = new Endereco();
			
			
			String sql = "insert into comentario(nomeEstabelecimento,nomecategoria,textoComentario,idUsuario,idcategoria,idEstabelecimento,dataComentario) VALUES(?,?,?,?,?,?,?)";
			
			
			try{
			 PreparedStatement stmt = this.connection.prepareStatement(sql);
			 stmt.setString(1,comentario.getNomeEstabelecimento());
			 stmt.setString(2,comentario.getNomecategoria());
			 stmt.setString(3,comentario.getTextoComentario());
			 stmt.setInt(4,comentario.getUsuario().getIdUsuario());
			 stmt.setInt(5,comentario.getCategoria().getIdcategoria());
			 stmt.setInt(6,comentario.getHospital().getIdEstabelecimento());
			 stmt.setDate(7,new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
			
			 
			 stmt.execute();
			 stmt.close();
			
			
			return true;
			}catch(SQLException e){
				throw new RuntimeException(e);
				
			}
		}
		
//////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////////////////////////////////////////////
		
		//Listar todos os Hospitais da tabela
		//Listar todos os usuarios da tabela
		public List<tipo_de_estabelecimento> getListaEstabelecimento(){
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

					hospitais.add(hsp);
						
				}
				rs.close();
				stmt.close();
			}catch(SQLException e){
				throw new RuntimeException(e);
			}
			return hospitais;
		}


				////////////////////////////////////////////////
		
		public int buscarIdHospital(String nomeEstabelecimento){
			int idEstabelecimento=0;
			String sql = "select idEstabelecimento from tipo_de_estabelecimento where nomeEstabelecimento=?";
			
			try{
				PreparedStatement stmt = this.connection.prepareStatement(sql);
				stmt.setString(1,nomeEstabelecimento);
				ResultSet rs = stmt.executeQuery();
				if(rs.next()){
					idEstabelecimento = (rs.getInt("idEstabelecimento"));
					
				}
			}catch(SQLException e){
				throw new RuntimeException (e);
			}
			return idEstabelecimento;
			
			
			
		}
		
		
		/////////////////////////////////////////
		
		public List<Categoria> getlistacategoria(){
			List<Categoria> categorias = new ArrayList<Categoria>();
			try{
				PreparedStatement stmt =this.connection.prepareStatement("select * from categoria");
				ResultSet rs = stmt.executeQuery();
				while(rs.next()){
					Categoria categoria = new Categoria();
					categoria.setIdcategoria(rs.getInt("idcategoria"));
					categoria.setNomecategoria(rs.getString("nomecategoria"));
					categoria.setDescricaoCategoria(rs.getString("descricaoCategoria"));
					categorias.add(categoria);
				}
				rs.close();
				stmt.close();
				
			}catch(SQLException e){
				throw new RuntimeException (e);
			}
			
			return categorias;
		}
		
///////////////////////////////////////////////////////////////////////////
		//Metodo para listar comentario conforme o usuario \0/
		public List<Comentario> getlistaComentarioEsp(int idUsuario){
			List<Comentario> comentarios = new ArrayList<Comentario>();
			try{
				PreparedStatement stmt =this.connection.prepareStatement("select * from comentario where idUsuario = ?");
				stmt.setInt(1,idUsuario);
				ResultSet rs = stmt.executeQuery();
				while(rs.next()){
					Comentario comentario = new Comentario();
					comentario.setIdComentario(rs.getInt("idComentario"));
					comentario.setNomeEstabelecimento(rs.getString("nomeEstabelecimento"));
					comentario.setNomecategoria(rs.getString("nomecategoria"));
					comentario.setTextoComentario(rs.getString("textoComentario"));
					comentario.setUsuario(new Usuario());
					comentario.getUsuario().setIdUsuario(rs.getInt("idUsuario"));
					comentario.setCategoria(new Categoria());
					comentario.getCategoria().setIdcategoria(rs.getInt("idcategoria"));
					comentario.setHospital(new tipo_de_estabelecimento());
					comentario.getHospital().setIdEstabelecimento(rs.getInt("idEstabelecimento"));
					Calendar data = Calendar.getInstance();
					data.setTime(rs.getDate("dataComentario"));
					comentario.setDataComentario(data);
					
					
					
					comentarios.add(comentario);
				}
				rs.close();
				stmt.close();
				
			}catch(SQLException e){
				throw new RuntimeException (e);
			}
			
			return comentarios;
		}
		
		//////////////////////////////////
		
		public void alteraComentario(Comentario comentario){
			String sql ="update comentario set nomeEstabelecimento=?,nomecategoria=?,textoComentario=?,idUsuario=?,idcategoria=?,idEstabelecimento=?,dataComentario=? where idComentario = ?";
		
			try{
				PreparedStatement stmt = this.connection.prepareStatement(sql);
				stmt.setString(1,comentario.getNomeEstabelecimento());
				stmt.setString(2,comentario.getNomecategoria());
				stmt.setString(3,comentario.getTextoComentario());
				stmt.setInt(4,comentario.getUsuario().getIdUsuario());
				stmt.setInt(5,comentario.getCategoria().getIdcategoria());
				stmt.setInt(6,comentario.getHospital().getIdEstabelecimento());
				stmt.setDate(7,new Date(comentario.getDataComentario().getTimeInMillis()));
				stmt.setInt(8,comentario.getIdComentario());
				stmt.executeUpdate();
				stmt.close();
				
			}catch(SQLException e){
				throw new RuntimeException (e);
			}
		
		}
		//Remove um hospital
		public void removeComentario(Comentario comentario){
			try{
				PreparedStatement stmt = connection.prepareStatement("delete from comentario where idComentario=?");
				stmt.setInt(1,comentario.getIdComentario());
				stmt.execute();
				stmt.close();
				
			}catch(SQLException e){
				this.exception.getException(e);
			}
		}

		


}

			
			
			
