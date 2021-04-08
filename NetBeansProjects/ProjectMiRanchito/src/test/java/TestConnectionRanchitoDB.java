/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jesus Martinez
 */
public class TestConnectionRanchitoDB {
    
        public static final String PERSISTENCE_UNIT_NAME = "RanchitoPU";
    
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
