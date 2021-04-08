import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int operacion, num1, num2, result;
		
		System.out.println("**************CALCULADORA************\nIngresa un numero: ");
		num1=scanner.nextInt();
		System.out.println("\nIngrese el segundo valor: \n");
		num2=scanner.nextInt();
		System.out.println("\n\nElige tu operacion\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n5.Modulo\n");
		operacion = scanner.nextInt();
		scanner.close();
		
		switch (operacion) {
			case 1: result=num1+num2;
					System.out.printf("\nEL resultado de la suma es: %d", result);
				
				break;
			case 2: result=num1-num2;
			System.out.printf("\nEL resultado de la resta es: %d", result);
		
				break;
				
			case 3: result=num1*num2;
			System.out.printf("\nEL resultado de la multiplicacion es: %d", result);
		
				break;
				
			case 4: result=num1/num2;
			System.out.printf("\nEL resultado de la division es: %d", result);
		
				break;
				
			case 5: result=num1%num2;
			System.out.printf("\nEL resultado del modulo es: %d", result);
		
				break;
	
			default: if(operacion >5 || operacion <1)
						System.out.println("\nNo existe esa operacion, intenta de nuevo\n");
				break;
		}
		
	}

}
