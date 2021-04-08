
public class Alumno {
	
	private int iMatricula; //numero de ID en la escuela
	private String sNombre;
	private String sApellidos;
	private int stGrado;
	private char cGrupo;
	private float fPromedio;
	
	public Alumno() {}///////Constructor vacio declara el constructor
	public Alumno(int iMatricula, String sNombre, String sApellidos, int stGrado, char cGrupo, float fPromedio) {
		this.iMatricula = iMatricula;
		this.sNombre = sNombre;
		this.sApellidos = sApellidos;
		this.stGrado = stGrado;
		this.cGrupo = cGrupo;
		this.fPromedio = fPromedio;
	}///////Constructor nos permite encapsular la información
	
	public Alumno(int iMatricula, String sNombre, String sApellidos) {
		this.iMatricula = iMatricula;
		this.sNombre = sNombre;
		this.sApellidos = sApellidos;

	}///////Constructor nos permite un alumno nuevo ingreso sin mas datos

	public int getMatricula() {
		return iMatricula;
	}
	public String getNombre() {
		
		return sNombre;
	}
	
	public String getApelllidos() {
		return sApellidos;
	}

	public int getGrado() {
		return stGrado;
	}
	
	public char getGrupo() {
		return cGrupo;
	}
	
	public float getCalificacion() {
		return fPromedio;
	}

	public void setMatricula(int iMatricula) {
		this.iMatricula = iMatricula;
	}
	
	public void setNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	
	public void setApellidos(String sApellidos) {
		this.sApellidos = sApellidos;
	}
	
	public void setGrado(int stGrado) {
		this.stGrado = stGrado;
	}
	
	public void setGrupo(char cGrupo) {
		this.cGrupo = cGrupo;
	}
	
	public void setCalificacion(float fPromedio) {
		this.fPromedio = fPromedio;
	}
}
