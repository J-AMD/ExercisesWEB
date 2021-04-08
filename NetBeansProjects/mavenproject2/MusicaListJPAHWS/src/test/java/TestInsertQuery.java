
import com.generation.musicalistjpahws.models.Artista;
import com.generation.musicalistjpahws.models.Cancion;
import java.util.Date;
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
 * @author Jesus Martinez
 */
public class TestInsertQuery {
    
    public static final String PERSISTENCE_UNIT_NAME = "MusicaListPU";
    
    @Test
    public void testCancionQuery(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        
        assertNotNull(emf);
        System.out.println("Se creo el Entity Manager Factory");
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo el Entity Manager");
        
        entityManager.getTransaction().begin();
        
        Artista cepillin = new Artista();
        cepillin.setNombre("Cepillin");
        cepillin.setResumen("Payaso de fiestas");
        cepillin.setGenero("Infantil");
        cepillin.setImagen_url("imagen");
        cepillin.setFecha_Registro(new Date());
        
        entityManager.persist(cepillin);
        
        assertTrue(cepillin.getId() > 0);
        System.out.println("Se persistio un objeto cancion");
        
        Cancion lasMananitas = new Cancion();
        lasMananitas.setNombre("Las mañanitas con Cepillin");
        lasMananitas.setDuracion(2);
        lasMananitas.setId_Artista(cepillin.getId());
        lasMananitas.setFecha_Registro(new Date());
        
        entityManager.persist(lasMananitas);
        
        assertTrue(lasMananitas.getId() > 0);
        System.out.println("Se persistio un objeto cancion");
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        
        assertTrue(!entityManager.isOpen());
        System.out.println("Se cerro la conexion");
    }
}
