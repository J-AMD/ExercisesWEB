/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.sistemacita;

import com.sun.istack.internal.logging.Logger;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesus Martinez
 */
@WebServlet (name="EditarCitaServlet", urlPatterns = "/cita/editar")
public class eDITARcITAsERVLET extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        Connection conn = null;
        Statement stmt = null;
        Statement stmtCliente = null;
        Statement stmtServicio = null;
        //Resultado de cita
        ResultSet results = null;
        ResultSet resultsCliente = null;
        ResultSet resultServicio = null;
        
        List<Cliente> clientes = new ArrayList<>();
        List<Servicio> servicios = new ArrayList<>();
        cita cita1 = new cita();
        
        String query = "select * from cita where id_cita = "+ idCita;
        String queryCliente = "select * from cliente";
        String queryServicio = "select * from servicio";
        
        try {
            conn = JDBCUtility.getConnection(3306);
            stmt = conn.createStatement();
            
            results = stmt.executeQuery(query);
            while(results.next()){
                int idCita = results.getInt("id_cita");
                int idCliente = results.getInt("id_cliente");
                int idServicio = results.getInt("id_servicio");
                String fechaCita = results.getString("fecha_cita");
                String comentario = results.getString("comentario");
                
                cita1.setIdCita(idCita);
                cita1.setIdCliente(idCliente);
                cita1.setIdServicio(idServicio);
                cita1.setFechaCita(fechaCita);
                cita1.setComentarios(comentario);
                
            }
            
            stmtCliente = conn.createStatement();
            resultsCliente = stmtCliente.executeQuery(queryCliente);
            while(resultsCliente.next()){
                
                int idCliente = resultsCliente.getInt("id_cliente");
                String nombre = resultsCliente.getString("nombre") + resultsCliente.getString("apellido_paterno");
                
                Cliente cliente = new Cliente();
                cliente.setIdCliente(idCliente);
                cliente.setNombre(nombre);
                
                clientes.add(cliente); // agrega al clienta a la lista clientes
            }
            
            stmtServicio = conn.createStatement();
            resultServicio = stmtServicio.executeQuery(queryServicio);
            while(resultServicio.next()){
                int idServicio = resultServicio.getInt("id_servicio");
                String nombre = resultServicio.getString("nombre");
                
                Servicio servicio = new Servicio(); // falta crear clase Servicio con setters & getters
                servicio.setIdServicio(idServicio);
                servicio.setNombre(nombre);
                
                servicios.add(servicio); // agregame el objeto servicio a la ista servicios
                
            }
        } catch (SQLException ex) {
        }finally{
            if(results != null && resultsCliente != null && resultServicio != null){
             
                try {
                    results.close();
                    resultsCliente.close();
                    resultServicio.close();
                } catch (SQLException e) {
                    Logger.getLogger(eDITARcITAsERVLET.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            
            if(stmt != null && stmtCliente != null && stmtServicio != null){
                
                try {
                    stmt.close();
                stmtCliente.close();
                stmtServicio.close();
                } catch (SQLException e) {
                    Logger.getLogger(eDITARcITAsERVLET.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            
            if(conn != null){
                try {
                    JDBCUtility.closeConnection(conn);
                } catch (SQLException e) {
                    Logger.getLogger(eDITARcITAsERVLET.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
        req.setAttribute("idCita", cita1.getFechaCita());
        req.setAttribute("idCliente", cita1.getIdCliente());
        req.setAttribute("idServicio", cita1.getIdServicio());
        req.setAttribute("fechaCita", cita1.getFechaCita());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String idCita = req.getParameter("idCita");
        String idCliente = req.getParameter("idCliente"); // names de los formularios
        String idServicio = req.getParameter("idServicio");
        String fechaCita = req.getParameter("fechaCita");
        String comentario = req.getParameter("comentario");
        
        
        Connection conn = null;
        Statement pstmt = null;
        int result = -1;
        
        String query = "update cita set id_cliente=?, id_servicio=?, fecha_cita=?, comentario=? where id_cita=?";
        
        try{
            conn = JDBCUtility.getConnection(3306);
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(idCliente));
            pstmt.setInt(1, Integer.parseInt(idServicio));
            pstmt.setInt(1, Integer.parseInt(idCliente));
            result = pstmt.executeUpdate();
            
        }catch(){
            
        }finally{
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException ex) {
                    
                    Logger.getLogger(eDITARcITAsERVLET.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            if(conn != null){
                try {
                    JDBCUtility.closeConnection(conn);
                } catch (SQLException ex) {
                    
                    Logger.getLogger(eDITARcITAsERVLET.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
        
    }
    
    
    
}
