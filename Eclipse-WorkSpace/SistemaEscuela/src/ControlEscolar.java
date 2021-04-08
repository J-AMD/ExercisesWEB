
public class ControlEscolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alum1 = new Alumno();
		Alumno alum2 = new Alumno(6, "Carlo", "Ramirez", 6, 'B', 7.4f);
		Materia mat = new Materia("1M23485", "Fisica", 16, "3hrs");
		
		//System.out.println(alum1.getNombre());
		//System.out.println(alum2.getNombre());

		//alum1.setNombre("Pepe");
		
		//System.out.println(alum1.getNombre());
		mat.setNombre("Espanol");
		System.out.println(mat.getNombre());
	}

}
