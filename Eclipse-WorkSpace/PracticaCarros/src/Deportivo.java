

public class Deportivo extends Coche{
	
private String aleron;
	
	public Deportivo() {};
	
	public Deportivo(int numSerie, String marca, int numCilindros, float rendimiento, float distancia, String aleron)
	{
		super(numSerie, marca, numCilindros, rendimiento, distancia);
		this.aleron = aleron;
	
	}
	
	public String getAleron() {
		return aleron;
	}
	
	public void setAleron(String aleron) {
		this.aleron = aleron;
	}
	
	@Override
	public float avanzar(float distancia) {
		return 0;
	}
	
	public float acelerar() {
		return 0;
	}

}
