package area;

public class Rectangulo {

	private int base = 0, altura = 0, resultado = 0;
	
	public Rectangulo(int base, int altura) {
		this.base = base; 
		this.altura = altura; 
	}
	
	public void Operacion() {
		resultado = base * altura; 
	}
	
	public void Imprimir() {
		Operacion(); 
		System.out.println("El valor del área es: " + resultado); 
	}
}
