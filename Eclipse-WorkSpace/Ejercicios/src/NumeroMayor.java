
public class NumeroMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] serie = {-108,101,1,5,65,-102,100,8,41};
		int mayor = 0;
		
		for(int i = 0; i < serie.length-1; i++) {
			
			if(serie[i] > mayor)
				mayor = serie[i];
		}
		
		System.out.println(mayor);

	}

}
