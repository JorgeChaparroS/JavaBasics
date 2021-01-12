
public class CiclosFor {

	public static void main(String[] args) {
	
		//La variable del ciclo for se puede declarar dentro o fuera del ciclo.
		
		System.out.println("Conteo de 0 a 5");
		for(int i = 0; i <= 5; i++ ) { //Si solo utilizo la variable en el for, se puede declarar adentro. 
			System.out.print(i + ", ");
		}
		System.out.println("");
		System.out.println("");
		
		System.out.println("Conteo de 5 a 0");
		for(int j = 5; j >= 0; j--) {
			System.out.print(j + ", ");
		}
		System.out.println("");
		System.out.println("");
		
		System.out.println("Incremento de 5 en 5");
		for(int x = 0; x <= 30; x+=5) {
			System.out.print(x + ", ");
		}
		System.out.println("");
		System.out.println("");
		
		System.out.println("Decremento de 7 en 7");
		for(int t = 35; t >= 0; t-=7) {
			System.out.print(t + ", ");
		}

	}

}
