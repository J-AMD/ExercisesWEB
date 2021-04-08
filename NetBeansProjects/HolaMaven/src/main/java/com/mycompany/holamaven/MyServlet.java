/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.holamaven;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesus Martinez
 */
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        String[] lista = {
               "Carro",
                "Moto",
                "Bicicleta"
    
        };
        
        
        List<String> listaVehiculos = Arrays.asList(lista);
       // System.out.println(listaVehiculos);
        RequestDispatcher dispatcher = req.getRequestDispatcher("lista.jsp");
        req.setAttribute("carros", listaVehiculos);
        dispatcher.forward(req, resp);
    }


}
