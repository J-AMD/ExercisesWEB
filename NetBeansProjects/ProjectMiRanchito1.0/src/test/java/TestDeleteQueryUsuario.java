
import com.generation.projectmiranchito.models.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Martinez
 */
public class TestDeleteQueryUsuario {
    
    public static String PERSISTENCE_UNIT_NAME = "RanchitoPU";
    private EntityManager entityManager;
    
    //@Test
    public void obtenerUsuario(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        
        assertNotNull(emf);
        System.out.println("Se creo el entity Manager Factory");
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo el Entity Manager");
        
 
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("DELETE FROM Usuario u WHERE u.id = 1");
        
        query.executeUpdate();

        entityManager.getTransaction().commit();
        
        entityManager.close();
        assertTrue(!entityManager.isOpen());
        System.out.println("Se cerro la conexion");
        
    }//final de funcion
}
