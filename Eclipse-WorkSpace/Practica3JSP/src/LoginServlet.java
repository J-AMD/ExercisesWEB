import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String correo = req.getParameter("user");
		String pass = req.getParameter("password");
		
		if(correo.equals("tupadre@gmail.com") && pass.equals("123")) {
			/*RequestDispatcher dispatcher = req.getRequestDispatcher("Principal.jsp");
			dispatcher.forward(req, resp);*/
			resp.sendRedirect("principal");
		}
		else{
			resp.setContentType("text/html");
			resp.getWriter().println("<h2>Accesos incorrectos</h2>");
			
		}
	}

}
