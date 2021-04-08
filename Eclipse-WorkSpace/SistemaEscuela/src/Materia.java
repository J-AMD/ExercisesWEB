
public class Materia {
	
		private String sClave;
		private String sNombre;
		private int iCreditos;
		private String sHoras;
	
	public Materia() {}
	public Materia(String sClave, String sNombre, int iCreditos, String sHoras) {
		this.sClave = sClave;
		this.sNombre = sNombre;
		this.iCreditos = iCreditos;
		this.sHoras = sHoras;
	}
		
	public String getClave() {
		return sClave;
	}
	
	public String getNombre() {
		return sNombre;
	}
	
	public int getCreditos() {
		return iCreditos;
	}
	
	public String getHoras() {
		return sHoras;
	}
	
	public void setClave(String sClave) {
		this.sClave = sClave;
	}
	
	public void setNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public void setCreditos(int iCreditos) {
		this.iCreditos = iCreditos;
	}
	
	public void setHoras(String sHoras) {
		this.sHoras = sHoras;
	}

}
