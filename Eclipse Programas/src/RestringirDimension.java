import javax.swing.*;

public class RestringirDimension extends JFrame {
	
	public RestringirDimension() { //Constructor público para que el JFrame pueda acceder a él
		//Elementos que voy a poner en la interfaz gráfica
		setLayout(null); //
	}

	public static void main(String[] args) {

		RestringirDimension formulario1 = new RestringirDimension(); //No puedo crear un objeto de tipo JFrame, por eso es de tipo de la clase
		formulario1.setBounds(0, 0, 400, 550);//Coordenadas y dimensiones de la interfaz
		formulario1.setVisible(true); 
		formulario1.setLocationRelativeTo(null);//Interfaz en la mitad sin importar coordenadas anteriores
		formulario1.setResizable(false); //Evita modificar las dimensiones a la interfaz
	
	}

}
