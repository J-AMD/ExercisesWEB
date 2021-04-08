package com.generation.practica2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TablaMultiplicar extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String sNumero = req.getParameter("multiplo");
		
		int numero = Integer.parseInt(sNumero);
		
		resp.getWriter().println("<!DOCTYPE html");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head><title>Resultado</title></head>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<h1>Tabla de multiplicar del "+ numero + "</h1>");

		for(int i=1; i<=10; i++) {
			
			resp.getWriter().println("<h2>"+ numero+ "X" + i + "= "+ (numero * i)+"</h2>");
		}
		
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}

}
