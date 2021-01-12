
public class MatricesDinamicas {

	public static void main(String[] args) {

		int filas = 3, columnas = 3, contador = 1; 
		int numeros[][] = new int[filas][columnas];
		for(int j = 0; j < filas; j++) {
			for(int i = 0; i < columnas; i++) {
				numeros[j][i] = contador; 
				contador++;
				System.out.print("[" + numeros[j][i] + "]");
			}
			System.out.println(""); 
		}
	}

}
