//Programa por medio de un Servlet se envian datos al archivo index.jsp
//14/05/2019
import java.util.List;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrincipalServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nombre = "Jesus Abraham Martinez Duran";
		String[] cosasPorHacaer = {
				"Levantarme en la mañana",
				"Desayuunar",
				"lavarme los dientes",
				"Preparar desayuno",
				"Vestirme"
		};
		
		List<String> lista = Arrays.asList(cosasPorHacaer);
		System.out.println(lista);
		RequestDispatcher dispatcher = req.getRequestDispatcher("Principal.jsp"); //Despachador de solicitus,recibe el archivo al que se desea pasar datos
		req.setAttribute("nombreUsuario", nombre);
		req.setAttribute("listaCosas", lista);
		dispatcher.forward(req, resp);
	}

}
