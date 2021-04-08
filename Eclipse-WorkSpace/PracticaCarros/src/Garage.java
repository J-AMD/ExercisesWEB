public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Familiar mom = new Familiar();
		Deportivo fast = new Deportivo();
		TodoTerreno dust = new TodoTerreno();
		
		System.out.println(mom.getMarca());
		mom.setMarca("Lambo");
		System.out.println(mom.getMarca());
		fast.setAleron("Fibra");
		System.out.println(fast.getAleron());
		System.out.println(dust.getMarca());
		
		
		System.out.println(mom.avanzar(5.1f));
		
	}

}
