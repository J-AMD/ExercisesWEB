/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.generation.musicalistjpahws.models.Artista;
import com.generation.musicalistjpahws.models.Cancion;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author felipon
 */
public class TestInsertSongs {/*
     public static final String PERSISTENCE_UNIT_NAME = "MusicaListPU";
     
     @Test
     public void testinsertSongs(){
       EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        
        System.out.println("Creo el manager factory");
        EntityManager emanager = emf.createEntityManager();
        
        assertNotNull(emanager);
        System.out.println("Creo el entity manager");   
        
        Artista artista1 = emanager.find(Artista.class,1);
        Artista artista2 = emanager.find(Artista.class,2);
        Artista artista3 = emanager.find(Artista.class,3);
        Artista artista4 = emanager.find(Artista.class,4);
        Artista artista5 = emanager.find(Artista.class,5);
        
        Cancion feria = new Cancion();
        feria.setNombre("Feria Cepillin");
        feria.setDuracion(5);
        feria.setId_artista(artista1.getId());
        feria.setFecharegistro(new Date());
        
        emanager.persist(feria);
        assertTrue(feria.getId()>0);
        
        //"SELECT u FROM Usuario u where u.correo = :correo AND u.contraseña = contraseña"
     }*/
}
