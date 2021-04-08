
import com.generation.musicalistjpahws.models.Artista;
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
 * @author felipon
 */
public class TestSelectQuery {
    /*
     public static final String PERSISTENCE_UNIT_NAME = "MusicaListPU";
    
    @Test
    public void testSelect(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        
        System.out.println("Creo el manager factory");
        EntityManager emanager = emf.createEntityManager();
        
        assertNotNull(emanager);
        System.out.println("Creo el entity manager");
        
        Query query = emanager.createQuery("SELECT c FROM Cancion c");
        assertNotNull(query);
        
        List<Cancion> canciones = query.getResultList();
        assertFalse(canciones.isEmpty());
        for(Cancion cancion:canciones){
            System.out.println(cancion);
        
        }
        
        Query queryArtista = emanager.createQuery("SELECT a FROM Artista a");
        assertNotNull(queryArtista);
        List<Artista> artistas = queryArtista.getResultList();
        assertFalse(artistas.isEmpty());
        for(Artista artista:artistas){
            System.out.println(artista);
        }
        
        Cancion cancion1 = emanager.find(Cancion.class,1);
        assertNotNull(cancion1);
        System.out.println("De a solas");
        System.out.println("");
        System.out.println("");
        System.out.println(cancion1);
        Cancion cancion2 = emanager.find(Cancion.class,2);
        assertNotNull(cancion2);
        System.out.println(cancion2);/*
        Cancion cancion3 = emanager.find(Cancion.class,3);
        assertNotNull(cancion3);
        System.out.println(cancion3);
        */
       // Query queryUsuario = emanager.createQuery("SELECT ");
        //}
        
}
