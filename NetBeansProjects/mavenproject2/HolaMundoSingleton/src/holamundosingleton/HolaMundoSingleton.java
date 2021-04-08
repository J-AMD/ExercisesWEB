/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundosingleton;

/**
 *
 * @author Jesus Martinez
 */
public class HolaMundoSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CapitanSinglenton barbaRoja = CapitanSinglenton.getInstance();
        
        System.out.println("Nombre: "+ barbaRoja.getNombre());
        System.out.println("Nombre: "+ barbaRoja.getNombrePerico());
        
        CapitanSinglenton.destroy();
        
        System.out.println("Nombre: "+ barbaRoja.getNombre());
        System.out.println("Nombre: "+ barbaRoja.getNombrePerico());
    }
    
}
