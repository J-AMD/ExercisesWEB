import java.util.Scanner;
public class Biblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClaseLibro obj = new ClaseLibro();
		
		System.out.println("El nombre inicial del curso es "+obj.obtenerNombreCurso());
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese el nombre del libro: ");
		String nombre = scan.nextLine();
		obj.establecerNombreCurso(nombre);
		obj.mostarMensaje();

	}

}
