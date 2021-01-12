
public class CiclosWhile {

	public static void main(String args[]) {
		int i = 1; 
		System.out.println("Este programa imprime un conteo de 1 a 9, en intervalos de 2 en 2");
		System.out.println("Con el ciclo while: ");
		while(i<10) {
			System.out.println(i);
			i = i + 2;  
		}
		
		System.out.println("Con el ciclo for: ");
		for(i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
	}
}
