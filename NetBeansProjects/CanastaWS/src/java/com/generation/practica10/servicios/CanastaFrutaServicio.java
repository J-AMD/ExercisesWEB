/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.practica10.servicios;

import com.generation.practica10.model.*;
import com.generation.practica10.respuestas.RespuestaServicio;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
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
@Path("canasta")
public class CanastaFrutaServicio {
    
    @POST
    @Path("agregar")
    @Produces(MediaType.APPLICATION_JSON)
    public String agregarFruta(@FormParam("nombre") String nombre, @FormParam("color") String color, @FormParam("precio") float precio, @FormParam("peso") float peso){
        Fruta fruta = new Fruta(nombre, color, peso, precio);
        CanastaFruta.agregarFruta(fruta);
        return fruta.toString();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerFrutas(){
        List<Fruta> frutas = CanastaFruta.obtenerFrutas();
        return Response.ok().entity(frutas).build();
    }
    
    @DELETE
    @Path("eliminar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminarFruta(@FormParam("id") int id){
        System.out.println("Entro para eliminar");
        boolean fueEliminado = CanastaFruta.eliminarFruta(id);
        RespuestaServicio respuesta = new RespuestaServicio();
        if(fueEliminado){
            respuesta.setCodigo(1);
            respuesta.setMensaje("Se elimino con exito");
        }else{
            respuesta.setCodigo(0);
            respuesta.setMensaje("No se encontro lo solicitado");
        }
        return Response.status(Response.Status.NOT_FOUND).entity(id).build();
    }
    
    @PUT
    @Path("actualizar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response actualizarFruta(@PathParam("id") int id, Fruta fruta){
        
        System.out.println("Entro para actualizar");
       // CanastaFruta.actualizarFruta(id, fruta);
        RespuestaServicio respuesta = new RespuestaServicio();
        respuesta.setCodigo(1);
        respuesta.setMensaje("Precio actualizado");
        return Response.ok().entity(respuesta).build();
    }
    
    @GET
    @Path("fruta/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerFrutaPorId(@PathParam("id") int id){
        Fruta fruta = CanastaFruta.obtenerFruta(id);
        if(fruta != null){
            return Response.ok().entity(fruta).build();
        }else{
            RespuestaServicio respuestaS = new RespuestaServicio();
            respuestaS.setCodigo(1);
            respuestaS.setMensaje("No existe la fruta");
            return Response.status(Response.Status.NOT_FOUND).entity(respuestaS).build();
        }
    }
    /*
    @GET
    @Path("fruta/contar/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response contarFruta(@PathParam("nombre") String nombre){
        int cont = CanastaFruta.contarFruta(nombre.toLowerCase());
        return Response.ok().entity("{ \"nombre\": \""
                                     + "\", \"numero\":" + cont +"}").build();
    }*/
    
}

