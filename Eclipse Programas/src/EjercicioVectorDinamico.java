import java.util.Scanner; 

public class EjercicioVectorDinamico {

	public static void main(String args[]) {
		Scanner Entrada = new Scanner(System.in);
		int numregistros = 0; 
		System.out.println("Indique el n�mero de espacios de su vector: ");
		numregistros = Entrada.nextInt();
		int vector[] = new int[numregistros];
		
		for(int i = 0; i < numregistros; i++) {
			System.out.println("Ingrese el n�mero a almacenar en la posici�n " + i);
			vector[i] = Entrada.nextInt();
			System.out.println("El valor almacenado en el registro " + i + " es " + vector[i]);
		}
	}
}
