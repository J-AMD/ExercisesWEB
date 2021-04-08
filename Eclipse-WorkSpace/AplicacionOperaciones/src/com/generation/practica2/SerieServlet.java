package com.generation.practica2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SerieServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String sNumero = req.getParameter("fibonacci");
		
		int numero = Integer.parseInt(sNumero);
		
		resp.getWriter().println("<!DOCTYPE html");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head><title>Resultado</title></head>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}

}
