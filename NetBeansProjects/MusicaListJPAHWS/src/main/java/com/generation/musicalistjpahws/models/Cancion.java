/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.musicalistjpahws.models;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author felipon
 */
@Entity
@Table(schema="musicalist", name = "cancion")
public class Cancion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cancion")
    private int id;
    
    @OneToOne
    @JoinColumn(name="id_artista",insertable = false,updatable = false)
    private Artista artista;
    
    @Column(name="id_artista")
    private int id_artista;
    
    private String nombre;
    private int duracion;
    private int activo=1;
    
    @Column(name="fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
/*
    @ManyToMany(mappedBy="canciones")
    private List<Playlist> playlists;
            */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_artista() {
        return id_artista;
    }

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }
    
     public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    @Override
    public String toString() {
        return "Cancion{" + "id=" + id + ", id_artista=" + id_artista + ", nombre=" + nombre + ", duracion=" + duracion + ", activo=" + activo + ", fecharegistro=" + fecharegistro + '}';
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public Cancion() {
    }
}
