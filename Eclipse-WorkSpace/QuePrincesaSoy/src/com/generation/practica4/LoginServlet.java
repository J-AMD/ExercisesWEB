package com.generation.practica4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String correo = req.getParameter("mail");
		String pass = req.getParameter("pass");
		
		if(correo.equals("tupapa@gmail.com") && pass.equals("123")) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("test.html");
			dispatcher.forward(req, resp);
			
		}
	}

}
