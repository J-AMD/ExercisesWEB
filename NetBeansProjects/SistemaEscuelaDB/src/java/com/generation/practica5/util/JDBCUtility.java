/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.practica5.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Jesus Martinez
 */
public class JDBCUtility {
    
    public static Connection getConnection(int port){
        
       
            Connection conn = null;
            Properties props = new Properties();
            props.setProperty("dbms", "mysql");
            props.setProperty("user", "root");
            props.setProperty("pass", "barbarillo");
            props.setProperty("database", "prueba");
            props.setProperty("host", "localhost");
            
            Properties connProps = new Properties();
            connProps.setProperty("user", props.getProperty("user"));
            connProps.setProperty("password", props.getProperty("pass"));
            //Creando url de conexion
            String urlConnection = "jdbc:" + props.getProperty("dbms") + "://" + props.getProperty("host") +
                    ":" + port + "/"+ props.getProperty("database") + "?useUnicode=true&useJBDCCompliantTimezoneShift=true&useLegacyDatetimeCode=false"
                    + "&serverTimezone=UTC";
                    
            
         try {    
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
           // Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(urlConnection, connProps);
            //conn.setCatalog(props.getProperty("database"));
            System.out.println("Se conecto con la base de datos");
           
        } catch (SQLException ex) {
            System.out.println("No se pudo conecta con la base de datos");
            //Logger.getLogger(JDBCUtility.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
         
            return conn;
    }

    public static void closeConnection(Connection connection)
    {
        if(connection != null){
            try {
                connection.close();
                System.out.println("exito");
            } catch (SQLException ex) {
                Logger.getLogger(JDBCUtility.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("no se conecto");
            }
        }
    }
}
