public class Operacion {
	public static void main(String[] args)
	{
		System.out.println("Hellow World\n");
		
		float x=4, y=6, r;
		r=x+y;
		System.out.printf("la suma es %.2f\n",r);
		
		r=y-x;
		System.out.printf("La resta de los numero y - x = %.2f\n", r);
		r=x*y;
		System.out.printf("La multiplicacio de x*y es %.2f\n", r);
		r=x/y; 
		System.out.printf("La division de x/y es %.2f\n", r);
		r=x%y;
		System.out.printf("El resto de la division es %.2f", r);
		////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nValores flotantes estaticos");
		float fNumero1=3.1416f, fNumero2=12.2154f, fResultado;
		fResultado=fNumero1+fNumero2;
		System.out.printf("\nLa suma de los numeros flotantes es %f", fResultado);
		
	}
}