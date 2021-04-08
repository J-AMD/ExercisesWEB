
import com.generation.practica5.util.JDBCUtility;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Martinez
 */
public class TestConnectionDB {
    @Test
    public void testConnection(){
        
        Connection conn = JDBCUtility.getConnection(3306);
        assertNotNull(conn);
        JDBCUtility.closeConnection(conn);
        try{
            assertTrue(conn.isClosed());
        } catch(SQLException ex){
            ex.printStackTrace();
            //Logger.getLogger(TestConnectionDB.class.getName()) .log(Level.SEVERE, null, ex);
        }
    }
}
