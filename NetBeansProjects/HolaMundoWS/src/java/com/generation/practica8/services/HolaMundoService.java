/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.practica8.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Jesus Martinez
 */
@Path("mensaje")
public class HolaMundoService {
   
    @GET
    @Produces("text/plain")
    public String holaMundoMensaje(){
        
        return "Hola Febro";
    }
}
