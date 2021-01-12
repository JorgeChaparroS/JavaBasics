package programas;

import java.util.Scanner;

public class InversorPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = "", palabraInvertida = ""; 
		int longitud = 0; 
		Scanner Entrada = new Scanner(System.in); 
		
		System.out.println("Por favor ingrese su frase: "); 
		palabra = Entrada.nextLine(); 
		longitud = palabra.length();
		
		while(longitud != 0 ) {
			palabraInvertida += palabra.substring(longitud - 1, longitud); 
			longitud--; 
		}
		
		System.out.print("Frase invertida: \n" + palabraInvertida); 
		System.out.println("\n");
	}

}
