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
 * @author Jesus Martinez
 */
@Path("operacion")
public class OperacionServicio {
    
    @GET
    @Path("suma/{num1}/{num2}")
    public String operacionSuma(@PathParam("num1") int numero1, @PathParam("num2") int numero2){
        return String.format("El resultado es %s", (numero1 + numero2));
    }
    
    @GET // ejemplo de informacion que viajara url
    @Path("resta")
    @Produces(MediaType.APPLICATION_JSON)
    public String operacionResta(@QueryParam("num1") int numero1, @QueryParam("num2") int numero2){
        return "{\"resultado\":" + (numero1 - numero2) + "}";
    }
    
    @POST
    @Path("multiplicacion")
    @Produces(MediaType.APPLICATION_XML)
    public String operacionMultiplicacion(@FormParam("num1") int numero1,@FormParam("num2") int numero2){
        return "<resultado>" + (numero1 * numero2) + "</resultado>";
    }
    
    @POST
    @Path("division")
    @Produces(MediaType.TEXT_HTML)
    public String operacionDivision(@FormParam("num1") int numero1, @FormParam("num2") int numero2){
        
        return "<html>"
                + "<head>"
                + "<title>Operacion Divicion</title>"
                + "</head>"
                + "<body>"
                + "<h2>" + (numero1 / numero2) + "</h2>"
                + "</body>"
                + "</html>";
    }
}
