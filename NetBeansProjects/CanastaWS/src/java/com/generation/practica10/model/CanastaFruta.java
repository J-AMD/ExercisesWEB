/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.practica10.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jesus Martinez
 */
public class CanastaFruta {
    
    private static List<Fruta> listaFrutas = new ArrayList<>();
    private static int numeroFrutas = 0;
    
    public static void agregarFruta(Fruta fruta){
        fruta.setId(++numeroFrutas);
        listaFrutas.add(fruta);
    }
    
    public static List<Fruta> obtenerFrutas(){
        return listaFrutas;
    }
    
    public static boolean eliminarFruta(int id){
        boolean eliminoFruta = false;
        for(Fruta fruta: listaFrutas){
            if(id==fruta.getId()){
                listaFrutas.remove(fruta);
                eliminoFruta = true;
                break;
            }
        }
        return eliminoFruta;
    }
    
    public void actualizarFruta(int id, float precio){
        
        for(Fruta fruta: listaFrutas){
            if(fruta.getId()==id){
                fruta.setPrecio(precio);
                break;
            }
        }
    }
    
    public static Fruta obtenerFruta(int id){
        Fruta frutaBuscada = null;
        for(Fruta fruta: listaFrutas){
            if(fruta.getId()== id){
                frutaBuscada = fruta;
                break;
            }
        }
        return null;
    }
}
