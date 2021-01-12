import java.util.Scanner;

public class Vectores {

	public static void main(String args[]) {
		//Unidimensional --> Vector
		//Bidimensional --> Matriz
		Scanner Entrada = new Scanner(System.in);
		
		int vector[] = new int[5]; //Estructura para crear vectores. 
		vector[0] = 0;
		vector[1] = 0;
		vector[2] = 0;
		vector[3] = 0;
		vector[4] = 0;
		
		System.out.println("Ingrese la posición 0 del vector: ");
		vector[0] = Entrada.nextInt();
		System.out.println("Ingrese la posición 1 del vector: ");
		vector[1] = Entrada.nextInt();
		System.out.println("Ingrese la posición 2 del vector: ");
		vector[2] = Entrada.nextInt();
		System.out.println("Ingrese la posición 3 del vector: ");
		vector[3] = Entrada.nextInt();
		System.out.println("Ingrese la posición 4 del vector: ");
		vector[4] = Entrada.nextInt();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("La posición " + i + " del vector es " + vector[i]);
		}
	}
}
