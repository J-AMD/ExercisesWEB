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
public class CapitanSinglenton {
    
    private static CapitanSinglenton instance = null;
    
    private String nombre;
    private String nombrePerico;
    
    private CapitanSinglenton(){}
    
       public CapitanSinglenton(String nombre, String nombrePerico) {
        this.nombre = nombre;
        this.nombrePerico = nombrePerico;
    }
    
       public static CapitanSinglenton getInstance(){
           if(instance == null){
               instance = new CapitanSinglenton("Barba roja", "Cheft");
           }
           
           return instance;
       }
       
       public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePerico() {
        return nombrePerico;
    }

    public void setNombrePerico(String nombrePerico) {
        this.nombrePerico = nombrePerico;
    }
    
    public static void destroy(){
        instance = null;
    }
}
