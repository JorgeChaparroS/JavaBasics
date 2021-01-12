package lavadorasamsung;
import lavadora.Lavadora;
import java.util.Scanner; 

public class LavadoraSamsung {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("La ropa es blanca o de color?"); 
		System.out.println("Presiona 1 para ropa blanca, o 2 para ropa de color.");
		int tipoRopa = entrada.nextInt(); 
		
		System.out.println("Cuántos kilos de ropa vas a lavar?"); 
		int kilos = entrada.nextInt(); 
		
		Lavadora mensaje = new Lavadora(kilos, tipoRopa);
		mensaje.setTipoRopa(2);
		System.out.println("El tipo de ropa es " + mensaje.getTipoRopa());
		mensaje.CicloFinalizado();
	}
}
