
public class CiclosDoWhile {

	public static void main(String args[]) {
		System.out.println("Conteo regresivo con ciclo do while");
		
		int i=1000;
		do{
			System.out.println(i);
			i-=200;
		}while(i>=0);
		
		System.out.println("");
		System.out.println("Conteo regresivo con ciclo while");
		int j = 1000;
		while(j >= 0) {
			System.out.println(j);
			j-=200;
		}
		
		System.out.println("");
		System.out.println("Conteo regresivo con ciclo for");
		for(int x = 1000; x >= 0; x -= 200) {
			System.out.println(x);
		}
	}
}
