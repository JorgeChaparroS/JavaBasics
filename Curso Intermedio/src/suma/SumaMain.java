package suma;
import java.util.Scanner; 

public class SumaMain {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el valor de la primer variable: ");
		int num1 = entrada.nextInt(); 
		System.out.println("Ingrese el valor de la segunda variable: ");
		int num2 = entrada.nextInt(); 
		
		Suma valores = new Suma(num1, num2); 
		valores.Imprimir();
	}
}
