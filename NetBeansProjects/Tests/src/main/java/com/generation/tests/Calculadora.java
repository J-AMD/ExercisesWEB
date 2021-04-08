/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.tests;

/**
 *
 * @author Jesus Martinez
 */
public class Calculadora {
    
    private int numero1;
    private int numero2;
    
    public Calculadora(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int suma(){
        return numero1 + numero2;
    }
    
    public int resta(){
        return numero1 - numero2;
    }
    
    public int multiplicacion(){
        return numero1 * numero2;
    }
    
    public int division(){
        return numero1 / numero2;
    }

}
