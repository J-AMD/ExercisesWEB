/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoestructuradedatos;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Jesus Martinez
 */
public class EstructuraDeDatos {

     public static void pruebaPilas(){
        
        Stack numeros = new Stack();
        
        numeros.push(1);
        numeros.push(2);
        numeros.push(3);
        numeros.push(4);
        numeros.push(5);
        
        System.out.println("Hola");
        System.out.println(numeros);
        
        numeros.pop();
        System.out.println(numeros);
        
        while(!numeros.empty()){
            numeros.pop();
            System.out.println(numeros);
        }
    }
    
    public static void pruebaPilaObjeto(){
        Plato platoPorccelana = new Plato(0, "porcelana");
        Plato platoPlastico = new Plato(1, "platico");
        Plato platoBarro = new Plato(2, "barro");
        
        Stack pilaPlatos = new Stack();
        
        pilaPlatos.push(platoPorccelana);
        pilaPlatos.push(platoBarro);
        pilaPlatos.push(platoPlastico);
        
        System.out.println(pilaPlatos);
    }
    
    public static class Plato{
        private int tamanio;
        private String material;
        
        public Plato(int tamanio, String material){
            this.tamanio = tamanio;
            this.material = material;
        }

        public int getTamanio() {
            return tamanio;
        }

        public void setTamanio(int tamanio) {
            this.tamanio = tamanio;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
        
        @Override
        public String toString(){
            return material;
        }
    }
    
    public static void main(String[] args) {
        // Estructura de datos
       // pruebaPilas();
        //pruebaPilaObjeto();
        //pruebaColas();
        //pruebaLinkedList();
        //imprimir();
        pruebaHasMap();
        
        
    }
    
    public static void pruebaColas(){
        Queue<String> colaTacos = new ArrayDeque();
        colaTacos.add("Febro");
        colaTacos.add("Esme");
        colaTacos.add("Rea");
        colaTacos.add("Mara");
        colaTacos.add("Rishi");
        
        String atendido = colaTacos.element();
        System.out.println("Esta comiendo tacos "+ atendido);
        
        colaTacos.poll();
        System.out.println(colaTacos);
        
        Iterator<String> iterator = colaTacos.iterator();
        while(iterator.hasNext()){
            String nombre = iterator.next();
            System.out.println("Se atendio a: " + nombre);
            colaTacos.poll();
            System.out.println(colaTacos);
        }
        /*
        for(String nombre: colaTacos){
            System.out.println("Se atendio a: " + nombre);
            colaTacos.poll();
            System.out.println(colaTacos);
        }
        */

    }
            public static void pruebaLinkedList(){
                LinkedList<Float> list = new LinkedList();
                
                list.add(99.5f);
                list.add(100.0f);
                list.add(80.7f);
                list.add(50.6f);
                list.add(80.0f);
                
                for(Float calificacion: list){
                    System.out.println("Calificacion: "+ calificacion);
                }
        }
            public static void imprimir(){
                Set<String> set = new HashSet();
                
                set.add("Uno");
                set.add("dos");
                set.add("Uno");
                set.add("Uno");
                set.add("Siete");
                set.add("Nueve");
                set.add("Mil");
                
                System.out.println(set);
            }
            
            public static void pruebaHasMap(){
                Map<String, String> contactos = new HashMap<>();
                contactos.put("Ama", "3242436731");
                contactos.put("Papa", "3338426219");
                contactos.put("Eduardo", "324243641");
                contactos.put("Emmanuel", "553654621");
                
                System.out.println(contactos);
            }
            
            public static void pruebaArbol(){
                
            }
}
