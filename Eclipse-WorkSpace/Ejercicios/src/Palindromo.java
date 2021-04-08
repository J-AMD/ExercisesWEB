import java.util.Scanner;

//Programa el cual te indica si la palabra u oracion es un palindromo
public class Palindromo {

	public static boolean checkPalindrome(String inputString) {
	    char[] copia = new char[inputString.length()]; 
	    int cont=0;
	    for(int i=0 ; i<inputString.length(); i++){
	    	copia[i]= inputString.charAt(inputString.length()-1-i);
	    	
	    	System.out.print(copia[i]);

	    	if(copia[i] == inputString.charAt(i))
	    		cont++;
	    }
	    
	    if(cont == inputString.length()) {
	    	System.out.println(true);
	    	return true;
	    }
	    else {
	    		System.out.println(false);
	    		return false;
	    	}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palindromo = "";
		Scanner scann = new Scanner(System.in);
		
		System.out.print("Ingrese el palindromo sis espacios: ");
		palindromo = scann.next();
		
		checkPalindrome(palindromo);

	}

}
