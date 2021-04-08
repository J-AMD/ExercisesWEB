package com.generation.practica2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DivisionServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter salida = resp.getWriter();
		salida.println("<!DOCTYPE html");
		salida.println("<html>");
		salida.println("<head><title>Pagina de suma</title></head>");
		salida.println("<body>");
		salida.println("<h1>");
		salida.println("La division de (3/2) es: "+ (3/2) + "</h1>");
		salida.println("</body>");
		salida.println("</html>");
		
	}

}
