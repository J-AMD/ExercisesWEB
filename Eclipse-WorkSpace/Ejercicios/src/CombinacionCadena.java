
public class CombinacionCadena {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Tom";
		int tam = ((word.length()) * (word.length()-1));
		String arrayString[] = new String[tam];
		
		for(int i=0; i<word.length(); i++) {

			for(int j=0; j<word.length(); j++) {
				arrayString[i] += word.charAt(j);
			}
		}

	}

}
