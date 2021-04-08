/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.sistemacita;

import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Jesus Martinez
 */

public class cita {
    
    private int idCita;
    private int idCliente;
    private int idServicio;
    private String nombreCliente;
    private String nombreServicio;
    private String fechaCita;
    private int statusCita;
    private String Comentarios;
    private String fechaRegistro;

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public int getStatusCita() {
        return statusCita;
    }

    public void setStatusCita(int statusCita) {
        this.statusCita = statusCita;
    }

    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }

    public String getComentarios() {
        return Comentarios;
    }
    
    
}
