/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.musicalistjpahws.models.servicios;

import com.generation.musicalistjpahws.models.Playlist;
import com.generation.musicalistjpahws.models.servicios.respuesta.RespuestaServicio;
import com.google.gson.Gson;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Jesus Martinez
 */
@Path("playlists")
public class ServiciosPlayList {
    
    EntityManager entityManager = null;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response crearPlaylist(String json){
        Gson gson = new Gson(); //CREAR OBJETO PARA SERIALIZAR
        
        try{
        Playlist playlist = gson.fromJson(json, Playlist.class);
        playlist.setFechaRegistro(new Date());
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MusicaListPU");
        
        entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();//Para realizar operacion n la base de datos select, insert, update...
        entityManager.persist(playlist);
        entityManager.getTransaction().commit();
        
        //sERIALIZAR //convertir de objeto a JSON
        String respuestaJson = new Gson().toJson(playlist);//lineas agregadas despues de el error de relacion
        return Response.ok().entity(respuestaJson).build();//lineas agregadas despues de el error de relacion
        //return Response.ok().entity(playlist).build();
        }catch(Exception e){
            e.printStackTrace();
            if(entityManager != null){
                if(entityManager.getTransaction()!=null){
                 entityManager.getTransaction().rollback();
                }
            }
            RespuestaServicio rs = new RespuestaServicio();
            rs.setCodigo(0);
            rs.setMensaje(e.getMessage());
            String respuestaJson = new Gson().toJson(rs);//lineas agregadas despues de el error de relacion
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(rs).build();
        }
    
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerPlaylist(){
        try{
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MusicaListPU");
        
        entityManager = emf.createEntityManager();
        
        Query query = entityManager.createQuery("SELECT p FROM Playlist p");
        
        List<Playlist> playlists = query.getResultList();
        
        String respuestaJson = new Gson().toJson(playlists);//lineas agregadas despues de el error de relacion
        return Response.ok().entity(respuestaJson).build();//lineas agregadas despues de el error de relacion
        //return Response.ok().entity(playlists).build();
        
        }catch(Exception e){
            e.printStackTrace();
            if(entityManager != null){
                if(entityManager.getTransaction()!=null){
                    //anular las operaciones que no se ejecutaron
                 entityManager.getTransaction().rollback();
                }
            }
            //
            RespuestaServicio rs = new RespuestaServicio();
            rs.setCodigo(0);
            rs.setMensaje(e.getMessage());
             String respuestaJson = new Gson().toJson(rs);//lineas agregadas despues de el error de relacion
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(respuestaJson).build();
        }finally{
            if(entityManager != null)
                entityManager.close();
        }
    }
    
    
}
