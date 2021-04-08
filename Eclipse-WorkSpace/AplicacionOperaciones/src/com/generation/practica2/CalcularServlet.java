package com.generation.practica2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcularServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String query = req.getQueryString();
		String sNumero1 = req.getParameter("numero1");
		String sNumero2 = req.getParameter("numero2");
		String stipoOperacion = req.getParameter("operacion");
		
		int numero1 = Integer.parseInt(sNumero1);
		int numero2 = Integer.parseInt(sNumero2);
		
		resp.getWriter().println("<!DOCTYPE html");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head><title>Resultado</title></head>");
		resp.getWriter().println("<body>");
		
		switch(stipoOperacion) {
		case "suma":
			resp.getWriter().println("<h1>La suma es: "+ (numero1 + numero2)+"</h1>");
			
			break;
		case "resta": 
			resp.getWriter().println("<h1>La resta es: "+ (numero1 - numero2)+"</h1>");
			
			break;
		case "multiplicacion": 
			resp.getWriter().println("<h1>La multiplicacion es: "+ (numero1 * numero2)+"</h1>");
			
			break;
		case "division": 
			resp.getWriter().println("<h1>La division es: "+ (numero1 / numero2)+"</h1>");
			
			break;
			
		default:
			resp.getWriter().println("<h1>Operacion no soportada</h1>");
		}
		/*
		String rutaServlet = req.getServletPath(); //imprime la ruta del servlet
		String contextApp = req.getContextPath();
		String serverName = req.getServerName(); //Nombre del servidor
		String rutaReal = req.getServletContext().getRealPath("/"); //Ruta de desde disco c
		String rutaProyecto = req.getRequestURI();
		*/
		
		/*
		resp.getWriter().println("<h1>" + query + "</h1>");
		resp.getWriter().println("<h1>" + rutaServlet + "</h1>");
		resp.getWriter().println("<h1>" + contextApp + "</h1>");
		resp.getWriter().println("<h1>" + serverName + "</h1>");
		resp.getWriter().println("<h1>" + rutaReal + "</h1>");
		resp.getWriter().println("<h1>" + rutaProyecto + "</h1>");
		*/
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
		
	}

}
