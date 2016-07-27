package br.com.projeto.Servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.modelo.Usuario;

import com.google.gson.Gson;


@WebServlet("/json")
public class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException { 
		
		InputStream is = req.getInputStream();
		
		String json = converteParaString(is);
		
		System.out.println(json);
		
		Gson converter = new Gson();
		Usuario usuario = converter.fromJson(json, Usuario.class);
		
		
	}
	
	public String converteParaString(InputStream is) {
		Scanner scanner = new Scanner(is);
		
		StringBuilder builder = new StringBuilder();
		while(scanner.hasNext()) { 
			String pedaco = scanner.next();
			builder.append(pedaco);
		}
		
		String json = builder.toString();
		
		scanner.close();
		return json;
	}

}
