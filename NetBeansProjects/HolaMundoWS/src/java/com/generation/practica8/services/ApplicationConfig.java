/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.practica8.services;


import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author Jesus Martinez
 */
@ApplicationPath("api") //Nombre de la ruta o servicio (npoint)
public class ApplicationConfig extends Application{
    
    @Override
    public Set<Class<?>> getClasses(){
        
        Set<Class<?>> resources = new HashSet<>();
        resources.add(com.generation.practica8.services.HolaMundoService.class);
        return resources;
    }
    
}
