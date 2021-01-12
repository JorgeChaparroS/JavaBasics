package suma;

public class Suma {

	private int v1=0, v2=0, resultado=0; 
	
	public Suma(int num1, int num2) {
		this.v1 = num1; 
		this.v2 = num2; 
	}
	
	public void Operacion() {
		resultado = v1 + v2; 
	}
	
	public void Imprimir() {
		Operacion(); 
		System.out.println("El resultado de la suma es: " + resultado);
	}
}
