
import com.generation.musicalistjpahws.models.Cancion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import static org.junit.Assert.*;
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
public class TestSelectQuery {
    
    public static final String PERSISTENCE_UNIT_NAME = "MusicaListPU";

    
     @Test
    public void testSelect(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        
        assertNotNull(emf);
        System.out.println("Se creo el Entity Manager Factory");
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo el Entity Manager");
        
         Query query = entityManager.createQuery("SELECT c FROM Cancion c");
         assertNotNull(query);
         List<Cancion> canciones = query.getResultList();
         assertFalse(canciones.isEmpty());
         for(Cancion cancion: canciones){
             System.out.println(cancion);
         }
         
         //Seleccionar una instancia objeto /registro
         Cancion cancion1 = entityManager.find(Cancion.class, 1);
         assertNotNull(cancion1);
         System.out.println(cancion1);
    }
}
