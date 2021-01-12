import java.util.Scanner; 
public class OperadoresRelacionales {
	
	public static void main(String args[]) {
		//< Menor que
		//> Mayor que
		//== Igual que 
		//!= diferente que
		//<= menor o igual que
		//>= mayor o igual que
		
		//Operadores lógicos: 
		//&& AND
		//|| Or
		Scanner Entrada = new Scanner(System.in);
		String nombre = ""; 
		int clave = 0, antiguedad = 0; 
		
		System.out.println("********************************************");
		System.out.println("Bienvenido al sistema vacacional de CocaCola");
		System.out.println("********************************************");
		System.out.println("");
		System.out.println("");
		System.out.print("Por favor, indique el nombre del trabajador: "); 
		nombre = Entrada.nextLine();
		System.out.print("Indique el tipo de clave del empleado: "); 
		clave = Entrada.nextInt(); 
		System.out.print("Indique la antigüedad del empleado");
		antiguedad = Entrada.nextInt(); 
		System.out.println("Ya que el Sr/Sra " + nombre + " es un empleado de clave " + clave + " y tiene una antigüedad de " + antiguedad + " años,");
		
		if(clave == 1) {
			
			if(antiguedad == 1) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 6 días de vacaciones. ");
			}
			
			else if(antiguedad >= 2 && antiguedad <= 6) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 14 días de vacaciones. ");
			}
			
			else if(antiguedad >= 7) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 20 días de vacaciones. ");
			}
			
			else {
				System.out.println("El trabajador " + nombre + " no tiene derecho a vacaciones");
			}
		}
		
		else if(clave == 2) {
			
			if(antiguedad == 1) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 7 días de vacaciones. ");
			}
			
			else if(antiguedad >= 2 && antiguedad <= 6) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 15 días de vacaciones. ");
			}
			
			else if(antiguedad >= 7) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 22 días de vacaciones. ");
			}
			
			else {
				System.out.println("El trabajador " + nombre + " no tiene derecho a vacaciones");
			}
		}
		
		else if (clave == 3) {
			
			if(antiguedad == 1) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 10 días de vacaciones. ");
			}
			
			else if(antiguedad >= 2 && antiguedad <= 6) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 20 días de vacaciones. ");
			}
			
			else if(antiguedad >= 7) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 30 días de vacaciones. ");
			}
			
			else {
				System.out.println("El trabajador " + nombre + " no tiene derecho a vacaciones");
			}
		}
		
		else {
			System.out.println("ERROR: La clave de empleado debe ser 1, 2 o 3"); 
		}
		
	}

}
