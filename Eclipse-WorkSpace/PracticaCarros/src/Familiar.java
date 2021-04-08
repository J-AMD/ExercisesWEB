
public class Familiar extends Coche { // La clase Familiar hereda los atributos de la clase Coche con "extends"
	
	private String puerta;
	
	public Familiar() {};
	
	public Familiar(int numSerie, String marca, int numCilindros, float rendimiento, float distancia, String puerta)
	{
		super(numSerie, marca, numCilindros, rendimiento, distancia);
		this.puerta = puerta;
	
	}
	
	public String getPuerta() {
		return puerta;
	}
	
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	
	@Override             //////////////////////////////Arriba del metodo a sobreescribirse
	public float avanzar(float distancia) {
		return distancia;
	}
	
	public float acelerar() {
		return 0;
	}

}
