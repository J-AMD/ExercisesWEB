package com.generation.practica1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OperacionServelt extends HttpServlet{
	
	int a=6, b=4;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter salida = resp.getWriter();
		salida.println("<!DOCTYPE html>");
		salida.println("<html>");
		salida.println("<head>");
		salida.println("<title>Operaciones Servelt</title>");
		salida.println("</head>");
		salida.println("<body>");
		salida.println("<h1>La suma es: "+(a+b)+"</h1>");
		salida.println("<h1>La suma es: "+(a-b)+"</h1>");
		salida.println("<h1>La suma es: "+(a*b)+"</h1>");
		salida.println("<h1>La suma es: "+(a/b)+"</h1>");
		salida.println("</body>");
		salida.println("</html>");
		
	}

}
