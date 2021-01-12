import javax.swing.*;
public class InterfacesGraficas extends JFrame {

	private JLabel label1; //Modificadores de acceso, tipo de dato (mostrar sin el outprintln) y nombre. 
	
	public InterfacesGraficas() { //Constructor, con mismo nombre a la clase. 
		setLayout(null); //Indicar con coordenadas en donde se mostarán los elementos
		label1= new JLabel("El programa de Jorge"); //Lo que quiero mostrar
		label1.setBounds(10,20,200,300); //Fija dimensiones y coordenadas. 
		add(label1);
	}
	
	public static void main(String args[]) {
		InterfacesGraficas formulario1 = new InterfacesGraficas();//Todo está enlazado. Se crea el objeto para mostrar la interfaz
		formulario1.setBounds(0,0,400,300);
		formulario1.setVisible(true); //Método para que se vea o no (false).
		formulario1.setLocationRelativeTo(null); //Interfaz en el centro de la pantalla
	}
}
