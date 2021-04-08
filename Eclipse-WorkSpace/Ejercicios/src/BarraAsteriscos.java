//imprime el valor del array en cantidad de asteriscos
public class BarraAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {0, 0, 5, 2, 10, 20, 10, 5, 1};
		
		for(int i=0; i<array.length; i++) {
			
			for(int j=0; j<array[i]; j++)
				System.out.print("*");
			
			System.out.println("\n");
		}
		
	}

}
