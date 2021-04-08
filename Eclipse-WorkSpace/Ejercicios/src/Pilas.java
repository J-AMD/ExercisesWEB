import java.util.Stack;

public class Pilas {
	
	public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");
        pruebaPilas();
        pruebaPilaObjeto();
        
        
    }
    
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

}
