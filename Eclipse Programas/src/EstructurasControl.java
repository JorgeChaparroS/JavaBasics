import java.util.Scanner; 
public class EstructurasControl {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, resultado = 0, operacion=0; 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del primer n�mero: ");
		num1 = entrada.nextInt(); 
		System.out.println("Ingrese el valor del segundo n�mero: ");
		num2 = entrada.nextInt(); 
		
		System.out.println("Con los n�meros " + num1 + " y " + num2); 
				
		System.out.println("Indique la operaci�n que desea realizar: ");
		System.out.println("Ingrese el n�mero 1 para realizar suma.");
		System.out.println("Ingrese el n�mero 2 para realizar resta.");
		System.out.println("Ingrese el n�mero 3 para realizar multiplicaci�n.");
		System.out.println("Ingrese el n�mero 4 para realizar divisi�n.");
		
		operacion =  entrada.nextInt(); 
				
		switch(operacion) {
		case 1:
			resultado = num1 + num2; 
			System.out.println("La suma de los n�meros es: " + resultado);
			break; 
			
		case 2:
			resultado = num1 - num2; 
			System.out.println("La resta de los n�meros es: " + resultado);
			break; 
			
		case 3: 
			resultado = num1 * num2; 
			System.out.println("La multiplicaci�n de los n�meros es: " + resultado);
			break;  
			
		case 4: 
			resultado = num1 / num2; 
			System.out.println("La divisi�n de los n�meros es: " + resultado);
			break;
			
		default : 
			System.out.println("Error: La opci�n no existe");
			break; 	
		}
		
	}

}
