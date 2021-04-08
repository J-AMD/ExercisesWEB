/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.practica5.servlets;

import com.generation.practica5.util.JDBCUtility;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
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
@WebServlet(name = "ListaAlumnos", urlPatterns = {"/lista"})
public class ListaAlumnoServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        Connection conn = null; //Este objeto permite esteblecer la conexion
        Statement stmt = null; // Objeto para peticion de que accion hacer
        PrintWriter salida = null; //Salida de contenido de la pagina
        
        String query = "Select * from alumno;"; //esta query es para obtener la info desd la base de datos
        
        resp.setContentType("text/html"); //Indica el tipo de contenido que muestra la pagina
        salida = resp.getWriter(); //Inicializando el objeto salida para preparar el contenido de la pagina web
        
        try{ //establecer la conexion a la base de datos
            
        conn = JDBCUtility.getConnection(3306);
        stmt = conn.createStatement(); // crea una conexion conn a traves de un statement
        
        ResultSet resultados = stmt.executeQuery(query);  //ejecuta la query select (resulset)
        while(resultados.next()){ // Si hay filas siguietes en un conjunto de datos y posiciono
            int idAlumno = resultados.getInt("id_alumno");
            String nombre = resultados.getString("nombre");
            String apellidoP = resultados.getString("apellidoP");
            String apellidoM = resultados.getString("apellidoM");
            
            salida.println("<h4>" + idAlumno + "</h4>");
            salida.println("<h3>" + nombre + " " + apellidoP + " " + apellidoM + "</h3>");
            
        }
        
        stmt.close(); //Es importante cerrar las conexiones
        JDBCUtility.closeConnection(conn);
        
        } catch (SQLException ex){
            Logger.getLogger(JDBCUtility.class.getName()).log(Level.SEVERE, null, ex);
        } finally{ // en caso de error que o entre a try o catch finally cerrara la conexion 
            try {
            stmt.close(); //Es importante cerrar las conexiones
            JDBCUtility.closeConnection(conn);
            } catch (SQLException ex) {
                Logger.getLogger(ListaAlumnoServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
