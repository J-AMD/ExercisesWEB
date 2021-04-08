/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.MaveJSF.beans;

import java.io.Serializable;
//import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Jesus Martinez
 */
@Named(value = "mensajeSaludo")
@SessionScoped
public class MensajeSaludo implements Serializable{

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    /**
     * Creates a new instance of MensajeSaludo
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    private String nombre;
    private String mensaje;
    
    public MensajeSaludo() {
    }
    
    public String saludo(){
        mensaje += "Hola "+ nombre;
        
        return "";
    }
}
