/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.practica5.ServletAlumno;

import com.generation.practica5.servlets.ListaAlumnoServlet;
import com.generation.practica5.util.JDBCUtility;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesus Martinez
 */
@WebServlet(name = "AlumnosRegistro", urlPatterns = {"/alumnos"})
public class AlumnoServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        String nombre = req.getParameter("nombre");
        String apellidoP = req.getParameter("apellidoP");
        String apellidoM = req.getParameter("apellidoM");
        String nacimiento = req.getParameter("nacimiento");
        String carrera = req.getParameter("carrera");
        
        Connection conn = null;
        Statement stmt = null;
        PrintWriter salida = null;
        
        String query = "insert into alumno " + "(nombre, apellidoP, apellidoM, fechaNac, fechaReg, carrera) "
                        + "values('" + nombre + "', '" + apellidoP + "', '"+ apellidoM + "', '" + nacimiento + 
                          "', now(), '" + carrera + "');";
        
        resp.setContentType("text/html");
        salida = resp.getWriter();
        
        conn = JDBCUtility.getConnection(3306);
     
        try{
            
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            
            
        
            salida.println("<h3>Se realizo el registro con exito</h3>");
            
            stmt.close(); //Es importante cerrar las conexiones
            JDBCUtility.closeConnection(conn);
        } catch(SQLException ex){
           Logger.getLogger(AlumnoServlet.class.getName()).log(Level.SEVERE, null, ex);
           salida.println("<h3>No se pudo realizar el registro</h3>");
        }finally{ // en caso de error que no entre a try o catch finally cerrara la conexion 
            try {
            stmt.close(); //Es importante cerrar las conexiones
            JDBCUtility.closeConnection(conn);
            } catch (SQLException ex) {
                Logger.getLogger(ListaAlumnoServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
  
    }
}
