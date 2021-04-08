
public class OrdenamientoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {2, 1, 3, 100, 4, 2, 1, 88, 3, 99, 5, 3, 77, 3};
		int contenedor = 0;

			for(int i=0; i<num.length; i++){
				for(int j = i+1; j<num.length; j++) {
					if(num[i] > num[j]) {
						contenedor = num[i];
						num[i] = num[j];
						num[j] = contenedor;
					}
				}
			}

			for(int i=0; i<num.length;i++) {
				System.out.print(num[i]);
				if(i<num.length-1)
					System.out.print(", ");
			}
	}	

}
