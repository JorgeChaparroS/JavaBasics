
public class Fibonacci {

	public static void main(String args[]) {
		System.out.println("Sucesión de Fibonacci: ");
		System.out.println("0,1,1,2,3,5,8,13,21,34...");
		int a = 0, b = 1, c = 0; 
		System.out.println("Sucesión con ciclo For: ");
		for(int i = 0; i <= 9; i++) {
			if(i < 9) {
				System.out.print(a + ", ");
				c = a + b; 
				a = b;
				b = c; 
			}
			
			else {
				System.out.print(a + "...");
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Sucesión con ciclo While: ");
		a = 0;
		b = 1;
		c = 0;
		int j = 0;
		while(j < 10) {
			if(j < 9) {
				System.out.print(a + ", ");
				c = a + b; 
				a = b;
				b = c; 
			}
			
			else {
				System.out.print(a + "...");
			}
			
			j++;
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Sucesión con ciclo Do While: ");
		a = 0;
		b = 1;
		c = 0;
		j = 0;
		do {
			if(j < 9) {
				System.out.print(a + ", ");
				c = a + b; 
				a = b;
				b = c; 
			}
			
			else {
				System.out.print(a + "...");
			}
			
			j++;
		}while(j < 10);
	}
}
