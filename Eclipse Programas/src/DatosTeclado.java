import java.util.Scanner; //Librería para introducir datos desde el teclado
public class DatosTeclado {
	public static void main(String args[]){
		
        Scanner Entrada = new Scanner(System.in); //Variable que se ingresa desde teclado. 
     
        String nombre = "";
        int num1 = 0, num2 = 0, resultado = 0; 

        System.out.println("Cuál es tu nombre?");
        nombre = Entrada.nextLine(); //Se almacena en la variable después de dar enter. Esto en caso de que es entrada String
        System.out.println("Dame el primer valor para tu suma");
        num1 = Entrada.nextInt(); //Se almacena en la variable después de dar enter. Pero esto para datos numéricos. 
        System.out.println("Dame el segundo valor para tu suma"); 
        num2 = Entrada.nextInt();
        resultado = num1 + num2;
        System.out.println("Señor " + nombre + ", el resultado de la suma es:" + resultado);
    }
}
