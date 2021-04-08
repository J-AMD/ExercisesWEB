/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.generation.musicalistjpahws.models.Artista;
import com.generation.musicalistjpahws.models.Cancion;
import com.generation.musicalistjpahws.models.Playlist;
import com.generation.musicalistjpahws.models.Usuario;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author felipon
 */
public class TestInsertQuery {
    
    public static final String PERSISTENCE_UNIT_NAME = "MusicaListPU";
    private EntityManager entityManager;
    
    @Before
    public void openConnection(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        System.out.println("Se creo la fábrica");
        assertNotNull(emf);
        entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo el manejador");
    }
    
    public void testCancionQuery(){ 
        entityManager.getTransaction().begin();
        
        Artista kendrick = new Artista();
        kendrick.setNombre("Kendrick Lamar");
        kendrick.setResumen("GOAT");
        kendrick.setGenero("RAP");
        kendrick.setImagenUrl("urlfalso");
        kendrick.setFechaRegistro(new Date());
        
        entityManager.persist(kendrick);
        assertTrue(kendrick.getId()>0);
        
        Cancion kingk = new Cancion();
        kingk.setNombre("King Kunga");
        kingk.setDuracion(3);
        kingk.setId_artista(kendrick.getId());
        kingk.setFecharegistro(new Date());
        
        entityManager.persist(kingk);
        assertTrue(kingk.getId()>0);
        
        Artista drake = new Artista();
        drake.setNombre("Drake");
        drake.setResumen("Not GOAT but ok");
        drake.setGenero("RAP");
        drake.setImagenUrl("urlfalso");
        drake.setFechaRegistro(new Date());
        
        entityManager.persist(drake);
        assertTrue(drake.getId()>0);
        
        Cancion hold = new Cancion();
        hold.setNombre("Hold On We´re Going Home");
        hold.setDuracion(3);
        hold.setId_artista(drake.getId());
        hold.setFecharegistro(new Date());
        
        entityManager.persist(hold);
        assertTrue(hold.getId()>0);
        
        Artista rosalia = new Artista();
        rosalia.setNombre("Rosalia");
        rosalia.setResumen("Chiquitita");
        rosalia.setGenero("Flamenco/Reggaeton");
        rosalia.setImagenUrl("urlfalso");
        rosalia.setFechaRegistro(new Date());
        
        entityManager.persist(rosalia);
        assertTrue(rosalia.getId()>0);
        
        Cancion aute = new Cancion();
        aute.setNombre("Aute Cuture");
        aute.setDuracion(3);
        aute.setId_artista(rosalia.getId());
        aute.setFecharegistro(new Date());
        
        entityManager.persist(aute);
        assertTrue(aute.getId()>0);
        
        Artista donO = new Artista();
        donO.setNombre("Don Omar");
        donO.setResumen("Rey de Reyes");
        donO.setGenero("Reggaeton Viejito");
        donO.setImagenUrl("urlfalso");
        donO.setFechaRegistro(new Date());
        
        entityManager.persist(donO);
        assertTrue(donO.getId()>0);
        
        Cancion salio = new Cancion();
        salio.setNombre("Don Omar");
        salio.setDuracion(3);
        salio.setId_artista(donO.getId());
        salio.setFecharegistro(new Date());
        
        entityManager.persist(salio);
        assertTrue(salio.getId()>0);
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        
        assertTrue(!entityManager.isOpen());
    }
    
    
    public void testInsertUser(){
        entityManager.getTransaction().begin();
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis Felipe");
        usuario.setApellidos("García Sánchez");
        usuario.setContraseña("contraseña");
        usuario.setCorreo("luisfelipegs07@gmail.com");
        usuario.setFechaRegistro(new Date());
        usuario.setNick("Felipe");
        entityManager.persist(usuario);
        assertTrue(usuario.getId()>0);
        
        Playlist playlist = new Playlist();
        playlist.setDuracion("60");
        playlist.setIdUsuario(usuario.getId());
        playlist.setImagenUrl("Url Imagen");
        playlist.setNombre("Correr");
        playlist.setFechaRegistro(new Date());
        
        entityManager.persist(playlist);
        assertTrue(playlist.getId()>0);  
        
        entityManager.getTransaction().commit();
    }
    
  
    public void testCancion1(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        
        System.out.println("Creo el manager factory");
        EntityManager emanager = emf.createEntityManager();
        
        assertNotNull(emanager);
        System.out.println("Creo el entity manager");   
        
        Artista artista1 = emanager.find(Artista.class,2);
        assertNotNull(artista1);
        System.out.println("Creo el Artista");   
        
        Cancion cancion = new Cancion();
        cancion.setId_artista(artista1.getId());
        cancion.setNombre("Peer Pressure");
        cancion.setDuracion(4);
        cancion.setArtista(artista1);
        cancion.setFecharegistro(new Date());
     
        
        
        emanager.getTransaction().begin();
        
        emanager.persist(cancion);
        assertTrue(cancion.getId()>0);
          System.out.println("Creo la cancion"); 
        emanager.getTransaction().commit();
         System.out.println("Se persistió"); 
    }
    
    
    public void testPlaylistCancionQuery(){
        try{
            Cancion cancion = entityManager.find(Cancion.class,1);
            assertNotNull(cancion);
            Playlist playlist = entityManager.find(Playlist.class,1);
            assertNotNull(playlist);
            /*
            List<Cancion> canciones = playlist.getCanciones();
            int listsize = canciones.size();
            
            entityManager.getTransaction().begin();
            canciones.add(cancion);
            entityManager.getTransaction().commit();
            
            assertTrue(listsize<canciones.size());
            */
        }catch(Exception e){
            e.printStackTrace();
                if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
              System.out.println("Entro al catch");
        }
    }
    
     @Test
    public void testUsarioPlaylistQuery(){
        try{
            Usuario usuario = entityManager.find(Usuario.class,1);
            assertNotNull(usuario);
            Playlist playlist = entityManager.find(Playlist.class,1);
            assertNotNull(playlist);
            
            List<Playlist> playlists =usuario.getPlaylists();
            int listsize = playlists.size();
            
            entityManager.getTransaction().begin();
            playlists.add(playlist);
            entityManager.getTransaction().commit();
            
            assertTrue(listsize<playlists.size());
            
        }catch(Exception e){
            e.printStackTrace();
                if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
              System.out.println("Entro al catch");
        }
    }
    
    @After
    public void CloseConnection(){
       entityManager.close();
        assertTrue(!entityManager.isOpen());  
    }
}
