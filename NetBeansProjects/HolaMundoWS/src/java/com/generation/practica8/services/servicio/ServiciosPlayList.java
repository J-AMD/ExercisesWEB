/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.practica8.services.servicio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Jesus Martinez
 */
@Path("playlist")
public class ServiciosPlayList {/*
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    
    public Response crearPlayList(String json){
        Gson gson = new Gson();
        Playlist playlist = gson.fromJson(json, Playlist.class);
        playlist.setFechaRegistro(new Date());
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MusicalistPU");
        
        entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();
        entityManager.persistence
        
    }*/
}
