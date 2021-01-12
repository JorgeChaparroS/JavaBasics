import java.util.Scanner; 
public class EstructurasControl {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, resultado = 0, operacion=0; 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del primer número: ");
		num1 = entrada.nextInt(); 
		System.out.println("Ingrese el valor del segundo número: ");
		num2 = entrada.nextInt(); 
		
		System.out.println("Con los números " + num1 + " y " + num2); 
				
		System.out.println("Indique la operación que desea realizar: ");
		System.out.println("Ingrese el número 1 para realizar suma.");
		System.out.println("Ingrese el número 2 para realizar resta.");
		System.out.println("Ingrese el número 3 para realizar multiplicación.");
		System.out.println("Ingrese el número 4 para realizar división.");
		
		operacion =  entrada.nextInt(); 
				
		switch(operacion) {
		case 1:
			resultado = num1 + num2; 
			System.out.println("La suma de los números es: " + resultado);
			break; 
			
		case 2:
			resultado = num1 - num2; 
			System.out.println("La resta de los números es: " + resultado);
			break; 
			
		case 3: 
			resultado = num1 * num2; 
			System.out.println("La multiplicación de los números es: " + resultado);
			break;  
			
		case 4: 
			resultado = num1 / num2; 
			System.out.println("La división de los números es: " + resultado);
			break;
			
		default : 
			System.out.println("Error: La opción no existe");
			break; 	
		}
		
	}

}
