package com.generation.practica3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DiasServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String sDia = req.getParameter("dia");
		
		int dia = Integer.parseInt(sDia);
		
		resp.getWriter().println("<!DOCTYPE html");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head><title>Dias de la semana</title></head>");
		resp.getWriter().println("<body>");
		
		switch(dia) {
		case 1: 
			resp.getWriter().println("<h2>El dia 1 es Lunes</h2>");
			break;
		case 2: 
			resp.getWriter().println("<h2>El dia 2 es Martes</h2>");
			break;
		case 3: 
			resp.getWriter().println("<h2>El dia 3 es Miercoles</h2>");
			break;
		case 4: 
			resp.getWriter().println("<h2>El dia 4 es Jueves</h2>");
			break;
		case 5: 
			resp.getWriter().println("<h2>El dia 5 es viernes</h2>");
			break;
		case 6: 
			resp.getWriter().println("<h2>El dia 6 es Sabado</h2>");
			break;
		case 7: 
			resp.getWriter().println("<h2>El dia 7 es Domingo</h2>");
			break;
		default:
			resp.getWriter().println("<h1>El valor en nulo ingrese un numero del 1-7</h1>");
		}
		
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");

	}

}
