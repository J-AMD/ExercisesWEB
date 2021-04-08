/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.practica10.model;

/**
 *
 * @author Jesus Martinez
 */
public class Fruta {
    
    private int id;
    private String nombre;
    private String color;
    private float peso;
    private float precio;
    
    public Fruta(int id, String nombre, String color, float peso, float precio){
        this.id=id;
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.precio = precio;
    }
    
    public Fruta(String nombre, String color, float peso, float precio){
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "{ \"id\":" + id
                + ", \"nombre\" \"" + nombre +"\""
                +", \"color\": \"" + color 
                +", \"peso\": \"" + peso
                +", \"precio\": \"" + precio + "}";
    }
}
