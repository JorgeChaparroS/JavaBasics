import java.util.Scanner; 

public class ManipulacionCadenaCaracteres {

	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in); 
		String cadena1 = "";
		String cadena2 = ""; 
		int num1 = 0, num2 = 0, numm = 0;
		System.out.println("Ingrese la cadena de caracteres"); 
		cadena1 = Entrada.nextLine();
		numm = cadena1.length();
		System.out.println("La cadena " + cadena1 + " tiene " + numm + " caracteres.");
		System.out.println("Indique el intervalo que quiere recortar: ");
		System.out.println("Ingrese el primer valor del intervalo: ");
		num1 = Entrada.nextInt();
		System.out.println("Ingrese el segundo valor del intervalo: ");
		num2 = Entrada.nextInt();
		cadena2 = cadena1.substring(num1, num2);
		System.out.println("Del intervalo se extrajo: " + cadena2);
		
	}

}
