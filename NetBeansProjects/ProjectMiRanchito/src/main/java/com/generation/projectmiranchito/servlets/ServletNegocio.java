/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.projectmiranchito.servlets;
import com.generation.projectmiranchito.models.Negocio;
import com.generation.projectranchito.services.ServiciosRanchito;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesus Martinez
 */
@WebServlet(name = "ServletNegocio", urlPatterns = {"/negocio"})
public class ServletNegocio extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String query = (String)request.getParameter("n");
        System.out.println(query);
        Negocio n = ServiciosRanchito.getNegocio(Integer.parseInt(query));
        response.getWriter().print(n.getCorreo());
        request.setAttribute("n", n);
        request.getRequestDispatcher("negocio.jsp").forward(request, response);
    }

}
