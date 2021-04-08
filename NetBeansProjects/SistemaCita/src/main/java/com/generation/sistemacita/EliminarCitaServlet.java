/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.sistemacita;

import com.sun.istack.internal.logging.Logger;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
@WebServlet(name="EliminarCitaServlet", urlPatterns = "/cita/servlet")
public class EliminarCitaServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String idCita = req.getParameter("idCita");
        Connection conn = null;
        PreparedStatement pstmt = null;
        int result = -1;
        
        String query = "delete from cita where id_cita=?";
        
        try {
            conn = JDBCUtility.getConnection();
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(idCita));
            result = pstmt.executeUpdate();
            
        } catch (SQLException e) {
           // Logger.getLogger(EliminarCitaServlet.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    pstmt.close();
                    Logger.getLogger(EliminarCitaServlet.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            if(conn!=null){
                try {
                    JDBCUtility.closeConnection();
                } catch (SQLException e) {
                    Logger.getLogger(EliminarCitaServlet.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
        if(result > 0)
        resp.sendRedirect(getServletContext().getContextPath()+ "/citas.jsp?action=delete&message=Se%20elimino%20con%20exito");
        else{
                    resp.sendRedirect(getServletContext().getContextPath()+ "/citas.jsp?action=delete&message= no se elimino");
        }
        //resp.getWriter().println("La operacion se realizo con exito");
    }
    
    
}
