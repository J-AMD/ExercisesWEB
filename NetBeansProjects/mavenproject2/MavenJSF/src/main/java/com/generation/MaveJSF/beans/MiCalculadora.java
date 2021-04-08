/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.MaveJSF.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
//import javax.enterprise.context.Dependent;
//import javax.enterprise.context.RequestScoped;


/**
 *
 * @author Jesus Martinez
 */
@Named(value = "miCalculadora")
@SessionScoped
public class MiCalculadora implements Serializable{
    
    private List<Double> result;
    
    private double numero1;
    private double numero2;
    private double resultado;
    
    public MiCalculadora() {
        result = new ArrayList<>();
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }
    
    public List<Double> getResult() {
        return result;
    }

    public void setResult(List<Double> result) {
        this.result = result;
    }

    /**
     * Creates a new instance of MiCalculadora
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public String sumar(){
        resultado = numero1 + numero2;
        result.add(resultado);
        return "";
    }
    
    public String resta(){
        resultado = numero1 - numero2;
        result.add(resultado);
        return "";
    }
    
    public String multiplicacion(){
        resultado = numero1 * numero2;
        result.add(resultado);
        return "";
    }
    
    public String division(){
        resultado = numero1 / numero2;
        result.add(resultado);
        return "";
    }
    
    public String eliminarPar(){
        return "";
    }
}
