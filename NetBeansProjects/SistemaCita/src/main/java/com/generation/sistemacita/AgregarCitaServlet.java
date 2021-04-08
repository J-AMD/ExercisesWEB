/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.sistemacita;

import com.sun.istack.internal.logging.Logger;
import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@WebServlet (name="AgregarCitaServlet", urlPatterns = "/cita/agregar")
public class AgregarCitaServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Connection conn = null;
        Statement stmtc = null;
        Statement stmts = null;
        ResultSet resultsC = null;
        ResultSet resultsS = null;
        
        String queryC = "select * from cliente";
        String queryS = "select * from servicio";
        
        
        //Lista de modelos
        
        
        
        
        ///////////////////////////////
        
        
        try{
            
            
            
            
        }catch(SQLException ex){
            Logger.getLogger(AgregarCitaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(resultsC != null && resultsS != null){
                try{
                    resultsC.close();
                    resultsS.close();
                } catch (SQLException ex){
                    Logger.getLogger(AgregarCitaServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idCliente = req.getParameter("idCliente");
        String idServicio = req.getParameter("idServicio");
        String fechaCita = req.getParameter("fecha_Cita");
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        int results = -1;
        
        String query = "insert into cita (id_cliente, id_servicio, fecha_cita) " +
                "values(?, ?, ?, ?);";
        
        try{
            conn = JDBCUtility.getConnection();
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(idCliente));
            pstmt.setInt(2, Integer.parseInt(idServicio));
            pstmt.setString(3, fechaCita);
            
            results = pstmt.executeUpdate();
            
        } catch(SQLException ex){
        }finally{
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException ex) {
                    
                    Logger.getLogger(AgregarCitaServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            if(conn != null){
                try {
                    JDBCUtility.closeConnection(conn);
                } catch (SQLException ex) {
                    
                    Logger.getLogger(AgregarCitaServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
    }
    
    
    
}
