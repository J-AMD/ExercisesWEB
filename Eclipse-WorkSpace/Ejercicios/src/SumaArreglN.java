import java.util.Scanner;

public class SumaArreglN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 0;
		int suma = 0;
		
		System.out.println("Ingrese el tamaio de su arreglo: ");
		Scanner scan = new Scanner(System.in);
		tam = scan.nextInt();
		
		int[] serie = new int [tam];
		
		System.out.println("Ingrese los valores enteros del arreglo: ");
		
		for(int i = 0; i < tam; i++) {
			System.out.println("Valor para la posicion " + (i+1) + ": ");
			serie[i] = scan.nextInt();
			
			suma += serie[i]; 
		}
		
		System.out.println("La suma de su arreglo es: "+ suma);

	}

}
