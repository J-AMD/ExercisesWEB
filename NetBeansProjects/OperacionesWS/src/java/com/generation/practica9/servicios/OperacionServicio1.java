/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.practica9.servicios;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
/**
 *
 * @author felipon
 */
@Path("operacion1")
public class OperacionServicio1 {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("suma/{num1}/{num2}")
    public String operacionSuma(@PathParam("num1")int numero1,@PathParam("num2") int numero2){
    return"{\"resultado\":"+(numero1+numero2)+"}";    
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("resta")
    public String operacionResta(@QueryParam("num1")int numero1,@QueryParam("num2") int numero2){
        return"{\"resultado\":"+(numero1-numero2)+"}";
    }
    
    @POST
     @Produces(MediaType.APPLICATION_JSON)
    @Path("multiplicacion")
    public String operacionMultiplicacion(@FormParam("numero1")int numero1,@FormParam("numero2")int numero2){
        return"{\"resultado\":"+(numero1*numero2)+"}";
    }
    
    @POST
      @Produces(MediaType.APPLICATION_JSON)
    @Path("division")
    public String operacionDivision(@FormParam("numero1")int numero1,@FormParam("numero2")int numero2){
       return"{\"resultado\":"+(numero1/numero2)+"}";
    }
}