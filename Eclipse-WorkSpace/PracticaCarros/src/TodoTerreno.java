
public class TodoTerreno extends Coche{
	
private String traccion;
	
	public TodoTerreno() {};
	
	public TodoTerreno(int numSerie, String marca, int numCilindros, float rendimiento, float distancia, String traccion)
	{
		super(numSerie, marca, numCilindros, rendimiento, distancia);
		this.traccion = traccion;
	
	}
	
	public String getPuerta() {
		return traccion;
	}
	
	public void setPuerta(String puerta) {
		this.traccion = puerta;
	}
	
	@Override
	public float avanzar(float distancia) {
		return 0;
	}
	
	public float acelerar() {
		return 0;
	}

}
