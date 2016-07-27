package br.com.projeto.testes;

import br.com.projeto.DAO.EnderecoDAO;
import br.com.projeto.DAO.tipo_de_estabelecimentoDAO;
import br.com.projeto.DAO.UsuarioDAO;
import br.com.projeto.modelo.Endereco;
import br.com.projeto.modelo.Tipo;
import br.com.projeto.modelo.tipo_de_estabelecimento;
import br.com.projeto.modelo.Usuario;

public class TestaHospitalEnd {
	
public static void main(String[] args) {
		
		Endereco end = new Endereco();
		tipo_de_estabelecimento hsp = new tipo_de_estabelecimento();
		
		hsp.setNomeEstabelecimento("joari");
		hsp.setDescricaoEstabelecimento("600 anos de existe");
		hsp.setNomeFantasia("joaridosSonhos");
		hsp.setNomeTipo("Hospital");
		hsp.setTipo(new Tipo());
		hsp.getTipo().setIdTipo(2);
		
		
		
		
		end.setRua("Rua Ari");
		end.setCidade("Rio de Janeiro");
		end.setBairro("Campo Grande");
		end.setEstado("Rio de Janeiro");
		end.setComplemento("Cg nao sie");
		
		hsp.setEndereco(end);
	
	
	
	

	
		EnderecoDAO dao1 = new EnderecoDAO();
		dao1.inserirEndereco(end);
		tipo_de_estabelecimentoDAO dao = new tipo_de_estabelecimentoDAO();
		dao.insereEstabelecimento(hsp);
		
		
			System.out.println("OK");

}
}
