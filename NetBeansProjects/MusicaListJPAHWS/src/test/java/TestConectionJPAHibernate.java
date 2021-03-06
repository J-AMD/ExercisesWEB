
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.junit.Assert.*;
import org.junit.Test;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipon
 */
public class TestConectionJPAHibernate {
    public static final String PERSISTENCE_UNIT_NAME = "MusicaListPU";
    
    @Test
    public void testConnection(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        System.out.println("Creo el manager factory");
        EntityManager emanager = emf.createEntityManager();
        assertNotNull(emanager);
        System.out.println("Creo el entity manager");
        emanager.close();
        assertTrue(!emanager.isOpen());
        System.out.println("Cerro Correctamente");
    }
}
