import java.util.Scanner; 

public class MetodoEquals {

	public static void main(String args[]) {
		
		String nombre1 = "", nombre2 = ""; 
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Ingrese el nombre: "); 
		nombre1 = Entrada.nextLine();
		System.out.println("Ingrese el nombre: "); 
		nombre2 = Entrada.nextLine();
		
		if(nombre1.equals(nombre2)) { //El m�todo equals se usa para comparar dos variables de tipo string.
			System.out.println("Los nombres coinciden. Ambos son " + nombre1);
		}
		
		else {
			System.out.println("Los nombres no coinciden. Ellos son " + nombre1 + " y " + nombre2);
		}
		
		nombre1 = "";
		nombre2 = "";
		System.out.println("Para esta comparaci�n, no importan las may�sculas ni min�sculas"); 
		System.out.println("Ingrese el nombre: "); 
		nombre1 = Entrada.nextLine();
		System.out.println("Ingrese el nombre: "); 
		nombre2 = Entrada.nextLine();
		if(nombre1.equalsIgnoreCase(nombre2)) { //El m�todo equalsIgnoreCase se usa para comparar dos variables de tipo string sin importar may�sculas ni min�sculas.
			System.out.println("Los nombres coinciden.");
		}
		
		else {
			System.out.println("Los nombres no coinciden. Ellos son " + nombre1 + " y " + nombre2);
		}
		
	}
}
