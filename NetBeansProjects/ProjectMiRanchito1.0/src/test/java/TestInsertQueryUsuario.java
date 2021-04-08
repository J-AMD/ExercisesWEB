
import com.generation.projectmiranchito.models.Usuario;
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
public class TestInsertQueryUsuario {
    
    public static final String PERSISTENCE_UNIT_NAME = "RanchitoPU";
    private EntityManager entityManager;
    
    //@Test
    public void TestUsuarioInsertQuery(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        
        assertNotNull(emf);
        System.out.println("Se creo el entity Manager Factory");
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo el Entity Manager");
        
        entityManager.getTransaction().begin();
        
        Usuario user = new Usuario();
        user.setNombre("Lesser");
        user.setApellidoP("Sabra");
        user.setApellidoM("Dios");
        user.setNegocio("Dulceria");
        user.setSexo("Masculino");
        user.setNacimiento("1996-02-01");
        user.setEmail("cartulina@gmail.com");
        user.setUser("les");
        user.setPassword("123");
        
        entityManager.persist(user);
        
        assertTrue(user.getId() > 0);
        
        //En dado caso se creen mas objetos deben ir antes del commit
        entityManager.getTransaction().commit();
        
        entityManager.close();
        
        assertTrue(!entityManager.isOpen());
        System.out.println("Se cerro la conexion");
    }
    
}
