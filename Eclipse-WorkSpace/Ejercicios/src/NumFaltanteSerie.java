//Serie del 1 al 10 y encuentra el numero faltante
public class NumFaltanteSerie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int serie[] = {1,2,3,4,5,6,7,8,9,10};
		int suma = 0;
		
		for(int i = 0; i<serie.length; i++) {
			suma += serie[i];
			System.out.println("Numero: "+ serie[i]+" Indice: "+ i);
		}
		
		System.out.println("El numero faltante es: "+ (55-suma));

	}

}
