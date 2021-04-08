//Retornar el producto mayor adyascente de una arreglo de enteros
public class ProductoAdyascente {
	
	public static void main(String[] args) {
		
		int[] inputArray = {3, 6, -2, -5, 7, 3};
		int suma[] = new int[inputArray.length];
	    int mayor = 0;
	    
	    for(int i=0; i < inputArray.length-1; i++){
	        
	       mayor = suma[i] = inputArray[i] * inputArray[i+1];
	        
	    }
	    
	    for(int i = 0; i<suma.length-1;i++){
	        
	        if(suma[i] > mayor)
	            mayor = suma[i];
	    }
	    
	    System.out.println(mayor);
	}

}
