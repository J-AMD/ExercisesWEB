package com.generation.practica4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String[] urlImagenes = {
				"url.jpg", //EN ESTA LISTA VAN LAS URL DE LAS IMAGENES A MOSTRAR
				"",
				""
		};
		
		int ariel = 0, blancaNieves=0, bellaDurmiente=0;
		
		String respuesta1 = req.getParameter("respuesta1");
		String respuesta2 = req.getParameter("respuesta2");
		String respuesta3 = req.getParameter("respuesta3");
		String respuesta4 = req.getParameter("respuesta4");
		String respuesta5 = req.getParameter("respuesta5");
		String respuesta6 = req.getParameter("respuesta6");
		String respuesta7 = req.getParameter("respuesta7");
		String respuesta8 = req.getParameter("respuesta8");
		String respuesta9 = req.getParameter("respuesta9");
		String respuesta10 = req.getParameter("respuesta10");
	}

}
