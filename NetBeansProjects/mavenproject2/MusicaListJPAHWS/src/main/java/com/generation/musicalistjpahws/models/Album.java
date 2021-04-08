/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.musicalistjpahws.models;

/**
 *
 * @author Jesus Martinez
 */
public class Album {
    
    private int id;
    private int id_Artista;
    private String titulo;
    private int num_Canciones;
    private int anio;
    private String imagen_url;
    private int activo;
    private String fecha_Registro;

    public Album() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Artista() {
        return id_Artista;
    }

    public void setId_Artista(int id_Artista) {
        this.id_Artista = id_Artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNum_Canciones() {
        return num_Canciones;
    }

    public void setNum_Canciones(int num_Canciones) {
        this.num_Canciones = num_Canciones;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getImagen_url() {
        return imagen_url;
    }

    public void setImagen_url(String imagen_url) {
        this.imagen_url = imagen_url;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String getFecha_Registro() {
        return fecha_Registro;
    }

    public void setFecha_Registro(String fecha_Registro) {
        this.fecha_Registro = fecha_Registro;
    }
}
