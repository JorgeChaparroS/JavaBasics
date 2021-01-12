package lavadora;

public class Lavadora {

	//El encapsulamiento se define inicialmente indicando que son tipo privado. 
	private int kilos = 0, tipoRopa = 0, llenadoCompleto = 0, lavadoCompleto = 0, secadoCompleto = 0; 
	
	public Lavadora(int kilos, int tipoRopa) {
		this.kilos = kilos; 
		this.tipoRopa = tipoRopa; 
	}
	
	private void Llenado() {
		if(kilos <= 12) {
			llenadoCompleto = 1; 
			System.out.println("Llenando...");
			System.out.println("Llenado completo.");
		}
		else {
			System.out.println("Pana, mucha ropa, saque un poquito, máximo 12Kgs");
		}
	}
	
	private void Lavado() {
		Llenado(); 
		if(llenadoCompleto == 1) {
			if(tipoRopa == 1) {
				System.out.println("Ropa blanca // Lavado suave");
				System.out.println("Lavando...");
				lavadoCompleto = 1; 
			}
			else if(tipoRopa == 2) {
				System.out.println("Ropa de color // Lavado intenso");
				System.out.println("Lavando...");
				lavadoCompleto = 1; 
			}
			else {
				System.out.println("El tipo de ropa no está disponible");
				System.out.println("Se lavará como ropa de color // Lavado intenso");
				System.out.println("Lavando...");
				lavadoCompleto = 1; 
			}
		}
	}
	
	private void Secado() {
		Lavado(); 
		if(lavadoCompleto == 1) {
			System.out.println("Secando...");
			System.out.println("Secado completo.");
			secadoCompleto = 1; 
		}
	}
	
	public void CicloFinalizado() {
		Secado(); 
		if(secadoCompleto == 1) {
			System.out.println("Papi, saque la ropa"); 
		}
	}
	
	/*
	 * Métodos Setter y Getter
	 */
	
	public int getTipoRopa() { //Se puede llamar como sea, pero para reconocer que es un método getter, se le da ese nombre
		return tipoRopa; 
	}
	
	public void setTipoRopa(int tipoRopa) {
		this.tipoRopa = tipoRopa; 
	}
}
