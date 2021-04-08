
import com.generation.projectmiranchito.models.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
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
public class TestSelectQueryUsuario {
    
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
        
        Query query = entityManager.createQuery("SELECT u FROM Usuario u");
        assertNotNull(query);
        
        List<Usuario> usuarios = query.getResultList();
        assertFalse(usuarios.isEmpty());
        for(Usuario usuario:usuarios){
            System.out.println(usuario);
        }
        
        
    }//final de funcion
}
