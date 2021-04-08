
public class ClaseLibro {
	
	private String nombreCurso;
	
	public ClaseLibro(){};
	
	public ClaseLibro(String nombreCurso) {
		this.nombreCurso = nombreCurso;
		
	}
	
	public void establecerNombreCurso(String nombre) {
		this.nombreCurso = nombre;
	}
	
	public String obtenerNombreCurso() {
		return nombreCurso;
	}
	public void mostarMensaje() {
		System.out.println("Bienvenido al libro de calficaciones para "+ obtenerNombreCurso());
	}

}
