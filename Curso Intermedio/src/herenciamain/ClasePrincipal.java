package herenciamain;
import herenciaoperaciones.ClaseHijaResta;
import herenciaoperaciones.ClaseHijaSuma;

public class ClasePrincipal {

	public static void main(String args[]) {
		ClaseHijaSuma mensajeroSuma = new ClaseHijaSuma(); 
		mensajeroSuma.PedirDatos();
		mensajeroSuma.Sumar();
		System.out.print("El resultado de la suma es: ");
		mensajeroSuma.MostrarResultado();
		
		ClaseHijaResta mensajeroResta = new ClaseHijaResta();
		mensajeroResta.PedirDatos();
		mensajeroResta.Restar();
		System.out.print("El resultado de la resta es: ");
		mensajeroResta.MostrarResultado();
	}
}
