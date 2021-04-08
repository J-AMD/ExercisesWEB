package com.generation.practica3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SepararCadena extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String cadena = req.getParameter("cadena");
		String[] sNumeros = cadena.split("-");
		int suma = 0;
		
		resp.setContentType("text/html");
		for(int i=0; i< sNumeros.length; i++) {
			
			int sumatoria = Integer.parseInt(sNumeros[i]);
			suma +=sumatoria;
			resp.getWriter().println(sNumeros[i]);
		}
		
		resp.getWriter().println("<h3>La sumatoria de la seri es: "+suma+"</h3>");
		resp.getWriter().println("<h3>La sumatoria de la seri es: "+(suma/sNumeros.length)+"</h3>");
	}

}
