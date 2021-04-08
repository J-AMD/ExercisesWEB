package com.generation.practica1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiplicacionServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter salida = resp.getWriter();
		salida.println("<!DOCTYPE html>");
		salida.println("<html>");
		salida.println("<head><title>Pagina de suma</title></head>");
		salida.println("<body>");
		salida.println("<h2>La multiplicacion es "+ (5*2) + "</h2>");
		salida.println("</body>");
		salida.println("</html>");
		
	}

}
