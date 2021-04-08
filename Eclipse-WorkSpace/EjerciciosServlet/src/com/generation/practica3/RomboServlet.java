package com.generation.practica3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RomboServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String sBase = req.getParameter("rombo");
		
		int base = Integer.parseInt(sBase);
		
		resp.getWriter().println("<!DOCTYPE html");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head><title>ROMBO</title></head>");
		resp.getWriter().println("<body>");
		
		for(int j=base; j>0; j--) {
			
			resp.getWriter().println("<br>");
		for(int i=j; i>1; i--) {
			resp.getWriter().print("-");
			
		}
		
		  for(int k=j; k<=base;k++)
			resp.getWriter().println("*");
			
		}
for(int j=0; j<base; j++) {
			
			resp.getWriter().println("<br>");
		for(int i=j; i>=1; i--) {
			resp.getWriter().print("-");
			
		}
		
		  for(int k=j; k<base;k++)
			resp.getWriter().println("*");
			
		}
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}

}
