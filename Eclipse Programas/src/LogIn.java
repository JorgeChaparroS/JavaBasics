import java.util.Scanner; 

public class LogIn {

	public static void main(String[] args) {
		
		String usuario = "", contrasena = ""; 
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Ingrese el usuario: "); 
		usuario = Entrada.nextLine();
		System.out.println("Ingrese la contrasena: "); 
		contrasena = Entrada.nextLine();
		
		if(usuario.equals("jorge") && contrasena.equals("0000")) {
			System.out.println("Bienvenido, señor " + usuario);
		}
		
		else {
			System.out.println("Verifque el usuario o contraseña.");
		}
	}
}