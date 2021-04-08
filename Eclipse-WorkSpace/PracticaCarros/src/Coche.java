
public class Coche { //////////////////////////////////////////////////////////////////////Clase padre
	
	protected int numSerie;
	protected String marca;
	protected int numCilindros;
	protected float rendimiento;
	protected float distancia;
	protected String pago;
	
	public Coche() {};
	
	public Coche(int numSerie, String marca, int numCilindros, float rendimiento, float distancia) {
		
		this.numSerie= numSerie;
		this.marca = marca;
		this.numCilindros = numCilindros;
		this.rendimiento = rendimiento;
		this.distancia = distancia;

	}
	//////////////////////////////////////////////////////////////////////////////GET & SET
	public int getNumSerie() {
		return numSerie;
	}
	
	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca= marca;
	}
	
	public int getNumCilindros() {
		return numCilindros;
	}
	
	public void setNumCilindros(int numCilindros) {
		this.numCilindros = numCilindros;
	}
	
	public float getRendimiento() {
		return rendimiento;
	}
	
	public void setRendimiento(int rendimiento) {
		this.rendimiento = rendimiento;
	}
	
	public float getDistancia() {
		return distancia;
	}
	
	public void setNumSerie(float distancia) {
		this.distancia = distancia;
	}
	///////////////////////////////////////////////////////////////////////////Metodos
	public float avanzar(float distancia) {
		return 0;
	}
	
	public float acelerar(float distancia) {
		return 0;
	}
	
	public String getPago() {
		return pago;
	}
	
	public void setPago(String pago) {
		this.pago = pago;
	}

}
