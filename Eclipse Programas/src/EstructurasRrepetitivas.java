
public class EstructurasRrepetitivas {

	public static void main(String args[]) {
		
		System.out.println("Siguiente conteo: 1,2,3,4,5,6,7,8,9,10");
		System.out.println("");
		System.out.println("Con el ciclo for: ");
		int i = 0;
		for(i = 0; i <= 10; i++) {
			if(i==10) {
				System.out.print(i);
			}
			
			else {
				System.out.print(i + ", ");
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Con el ciclo while: ");
		i = 0; 
		while(i <= 10) {
			if(i < 10) {
				System.out.print(i + ", ");
				i = i +1; 
			}
			
			else {
				System.out.print(i);
				i = i + 1;
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Con el ciclo do while: ");
		i = 0;
		do {
			if(i < 10) {
				System.out.print(i + ", ");
				i = i +1; 
			}
			
			else {
				System.out.print(i);
				i = i + 1;
			}
		}while(i <= 10);
		
		System.out.println("");
		System.out.println("");
		System.out.println("El siguiente conteo: 1, 99, 2, 98, 3, 97, 4, 96, 5, 95");
		System.out.println("Con el ciclo for: ");
		int j1 = 1, j2 = 99;
		for(j1 = 1; j1 <= 5; j1++) {
			if(j1 < 5) {
				System.out.print(j1 + ", " + j2 + ", ");
				j2 = j2 - 1;
			}
			
			else {
				System.out.print(j1 + ", " + j2);
				j2 = j2 - 1;
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Con el ciclo while: ");
		j1 = 1;
		j2 = 99; 
		while(j1 <= 5) {
			if(j1 < 5) {
				System.out.print(j1 + ", " + j2 + ", ");
				j1 = j1 + 1;
				j2 = j2 - 1;
			}
			
			else {
				System.out.print(j1 + ", " + j2);
				j1 = j1 + 1;
				j2 = j2 - 1;
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Con el ciclo do while: ");
		j1 = 1;
		j2 = 99; 
		do {
			if(j1 < 5) {
				System.out.print(j1 + ", " + j2 + ", ");
				j1 = j1 + 1;
				j2 = j2 - 1;
			}
			
			else {
				System.out.print(j1 + ", " + j2);
				j1 = j1 + 1;
				j2 = j2 - 1;
			}
		}while(j1 <= 5);
	}
}
