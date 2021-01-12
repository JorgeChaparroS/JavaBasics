
public class VectoresDinamicos {

	public static void main(String args[]) {
		int vector[] = new int[5];
		
		for(int i = 0; i < vector.length; i++) {
			vector[i] = i + 10;
			System.out.println("El registro " + i + " es igual a " + vector[i]);
		}
	}
}
