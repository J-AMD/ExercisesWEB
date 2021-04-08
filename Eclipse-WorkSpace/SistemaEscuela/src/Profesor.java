
public class Profesor {
	
	private int iMatricula;
	private String sNombre;
	private float fSueldo;
	
	public Profesor() {}
	public Profesor(int iMatricula, String sNombre, float fSueldo) {
		this.iMatricula = iMatricula;
		this.sNombre = sNombre;
		this.fSueldo = fSueldo;
	}
	
	public int getMatricula() {
		return iMatricula;
	}
	
	public String getNombre() {
		return sNombre;
	}
	
	public float getSueldo() {
		return fSueldo;
	}
	
	public void setMatricula(int iMatricula) {
		this.iMatricula = iMatricula;
	}
	
	public void setNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	
	public void setSueldo(float fSueldo) {
		this.fSueldo = fSueldo;
	}

}
