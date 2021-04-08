package com.generation.practica2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NombreServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String nombre = req.getParameter("nombre");
		resp.getWriter().println("<!DOCTYPE html");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head><title>Resultado</title></head>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<h1>Tu nombre es: "+ nombre + "</h1>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}

}
