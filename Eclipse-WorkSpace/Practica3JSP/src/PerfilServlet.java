import java.io.IOException;
import java.util.List;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PerfilServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String sNombre = req.getParameter("nombre");
		String sApellidos = req.getParameter("apellidos");
		String sGenero = req.getParameter("genero");
		String sCalle = req.getParameter("calle");
		String sColonia = req.getParameter("colonia");
		String sCP = req.getParameter("cp");
		String sNumero = req.getParameter("numero");
		String sCarrera = req.getParameter("otraCarrera");
		String sPromedio = req.getParameter("promedio");
		
	String[] lPerfil = {
			sNombre,
			sApellidos,
			sGenero,
			sCalle,
			sColonia,
			sCP,
			sNumero,
			sCarrera,
			sPromedio
			
	};
	
	List<String> listaPerfil = Arrays.asList(lPerfil);
	System.out.println(listaPerfil);
	RequestDispatcher dispatcher = req.getRequestDispatcher("Perfil.jsp"); //Despachador de solicitus,recibe el archivo al que se desea pasar datos
	req.setAttribute("lPerfil", listaPerfil);
	dispatcher.forward(req, resp);
	}

}
