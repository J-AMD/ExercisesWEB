/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.projectranchito.services;

import com.generation.projectmiranchito.models.Negocio;
import com.generation.projectmiranchito.models.Usuario;
import com.generation.projectranchito.response.RespuestaServicios;
import com.google.gson.Gson;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Jesus Martinez
 */
@Path("ranchito")
public class ServiciosRanchito {
    
    static EntityManager entityManager = null;
/*
    //Get para traer los datos de la base en formato JSON
    public Response obtenerUsuario(){
        try{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("RanchitoPU");
            
            entityManager = emf.createEntityManager();
            
            Query query = entityManager.createQuery("SELECT u FROM Usuario u");
            
            List<Usuario> usuario = query.getResultList();
            
            String respuestaJSON = new Gson().toJson(usuario);
            return Response.ok().entity(respuestaJSON).build();
            
        }catch(Exception e){
            e.printStackTrace();
            if(entityManager != null){
                if(entityManager.getTransaction() != null){
                    entityManager.getTransaction().rollback();
                }
            }
            RespuestaServicios rs = new RespuestaServicios();
            rs.setCodigo(0);
            rs.setMensaje(e.getMessage());
            String respuestaJSON = new Gson().toJson(rs);
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(respuestaJSON).build();
        }finally{
            if(entityManager != null)
                entityManager.close();
        }
    }
*/      
    static public List obtenerNegocios(){
        try{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("RanchitoPU");
          
            entityManager = emf.createEntityManager();
            
            Query query = entityManager.createQuery("SELECT n FROM Negocio n");
            
            List<Negocio> negocios = query.getResultList();
            
            return negocios;
            
        }catch(Exception e){
            e.printStackTrace();
            if(entityManager != null){
                if(entityManager.getTransaction() != null){
                    entityManager.getTransaction().rollback();
                }
            }
            RespuestaServicios rs = new RespuestaServicios();
            rs.setCodigo(0);
            rs.setMensaje(e.getMessage());
            String respuestaJSON = new Gson().toJson(rs);
            return null;
        }finally{
            if(entityManager != null)
                entityManager.close();
        }
    }
    
    public static Negocio getNegocio(int id){
        try{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("RanchitoPU");
          
            entityManager = emf.createEntityManager();
            
            Query query = entityManager.createQuery("SELECT n FROM Negocio n WHERE n.id=:id")
                    .setParameter("id",id).setMaxResults(1);
            //String employeeName = session.createQuery("select empMaster.name from EmployeeMaster empMaster where empMaster.id = :id").setInteger("id",10).uniqueResult();
            //List<Negocio> n = query.getResultList();
            return (Negocio)query.getSingleResult();
        }catch(Exception e){
            e.printStackTrace();
            if(entityManager != null){
                if(entityManager.getTransaction() != null){
                    entityManager.getTransaction().rollback();
                }
            }
            RespuestaServicios rs = new RespuestaServicios();
            rs.setCodigo(0);
            rs.setMensaje(e.getMessage());
            String respuestaJSON = new Gson().toJson(rs);
            return null;
        }finally{
            if(entityManager != null)
                entityManager.close();
        }
    } 
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response crearUsuario(String json){
        Gson gson = new Gson(); //CREAR OBJETO PARA SERIALIZAR
        
        try{
        Usuario usuario = gson.fromJson(json, Usuario.class);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RanchitoPU");
        
        entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();//Para realizar operacion n la base de datos select, insert, update...
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
        
        //sERIALIZAR //convertir de objeto a JSON
        String respuestaJson = new Gson().toJson(usuario);//lineas agregadas despues de el error de relacion
        return Response.ok().entity(respuestaJson).build();//lineas agregadas despues de el error de relacion
        //return Response.ok().entity(playlist).build();
        }catch(Exception e){
            e.printStackTrace();
            if(entityManager != null){
                if(entityManager.getTransaction()!=null){
                 entityManager.getTransaction().rollback();
                }
            }
            RespuestaServicios rs = new RespuestaServicios();
            rs.setCodigo(0);
            rs.setMensaje(e.getMessage());
            String respuestaJson = new Gson().toJson(rs);//lineas agregadas despues de el error de relacion
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(rs).build();
        }
    
    }
    
    @PUT
    @Path("{id}")
    public Response modificarUsuario(@PathParam("id") int id){
        return null;
        
    }
}
