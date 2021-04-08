/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.sistemacita;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesus Martinez
 */
@WebServlet(name="ListaCitaServlet", urlPatterns = "/citas")
public class ListaCitaServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet results = null;
        
        String query = "select c.id_cita, c.id_cliente, c.id_servicio, concat(cl.nombre, ' ', cl.apellido_paterno) as nombre_cliente, s.nombre as nombre_servicio, c.fecha_cita, c.estatus_cita, c.comentario, c.fecha_registro from cita c inner join cliente cl on cl.id_cliente = c.id_cliente inner join servicio s"
                        + " on s.id_servicio = c.id_servicio";
        
        
    }
    
    
    
}
