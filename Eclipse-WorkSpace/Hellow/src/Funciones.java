
public class Funciones {
	
	public static void main(String[] args) {
		suma(1,2);
		miEmpanada("Fresa");
	}



	public static void suma(int num1, int num2) {
	
		int resultado= num1+num2;
		System.out.printf("El resultado es: %d", resultado);
		}
	////////////////////////////////////////////////////////
	
	public static void miEmpanada(String sabor) {
		
		System.out.printf("\nLa enpanada es de sabor "+ sabor);
	}
}
