package com.generation.practica3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TrianguloServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String sBase = req.getParameter("triangulo");
		
		int base = Integer.parseInt(sBase);
		
		resp.getWriter().println("<!DOCTYPE html");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head><title>Triangulo</title></head>");
		resp.getWriter().println("<body>");
		
		for(int i=0; i<base;i++) {
			
			for(int j=0; j<=i; j++) {
		
				resp.getWriter().println("*");
			}
			resp.getWriter().println("<br>");
		}
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}

}
